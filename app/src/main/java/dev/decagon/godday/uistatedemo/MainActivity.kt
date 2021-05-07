package dev.decagon.godday.uistatedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    // Initialize the viewModel by delegation
    private val viewModel: UIStateViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Observe the state flowing down from viewModel
        viewModel.count.observe(this) {
            findViewById<TextView>(R.id.count_tv).text = getString(R.string.initialCount, it)
        }

        // Event flowing up to the viewModel when the user taps the button
        findViewById<Button>(R.id.increase_count_btn).setOnClickListener { viewModel.updateCount() }
    }
}