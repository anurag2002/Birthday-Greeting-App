package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.graphics.createBitmap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        val nameInput: EditText = findViewById(R.id.nameInput)

        val intent = Intent(this, BirthdayGreetingActivity::class.java)

        val name = nameInput.editableText.toString()
        //Intent is the technique of going from one process to another
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}