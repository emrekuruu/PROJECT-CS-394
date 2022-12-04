package com.example.project_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.project_1.adapter.TeamAdapter
import com.example.project_1.data.PlayerDataSource
import com.example.project_1.data.TeamDataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        val players = PlayerDataSource(this).loadPlayers()
        val teams = TeamDataSource(this).loadTeams()
        recyclerView.adapter =TeamAdapter(teams)

    }
}