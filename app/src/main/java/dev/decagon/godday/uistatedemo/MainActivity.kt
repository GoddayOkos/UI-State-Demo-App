package dev.decagon.godday.uistatedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Initial state
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assign the state to the TextView
        findViewById<TextView>(R.id.count_tv).text = getString(R.string.initialCount, count)
        // Update the state when the user tap on the Button
        findViewById<Button>(R.id.increase_count_btn).setOnClickListener { updateCount() }
    }

    private fun updateCount() {
        // Update the state
        count++
        // Remember to reassigned the new state to the TextView
        findViewById<TextView>(R.id.count_tv).text = getString(R.string.initialCount, count)
    }
}