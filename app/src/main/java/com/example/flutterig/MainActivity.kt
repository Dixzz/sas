package com.example.flutterig

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flutter_test.EntryFlutterActivity
import com.example.flutter_test.FlutterConfig
import com.example.flutterig.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.gawd.setOnClickListener {
            FlutterConfig.setKey("12345")
            try {
                Class.forName("io.flutter.embedding.engine.FlutterEngine")
            } catch (e: Exception){
                e.printStackTrace()
            }
            FlutterConfig.open(this)
        }
    }
}