package xyz.quantumcompass.androidrecyclerview

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Retrieve the slug from the intent
        val slug = intent.getStringExtra("EXTRA_SLUG")

        // Find the TextView and set the slug
        val slugTextView: TextView = findViewById(R.id.slug_text_view)
        slugTextView.text = slug ?: "No slug passed"
    }
}
