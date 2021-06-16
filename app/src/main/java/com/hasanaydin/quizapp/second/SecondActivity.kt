package com.hasanaydin.quizapp.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.lifecycle.ViewModelProvider
import com.hasanaydin.quizapp.R
import com.hasanaydin.quizapp.databinding.ActivityMainBinding
import com.hasanaydin.quizapp.databinding.ActivitySecondBinding
import com.hasanaydin.quizapp.main.MainViewModel

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    lateinit var viewModel: SecondViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)

        var uname = intent.getStringExtra(EXTRA_MESSAGE)
        binding.userName2.text = "Başarılar, $uname :)"
    }
}