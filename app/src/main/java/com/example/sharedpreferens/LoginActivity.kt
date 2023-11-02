package com.example.sharedpreferens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.sharedpreferens.session.SessionActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sessionActivity =SessionActivity(this)




        if (sessionActivity.isLogin()){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        else{
            val username = "admin"
            val pwd = "admin1"

            val iduser: EditText = findViewById(R.id.idUser)
            val idpass: EditText = findViewById(R.id.idPass)
            val btnlog: Button = findViewById(R.id.btn_login)

            btnlog.setOnClickListener {
                val enteredUser = iduser.text.toString()
                val enteredPass = idpass.text.toString()

                if (enteredUser == username && enteredPass == pwd) {
                    sessionActivity.sessionLogin(enteredUser, enteredPass)
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else if (enteredUser.isEmpty() || enteredPass.isEmpty()) {
                    Toast.makeText(this, "Harap isi form login", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
                }
            }

        }


    }

    override fun onClick(v: View?) {

    }
}
