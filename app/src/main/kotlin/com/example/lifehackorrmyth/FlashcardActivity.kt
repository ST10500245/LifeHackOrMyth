package com.example.lifehackorrmyth

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class FlashcardActivity : AppCompatActivity() {
    private var currentQuestionIndex = 0
    private var score = 0
    private val questions = QuestionData.getQuestions()

    private lateinit var questionProgressTextView: TextView
    private lateinit var questionTextView: TextView
    private lateinit var feedbackTextView: TextView
    private lateinit var hackButton: Button
    private lateinit var mythButton: Button
    private lateinit var nextButton: Button

    private var hasAnsweredCurrentQuestion = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        questionProgressTextView = findViewById(R.id.questionProgressTextView)
        questionTextView = findViewById(R.id.questionTextView)
        feedbackTextView = findViewById(R.id.feedbackTextView)
        hackButton = findViewById(R.id.hackButton)
        mythButton = findViewById(R.id.mythButton)
        nextButton = findViewById(R.id.nextButton)

        hackButton.setOnClickListener { submitAnswer(userPickedHack = true) }
        mythButton.setOnClickListener { submitAnswer(userPickedHack = false) }
        nextButton.setOnClickListener { showNextQuestionOrScore() }

        showQuestion()
    }

    private fun showQuestion() {
        val currentQuestion = questions[currentQuestionIndex]

        questionProgressTextView.text = getString(
            R.string.question_progress,
            currentQuestionIndex + 1,
            questions.size
        )
        questionTextView.text = currentQuestion.statement
        feedbackTextView.text = ""
        setAnswerButtonsEnabled(isEnabled = true)
        nextButton.isEnabled = false
        hasAnsweredCurrentQuestion = false
    }

    private fun submitAnswer(userPickedHack: Boolean) {
        if (hasAnsweredCurrentQuestion) {
            return
        }

        hasAnsweredCurrentQuestion = true
        val currentQuestion = questions[currentQuestionIndex]
        val answeredCorrectly = userPickedHack == currentQuestion.isHack

        if (answeredCorrectly) {
            score++
            feedbackTextView.text = getString(R.string.correct_feedback)
            feedbackTextView.setTextColor(
                ContextCompat.getColor(this, android.R.color.holo_green_dark)
            )
        } else {
            feedbackTextView.text = getString(R.string.incorrect_feedback)
            feedbackTextView.setTextColor(
                ContextCompat.getColor(this, android.R.color.holo_red_dark)
            )
        }

        setAnswerButtonsEnabled(isEnabled = false)
        nextButton.isEnabled = true
    }

    private fun showNextQuestionOrScore() {
        currentQuestionIndex++
        if (currentQuestionIndex < questions.size) {
            showQuestion()
            return
        }

        showScoreScreen()
    }

    private fun setAnswerButtonsEnabled(isEnabled: Boolean) {
        hackButton.isEnabled = isEnabled
        mythButton.isEnabled = isEnabled
    }

    private fun showScoreScreen() {
        startActivity(ScoreActivity.createIntent(this, score, questions.size))
        finish()
    }
}
