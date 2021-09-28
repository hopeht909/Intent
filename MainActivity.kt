package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btSnackBar : Button
    private lateinit var btSecondActivity : Button
    private lateinit var btTV : Button
    private lateinit var locationEt: EditText
    private lateinit var nameEt: EditText
    private lateinit var numEt: EditText
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btSnackBar = findViewById(R.id.button2)
        btSecondActivity = findViewById(R.id.button3)
        btTV = findViewById(R.id.button)
        locationEt = findViewById(R.id.editTextTextPersonName2)
        nameEt = findViewById(R.id.editTexName)
        numEt = findViewById(R.id.editTextTextPersonName3)
        tv = findViewById(R.id.textView2)


        btSecondActivity.setOnClickListener {
           val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name" , nameEt.text.toString())
            intent.putExtra("location" , locationEt.text.toString())
            intent.putExtra("number" , numEt.text.toString())
            startActivity(intent)
        }

        btSnackBar.setOnClickListener {
            Toast.makeText(this, "${nameEt.text} ${numEt.text} ${locationEt.text}" , Toast.LENGTH_LONG).show()

        }
        btTV.setOnClickListener {
            tv.text ="${nameEt.text} ${numEt.text} ${locationEt.text}"
        }
    }
}