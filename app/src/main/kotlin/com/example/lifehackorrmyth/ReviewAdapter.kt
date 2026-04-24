package com.example.lifehackorrmyth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewAdapter(private val questions: List<Question>) :
    RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder>() {

    inner class ReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val statementTextView: TextView = itemView.findViewById(R.id.statementTextView)
        private val answerTextView: TextView = itemView.findViewById(R.id.answerTextView)
        private val explanationTextView: TextView = itemView.findViewById(R.id.explanationTextView)

        fun bind(question: Question) {
            val context = itemView.context
            val answerLabel = context.getString(
                if (question.isHack) R.string.answer_hack else R.string.answer_myth
            )

            statementTextView.text = context.getString(
                R.string.review_question_format,
                question.id,
                question.statement
            )
            answerTextView.text = context.getString(R.string.review_answer_format, answerLabel)
            explanationTextView.text = context.getString(
                R.string.review_explanation_format,
                question.explanation
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_review, parent, false)
        return ReviewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        holder.bind(questions[position])
    }

    override fun getItemCount(): Int = questions.size
}
