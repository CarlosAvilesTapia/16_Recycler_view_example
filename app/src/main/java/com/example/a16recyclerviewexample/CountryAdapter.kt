package com.example.a16recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.a16recyclerviewexample.databinding.ItemCountryBinding

class CountryAdapter : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {
    var countries = mutableListOf<Country>()

    var callback : CountryCallback ?= null
    fun setCountryCallback(c: CountryCallback) {
        this.callback = c
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryAdapter.ViewHolder {
        val binding = ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryAdapter.ViewHolder, position: Int) {
        val itemCountry = countries[position]
        holder.bind(itemCountry)

    }

    override fun getItemCount(): Int {
        return countries.size
    }

    fun setData(countries: MutableList<Country>) {
        this.countries = countries.toMutableList()

    }


    inner class ViewHolder(val binding: ItemCountryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(itemCountry: Country) {

            binding.ivFlag.load(itemCountry.imgUrl)
            binding.tvCountry.text = itemCountry.name
            binding.cvCountry.setOnClickListener {
                /*Toast.makeText(
                    itemView.context,
                    "${itemCountry.name} tiene ${itemCountry.population} habitantes.",
                    Toast.LENGTH_SHORT
                ).show()*/

                val text = "${itemCountry.name} tiene ${itemCountry.population} habitantes."

                callback?.showCountry(text)
            }

        }
    }
}

interface CountryCallback {
    fun showCountry(s: String)

}
