package com.examples.appbasics

import android.content.Intent
import android.content.Intent.ACTION_SEND
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

const val EXTRA_MESSAGE = "You won a  lottery $$$$"
class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    /** Called when the user taps the Send button */
     fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            action = ACTION_SEND
            putExtra(EXTRA_MESSAGE, message)
            type = "text/bold"
        }
        startActivity(intent)
    }


}