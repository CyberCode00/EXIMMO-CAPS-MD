package com.example.eximmo

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.eximmo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSub.setOnClickListener {
            val intent = Intent(this, Commodity::class.java)
            startActivity(intent)
        }

        val countryItems = listOf("Indonesia", "England", "USA", "Vietnam", "Thailand")
        val commoditiesItems = listOf("Rice", "Fish", "Coffee", "Tea", "Apple")
        val fromItems = listOf("2019", "2020", "2021", "2022", "2023")
        val toItems = listOf("2024", "2025", "2026", "2027", "2028")

        val autoComplete1: AutoCompleteTextView = findViewById(R.id.country_txt)
        val autoComplete2: AutoCompleteTextView = findViewById(R.id.commodities_txt)
        val autoComplete3: AutoCompleteTextView = findViewById(R.id.from_txt)
        val autoComplete4: AutoCompleteTextView = findViewById(R.id.to_txt)

        val adapter1 = ArrayAdapter(this, R.layout.list_items, countryItems)
        val adapter2 = ArrayAdapter(this, R.layout.list_items, commoditiesItems)
        val adapter3 = ArrayAdapter(this, R.layout.list_items, fromItems)
        val adapter4 = ArrayAdapter(this, R.layout.list_items, toItems)

        autoComplete1.setAdapter(adapter1)
        autoComplete1.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->

                val itemSelected1 = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "$itemSelected1", Toast.LENGTH_SHORT).show()
            }

        autoComplete2.setAdapter(adapter2)
        autoComplete2.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->

                val itemSelected2 = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "$itemSelected2", Toast.LENGTH_SHORT).show()
            }

        autoComplete3.setAdapter(adapter3)
        autoComplete3.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->

                val itemSelected3 = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "$itemSelected3", Toast.LENGTH_SHORT).show()

            }

        autoComplete4.setAdapter(adapter4)
        autoComplete4.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->

                val itemSelected4 = adapterView.getItemAtPosition(i)
                Toast.makeText(this, "$itemSelected4", Toast.LENGTH_SHORT).show()

            }



    }
}