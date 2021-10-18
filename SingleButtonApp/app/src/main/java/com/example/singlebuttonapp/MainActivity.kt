package com.example.singlebuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.singlebuttonapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val text = binding.etText.text.toString()
            binding.tvText.text = text
            binding.etText.text.clear()
        }
    }



}
