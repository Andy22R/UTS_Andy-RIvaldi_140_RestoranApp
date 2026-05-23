package com.example.restoranapp.data

data class MenuItem(
    val id: Int,
    val name: String,
    val price: String,
    val rating: Float,
    val description: String,
    val imageUrl: String,
    var isFavorite: Boolean = false
)

object MenuData {
    const val RESTAURANT_BANNER = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?auto=format&fit=crop&q=80&w=1000"
    const val RESTAURANT_LOGO = "https://images.unsplash.com/photo-1514362545857-3bc16c4c7d1b?auto=format&fit=crop&q=80&w=200"
    const val RESTAURANT_INTERIOR = "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?auto=format&fit=crop&q=80&w=1000"

    val menuList = listOf(
        MenuItem(
            id = 1,
            name = "Nasi Goreng Spesial",
            price = "Rp 35.000",
            rating = 4.8f,
            description = "Nasi goreng dengan bumbu rahasia Nusantara, disajikan dengan telur mata sapi, ayam goreng, udang, dan kerupuk udang yang renyah.",
            imageUrl = "https://images.unsplash.com/photo-1603133872878-684f208fb84b?auto=format&fit=crop&q=80&w=800"
        ),
        MenuItem(
            id = 2,
            name = "Ayam Bakar Madu",
            price = "Rp 45.000",
            rating = 4.9f,
            description = "Ayam pilihan yang dibakar dengan olesan madu murni dan rempah pilihan, memberikan rasa manis gurih yang meresap hingga ke tulang.",
            imageUrl = "https://images.unsplash.com/photo-1594221708779-94832f4320d1?auto=format&fit=crop&q=80&w=800"
        ),
        MenuItem(
            id = 3,
            name = "Es Teh Nusantara",
            price = "Rp 12.000",
            rating = 4.5f,
            description = "Kesegaran teh pilihan dari perkebunan terbaik di Indonesia, disajikan dengan es batu kristal dan aroma melati yang menenangkan.",
            imageUrl = "https://images.unsplash.com/photo-1556679343-c7306c1976bc?auto=format&fit=crop&q=80&w=800"
        ),
        MenuItem(
            id = 4,
            name = "Kopi Aren",
            price = "Rp 18.000",
            rating = 4.7f,
            description = "Perpaduan espresso robusta pilihan dengan susu segar dan gula aren asli, menciptakan cita rasa kopi susu kekinian yang autentik.",
            imageUrl = "https://images.unsplash.com/photo-1509042239860-f550ce710b93?auto=format&fit=crop&q=80&w=800"
        ),
        MenuItem(
            id = 5,
            name = "Mie Pedas Sultan",
            price = "Rp 28.000",
            rating = 4.6f,
            description = "Mie kenyal dengan level kepedasan yang bisa disesuaikan, ditaburi topping ayam cincang premium dan pangsit goreng renyah.",
            imageUrl = "https://images.unsplash.com/photo-1585032226651-759b368d7246?auto=format&fit=crop&q=80&w=800"
        )
    )
}
