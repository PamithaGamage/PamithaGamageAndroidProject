package com.example.loginpage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var subjects =
        arrayOf("Python Programing", "Cyber Security", "Java Script", "Artificial Intelligence")
    private var lecturers = arrayOf("Jason Vu", "Sanjula Gomes", "Chanudi D", "Pamitha G")
    private var dates = arrayOf("Mon/Tue/Thu", "Tue/Wed/Thu", "Tue/Wed/Thu", "Mon/Tue/Thu")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return subjects.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.subjectName.text = subjects[position]
        holder.lecturer.text = lecturers[position]
        holder.schedule.text = dates[position]
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var subjectName: TextView
        var lecturer: TextView
        var schedule: TextView

        init {
            subjectName = itemView.findViewById(R.id.subject_name)
            lecturer = itemView.findViewById(R.id.lecturer)
            schedule = itemView.findViewById(R.id.schedule)
        }


    }

}