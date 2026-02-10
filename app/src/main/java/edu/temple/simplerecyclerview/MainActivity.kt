package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.SimpleAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference RecyclerView object

        //https://developer.android.com/develop/ui/views/layout/declaring-layout
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Step 2: Provide a LayoutManager

        // https://developer.android.com/develop/ui/views/layout/recyclerview

        recyclerView.layoutManager = GridLayoutManager(this, 3)
        //recyclerView.layoutManager = LinearLayoutManager(this)


        // Step 4: Provide a RecyclerView.Adapter
        recyclerView.adapter = NumberDisplayAdapter(arrayOf(1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ,10))
    }
}