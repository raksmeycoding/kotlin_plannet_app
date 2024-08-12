package com.raksmey.myplannetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var plannedArrayList: ArrayList<Planned>
    private lateinit var myCustomAdapter: MyCustomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1 - Adapter View
        listView = findViewById(R.id.id_list_view)

        // 2 - datasource
        plannedArrayList = arrayListOf(Planned("Earth", "1", R.drawable.plannet1))

        myCustomAdapter = MyCustomAdapter(plannedArrayList, applicationContext)

        listView.adapter = myCustomAdapter
    }
}