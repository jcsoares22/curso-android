package me.dio.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
 //   private lateinit var  binding: activityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)

       //val tvHello = findViewById<TextView>(R.id.tvHello)
        var binding = ActivityMainBinding.inflate(layoutInflater)

    }

}