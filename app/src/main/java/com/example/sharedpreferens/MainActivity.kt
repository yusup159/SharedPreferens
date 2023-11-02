package com.example.sharedpreferens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sharedpreferens.session.SessionActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sessionActivity = SessionActivity(this)

        val btnlog: Button = findViewById(R.id.btnLogout)

        btnlog.setOnClickListener {
            sessionActivity.sessionLogout()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}