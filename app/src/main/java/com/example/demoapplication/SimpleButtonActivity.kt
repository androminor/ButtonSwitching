package com.example.demoapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView

class SimpleButtonActivity : AppCompatActivity() {
    private lateinit var buttonPurple:Button
    private lateinit var textView:TextView
    private lateinit var switch: Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        purpleClick()
        toggleMe()
    }

    private fun toggleMe() {


//       condition ? then : else is not useful as if is enough so no ternary operator
        switch.setOnCheckedChangeListener { _: CompoundButton?, isChecked: Boolean ->
            textView.text = when (isChecked) {
                true -> "Switch is used".apply { switch.text = "Switch is pressed" }
                false -> "Switch not used".apply { switch.text = "Switch Not pressed" }

            }


        }

    }

    private fun purpleClick() {
        buttonPurple.setOnClickListener {
            textView.text = "I am  clicked nicely"

        }

    }
}
