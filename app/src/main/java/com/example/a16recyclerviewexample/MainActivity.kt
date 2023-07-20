package com.example.a16recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.a16recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CountryCallback {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initCountryAdapter()


    }

    private fun initCountryAdapter() {
        val countryAdapter = CountryAdapter()

        countryAdapter.setData(PaisesLatam.countries)

        countryAdapter.setCountryCallback(this)

        binding.rvCountries.adapter = countryAdapter

    }

    override fun showCountry(s: String) {
        binding.tvPopulation.text = s
    }

}