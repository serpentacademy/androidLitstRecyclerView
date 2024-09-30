package xyz.quantumcompass.androidrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import android.content.Intent
import android.graphics.drawable.InsetDrawable
import androidx.recyclerview.widget.DividerItemDecoration


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)


        val itemList = listOf(
            Item(R.drawable.blockchain, "Title 1", "Description 1", "slug-1"),
            Item(R.drawable.blockchain2, "Title 2", "Description 2", "slug-2"),
            Item(R.drawable.blockchain3, "Title 3", "Description 3", "slug-3")
        )

        itemAdapter = ItemAdapter(itemList) { item ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("EXTRA_SLUG", item.slug)
            }
            startActivity(intent)
        }

        recyclerView.adapter = itemAdapter
    }
}
