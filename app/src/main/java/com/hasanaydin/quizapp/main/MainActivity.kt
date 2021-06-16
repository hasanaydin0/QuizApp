package com.hasanaydin.quizapp.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.lifecycle.ViewModelProvider
import com.hasanaydin.quizapp.databinding.ActivityMainBinding
import com.hasanaydin.quizapp.second.SecondActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.start.setOnClickListener {
            var uname = binding.userName.text.toString()
            var intent = Intent(this, SecondActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE,uname)
            }
            startActivity(intent)
        }

    }
}
