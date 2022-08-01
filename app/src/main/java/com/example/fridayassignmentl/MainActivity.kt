package com.example.fridayassignmentl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.fridayassignmentl.ui.main.CodeFragment
import com.example.fridayassignmentl.ui.main.GeeksFragment_1
import com.example.fridayassignmentl.ui.main.LeetFragment
import com.example.fridayassignmentl.ui.main.ViewPageAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var bar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        bar = findViewById(R.id.toolbar)


        setSupportActionBar(bar)


        val adapter = ViewPageAdapter(supportFragmentManager)


        adapter.addFragment(GeeksFragment_1(), "GeeksForGeeks")
        adapter.addFragment(CodeFragment(), "Code Chef")
        adapter.addFragment(LeetFragment(), "Leet Code")


        pager.adapter = adapter


        tab.setupWithViewPager(pager)
    }
}

