package com.mindorks.framework.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    lateinit var diceimage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceimage = findViewById<ImageView>(R.id.dice_image)

        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.text = "Lets Roll"

        rollButton.setOnClickListener {
            ShowDice()
        }
    }

    private fun ShowDice() {

        val randomInt = Random.nextInt(6)+1
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> println("default")
        }
        diceimage.setImageResource(drawableResource as Int)


    }
}