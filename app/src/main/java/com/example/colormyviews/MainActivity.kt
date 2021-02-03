package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableView: List<View> = listOf(
            box_one_text,
            box_two_text,
            box_three_text,
            box_four_text,
            box_five_text,
            constraint_layout,
            red_button,
            yellow_button,
            green_button
        )

        for (item in clickableView) {
            item.setOnClickListener{
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View) {
        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_light, null))
            R.id.box_four_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark, null))
            R.id.box_five_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_light, null))

            R.id.red_button -> box_three_text.setBackgroundColor(resources.getColor(R.color.my_red, null))
            R.id.yellow_button -> box_four_text.setBackgroundColor(resources.getColor(R.color.my_yellow, null))
            R.id.green_button -> box_five_text.setBackgroundColor(resources.getColor(R.color.my_green, null))

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}