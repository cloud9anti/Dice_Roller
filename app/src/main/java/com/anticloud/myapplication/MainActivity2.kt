package com.anticloud.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.content_main.*
import kotlin.random.Random


class MainActivity2 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener  {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rolld4 = findViewById<Button>(R.id.rollButton4)
        val rolld6 = findViewById<Button>(R.id.rollButton6)
        val rolld8 = findViewById<Button>(R.id.rollButton8)
        val rolld10 = findViewById<Button>(R.id.rollButton10)
        val rolld12 = findViewById<Button>(R.id.rollButton12)
        val rolld20 = findViewById<Button>(R.id.rollButton20)
        val myBtn = findViewById<Button>(R.id.myBtn)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        //val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton4.setOnClickListener {

            // val rand = Random().nextInt(seekBar.progress)
            val rand = Random.nextInt(4) + 1
            resultsTextView.text = rand.toString()
        }

        rollButton6.setOnClickListener {

            // val rand = Random().nextInt(seekBar.progress)
            val rand = Random.nextInt(6) + 1
            resultsTextView.text = rand.toString()
        }
        rollButton8.setOnClickListener {

            // val rand = Random().nextInt(seekBar.progress)
            val rand = Random.nextInt(8) + 1
            resultsTextView.text = rand.toString()
        }
        rollButton10.setOnClickListener {

            // val rand = Random().nextInt(seekBar.progress)
            val rand = Random.nextInt(10) + 1
            resultsTextView.text = rand.toString()
        }
        rollButton12.setOnClickListener {

            // val rand = Random().nextInt(seekBar.progress)
            val rand = Random.nextInt(12) + 1
            resultsTextView.text = rand.toString()
        }
        rollButton20.setOnClickListener {

            // val rand = Random().nextInt(seekBar.progress)
            val rand = Random.nextInt(20) + 1
            resultsTextView.text = rand.toString()
        }



        btn = findViewById(R.id.myBtn)

        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }




        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_profile -> {
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.nav_messages -> {
                Toast.makeText(this, "Messages clicked", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            R.id.nav_friends -> {
                Toast.makeText(this, "Friends clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_update -> {
                Toast.makeText(this, "Update clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_logout -> {
                Toast.makeText(this, "Sign out clicked", Toast.LENGTH_SHORT).show()
            }

        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
