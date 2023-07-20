package com.example.a16recyclerviewexample


data class Country(val name: String, val population: Long, val imgUrl: String)

class PaisesLatam {
    companion object {
        val countries = mutableListOf<Country>().apply {
            add(Country("Argentina", 46044703, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/203px-Flag_of_Argentina.svg.png"))
            add(Country("Chile", 19960889, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/203px-Flag_of_Chile.svg.png"))
            add(Country("Paraguay", 7439863, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Paraguay.svg/203px-Flag_of_Paraguay.svg.png"))
            add(Country("Bolivia", 12186079, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Bolivia.svg/203px-Flag_of_Bolivia.svg.png"))
            add(Country("Perú", 33788589, "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Peru.svg/203px-Flag_of_Peru.svg.png"))
            add(Country("Ecuador", 18408350, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/203px-Flag_of_Ecuador.svg.png"))
            add(Country("Brasil", 218689757, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/203px-Flag_of_Brazil.svg.png"))
            add(Country("Colombia", 52215503, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/203px-Flag_of_Colombia.svg.png"))
            add(Country("Venezuela", 30518260, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/203px-Flag_of_Venezuela.svg.png"))
            add(Country("Uruguay", 3416264, "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/203px-Flag_of_Uruguay.svg.png"))
        }
    }
}