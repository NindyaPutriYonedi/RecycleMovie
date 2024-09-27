package com.nindy.listnindy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var  btnBuku : Button
    private lateinit var btnBuah : Button
    private lateinit var btnMovie : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnBuku = findViewById(R.id.btnBuku)
        btnBuah = findViewById(R.id.btnBuah)
        btnMovie = findViewById(R.id.btnMovie)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnBuku.setOnClickListener(){
            val intent = Intent(this@MainActivity, RecycleView::class.java)
            startActivity(intent)
        }

        btnBuah.setOnClickListener(){
            val intent = Intent(this@MainActivity, RecycleBuah::class.java)
            startActivity(intent)
        }

        btnMovie.setOnClickListener(){
            val intent = Intent(this@MainActivity, RecycleMovie::class.java)
            startActivity(intent)
        }
    }
}