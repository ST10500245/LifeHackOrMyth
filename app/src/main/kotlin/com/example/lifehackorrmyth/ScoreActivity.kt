package com.example.lifehackorrmyth

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra(EXTRA_SCORE, 0)
        val totalQuestions = intent.getIntExtra(EXTRA_TOTAL_QUESTIONS, 0)

        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        val feedbackTextView = findViewById<TextView>(R.id.feedbackTextView)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val restartButton = findViewById<Button>(R.id.restartButton)

        scoreTextView.text = getString(R.string.score_summary, score, totalQuestions)
        feedbackTextView.text = getScoreFeedback(score, totalQuestions)

        reviewButton.setOnClickListener { startActivity(ReviewActivity.createIntent(this)) }
        restartButton.setOnClickListener { restartQuiz() }
    }

    private fun getScoreFeedback(score: Int, totalQuestions: Int): String {
        if (totalQuestions == 0) {
            return getString(R.string.score_feedback_try_again)
        }

        val percentage = (score * 100) / totalQuestions
        return when {
            percentage >= 90 -> getString(R.string.score_feedback_master)
            percentage >= 70 -> getString(R.string.score_feedback_great)
            percentage >= 50 -> getString(R.string.score_feedback_good)
            else -> getString(R.string.score_feedback_try_again)
        }
    }

    private fun restartQuiz() {
        startActivity(
            Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            }
        )
        finish()
    }

    companion object {
        private const val EXTRA_SCORE = "com.example.lifehackorrmyth.extra.SCORE"
        private const val EXTRA_TOTAL_QUESTIONS = "com.example.lifehackorrmyth.extra.TOTAL_QUESTIONS"

        fun createIntent(context: Context, score: Int, totalQuestions: Int): Intent {
            return Intent(context, ScoreActivity::class.java).apply {
                putExtra(EXTRA_SCORE, score)
                putExtra(EXTRA_TOTAL_QUESTIONS, totalQuestions)
            }
        }
    }
}
