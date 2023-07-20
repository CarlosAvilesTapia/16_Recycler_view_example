package com.example.a16recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.a16recyclerviewexample.databinding.ItemCountryBinding

class CountryAdapter : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {
    var countries = mutableListOf<Country>()

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


    class ViewHolder(val binding: ItemCountryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(itemCountry: Country) {

            binding.ivFlag.load(itemCountry.imgUrl)
            binding.tvCountry.text = itemCountry.name

        }
    }
}
