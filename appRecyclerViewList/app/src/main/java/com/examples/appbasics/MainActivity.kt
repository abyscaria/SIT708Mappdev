package com.examples.appbasics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


//const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {
    //private lateinit var frindsListView ListView
    //val textView: TextView = findViewById(R.id.textView)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize data.
        val myFriendsData = Friends().loadFriends()

        val recyclerView = findViewById<RecyclerView>(R.id.ListFriends)
        recyclerView.adapter = FListAdapter(this, myFriendsData)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(false)

    }
}