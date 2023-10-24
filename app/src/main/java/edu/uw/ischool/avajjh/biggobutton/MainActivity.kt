package edu.uw.ischool.avajjh.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bigButton = findViewById<Button>(R.id.biggobutton)
        var timesPressed = 0;

        bigButton.setOnClickListener {
            timesPressed += 1;
            Log.i("BUTTONS", "User tapped the big go button $timesPressed times")
            if (timesPressed == 1) {
                bigButton.text = "You have pushed me 1 time!"
            } else {
                bigButton.text = "You have pushed me $timesPressed times!"
            }
        }
    }
}