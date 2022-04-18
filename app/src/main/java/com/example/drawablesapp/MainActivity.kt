package com.example.drawablesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.toDrawable
import com.example.drawablesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        /*binding.button.setOnClickListener {
            val aux = binding.button.background
            binding.button.background = binding.button2.background
            binding.button2.background = aux
        }*/
        /*binding.button2.setOnClickListener {
            val aux = binding.button.background
            binding.button.background = binding.button2.background
            binding.button2.background = aux
        }*/
    }
}