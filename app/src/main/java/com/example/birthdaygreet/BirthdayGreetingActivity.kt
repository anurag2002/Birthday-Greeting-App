package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"     //by using companion object we can make all the variable static
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val birthdayGreeting: TextView = findViewById(R.id.birthdayGreeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text = "Happy Birthday\n$name!"
    }
}