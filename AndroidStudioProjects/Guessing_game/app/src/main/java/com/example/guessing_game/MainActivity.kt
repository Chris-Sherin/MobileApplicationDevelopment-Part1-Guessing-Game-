package com.example.guessing_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var secretNumber= (0 until  1000).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberGuessedByUser=findViewById<TextInputLayout>(R.id.Number_input)
        val guessButtonClicked = findViewById<TextView>(R.id.Guess_button)
        val clueOrAnswer=findViewById<TextView>(R.id.Guess_Text)

        guessButtonClicked.setOnClickListener{
            var numberUser=(numberGuessedByUser.editText?.text.toString()).toInt()
            val clueOrAnswerOnGuess
            = if(secretNumber> numberUser)
                "No :) My number is bigger"
            else if(secretNumber<numberUser) "No :) My number is smaller"

            else
                "You are right!"


            clueOrAnswer.text=clueOrAnswerOnGuess.toString()

          }
        }

    }
