package com.example.lifehackorrmyth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.startButton).setOnClickListener { launchQuiz() }
    }

    private fun launchQuiz() {
        startActivity(Intent(this, FlashcardActivity::class.java))
    }
}
