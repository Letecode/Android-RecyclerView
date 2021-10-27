package com.letecode.planetdiscovery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.letecode.planetdiscovery.adapter.PlanetAdapter
import com.letecode.planetdiscovery.models.Planete

class MainActivity : AppCompatActivity() {

    private val planeteList : ArrayList<Planete> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        remplirLesPlanetes()
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        with(recyclerView) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PlanetAdapter(planeteList, context)
        }
    }

    private fun remplirLesPlanetes() {
        planeteList.add(
            Planete("Mercure", "0,4 ua (46M à 70M km)", R.drawable.mercure, "https://fr.wikipedia.org/wiki/Mercure_(plan%C3%A8te)")
        )
        planeteList.add(
            Planete("Vénus", "0,7 ua (~108M km)", R.drawable.venus, "https://fr.wikipedia.org/wiki/V%C3%A9nus_(plan%C3%A8te)")
        )
        planeteList.add(
            Planete("Terre", "1 ua (150M km)", R.drawable.terre, "https://fr.wikipedia.org/wiki/Terre")
        )
        planeteList.add(
            Planete("Mars", "1,5 ua (206,6M à 249,2M km)", R.drawable.mars, "https://fr.wikipedia.org/wiki/Mars_(plan%C3%A8te)")
        )
        planeteList.add(
            Planete("Jupiter", "5,2 ua (779M km)", R.drawable.jupiter, "https://fr.wikipedia.org/wiki/Jupiter_(plan%C3%A8te)")
        )
        planeteList.add(
            Planete("Saturne", "9,5 ua (8 957M km)", R.drawable.saturne, "https://fr.wikipedia.org/wiki/Saturne_(plan%C3%A8te)")
        )
        planeteList.add(
            Planete("Uranus", "19,2 ua (2,87 milliards km)", R.drawable.uranus, "https://fr.wikipedia.org/wiki/Uranus_(plan%C3%A8te)")
        )
        planeteList.add(
            Planete("Nepturne", "30 ua (4,5 milliards km)", R.drawable.neptune, "https://fr.wikipedia.org/wiki/Neptune_(plan%C3%A8te)")
        )
    }
}