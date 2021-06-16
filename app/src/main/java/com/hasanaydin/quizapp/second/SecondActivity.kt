package com.hasanaydin.quizapp.second

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.hasanaydin.quizapp.QuestionsData
import com.hasanaydin.quizapp.R
import com.hasanaydin.quizapp.ResultActivity
import com.hasanaydin.quizapp.databinding.ActivityMainBinding
import com.hasanaydin.quizapp.databinding.ActivitySecondBinding
import com.hasanaydin.quizapp.main.MainActivity
import com.hasanaydin.quizapp.main.MainViewModel
import com.hasanaydin.quizapp.question1

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

        // Timer

        object : CountDownTimer(10300,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.time.text = "Süre: "+ millisUntilFinished/1000
            }

            override fun onFinish() {
                
            }

        }.start()



        var uname = intent.getStringExtra(EXTRA_MESSAGE)
        binding.userName2.text = "Başarılar, $uname"

        binding.question.text = question1.question
        binding.answer1.text = question1.answer1
        binding.answer2.text = question1.answer2
        binding.answer3.text = question1.answer3
        binding.answer4.text = question1.answer4

        binding.answer1.setOnClickListener {
            var message = "Üzgünüz, Yanlış cevap :("
            var intent = Intent(this,ResultActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE,message)
            }
            startActivity(intent)

        }

        binding.answer2.setOnClickListener {
            var message = "Üzgünüz, Yanlış cevap :("
            var intent = Intent(this,ResultActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE,message)
            }
            startActivity(intent)
        }

        binding.answer3.setOnClickListener {
            var message = "Tebrikler, Doğru Cevap :)"
            var intent = Intent(this,ResultActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE,message)
            }
            startActivity(intent)
        }

        binding.answer4.setOnClickListener {
            var message = "Üzgünüz, Yanlış cevap :("
            var intent = Intent(this,ResultActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE,message)
            }
            startActivity(intent)
        }
    }
}