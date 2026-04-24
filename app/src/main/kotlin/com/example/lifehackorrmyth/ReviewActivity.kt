package com.example.lifehackorrmyth

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val reviewRecyclerView = findViewById<RecyclerView>(R.id.reviewRecyclerView)
        reviewRecyclerView.layoutManager = LinearLayoutManager(this)
        reviewRecyclerView.adapter = ReviewAdapter(QuestionData.getQuestions())
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, ReviewActivity::class.java)
    }
}
