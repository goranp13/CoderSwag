 package com.example.bft.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.bft.coderswag.Adapters.Categoryadapter
import com.example.bft.coderswag.Model.Category
import com.example.bft.coderswag.R
import com.example.bft.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

     lateinit var adapter : Categoryadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = Categoryadapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
