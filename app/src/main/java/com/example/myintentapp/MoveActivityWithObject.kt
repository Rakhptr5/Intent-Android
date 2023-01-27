package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveActivityWithObject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        if(intent !=null){
            val tvObject : TextView = findViewById(R.id.tv_object)
            val manusia : Person? = intent.getParcelableExtra(EXTRA_PERSON)
            val name :String? = manusia?.name
            val email: String? = manusia?.email
            val city:String? = manusia?.city
            val text = "Name : $name,Email : $email,City :$city"
            tvObject.setText(text)
        }
    }
    companion object{
        const val EXTRA_PERSON = "extra_person"
    }
}