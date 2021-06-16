package com.hasanaydin.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.lifecycle.ViewModelProvider
import com.hasanaydin.quizapp.databinding.ActivityMainBinding
import com.hasanaydin.quizapp.databinding.ActivityResultBinding
import com.hasanaydin.quizapp.databinding.ActivitySecondBinding
import com.hasanaydin.quizapp.main.MainViewModel
import com.hasanaydin.quizapp.second.SecondViewModel

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    // lateinit var viewModel: ResultViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    // viewModel = ViewModelProvider(this).get(ResultViewModel::class.java)

        binding.resultText.text = intent.getStringExtra(EXTRA_MESSAGE)
    }

}