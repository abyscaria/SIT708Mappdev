package com.examples.appbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friends)
        //val adapter:Array<String> = resources.getStringArray(R.array)
        val friendList : Array<String> = resources.getStringArray(R.array.friends)
        val myListView = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friendList)
        val listView : ListView = findViewById(R.id.MyListView)
        listView.adapter =myListView
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
                val selectedItem = adapterView.getItemAtPosition(position) as String
                val itemIdAtPos = adapterView.getItemIdAtPosition(position)
                Toast.makeText(
                    applicationContext,
                    "click item $selectedItem its position $itemIdAtPos",
                    Toast.LENGTH_LONG
                ).show()

            }
    }
}