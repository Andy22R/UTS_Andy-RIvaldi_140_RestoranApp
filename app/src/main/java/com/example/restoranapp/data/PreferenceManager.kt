package com.example.restoranapp.data

import android.content.Context
import android.content.SharedPreferences

class PreferenceManager(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("RasaNusantaraPrefs", Context.MODE_PRIVATE)

    fun saveRestaurantInfo(
        name: String,
        address: String,
        description: String,
        openingHours: String,
        phone: String = getPhone(),
        instagram: String = getInstagram(),
        tiktok: String = getTiktok(),
        whatsapp: String = getWhatsapp()
    ) {
        sharedPreferences.edit().apply {
            putString("res_name", name)
            putString("res_address", address)
            putString("res_desc", description)
            putString("res_hours", openingHours)
            putString("res_phone", phone)
            putString("res_instagram", instagram)
            putString("res_tiktok", tiktok)
            putString("res_whatsapp", whatsapp)
            apply()
        }
    }

    fun getRestaurantName(): String = sharedPreferences.getString("res_name", "Rasa Nusantara") ?: "Rasa Nusantara"
    fun getRestaurantAddress(): String = sharedPreferences.getString("res_address", "Jl. Nusantara No. 123, Jakarta") ?: "Jl. Nusantara No. 123, Jakarta"
    fun getRestaurantDescription(): String = sharedPreferences.getString("res_desc", "Menyajikan cita rasa autentik masakan tradisional Indonesia dengan sentuhan modern.") ?: "Menyajikan cita rasa autentik masakan tradisional Indonesia dengan sentuhan modern."
    fun getRestaurantHours(): String = sharedPreferences.getString("res_hours", "10:00 - 22:00") ?: "10:00 - 22:00"

    fun getPhone(): String = sharedPreferences.getString("res_phone", "+62 812-3456-7890") ?: "+62 812-3456-7890"
    fun getInstagram(): String = sharedPreferences.getString("res_instagram", "@restonusantara") ?: "@restonusantara"
    fun getTiktok(): String = sharedPreferences.getString("res_tiktok", "@restonusantara.id") ?: "@restonusantara.id"
    fun getWhatsapp(): String = sharedPreferences.getString("res_whatsapp", "Chat Pemesanan") ?: "Chat Pemesanan"

    fun setDarkMode(isDark: Boolean) {
        sharedPreferences.edit().putBoolean("dark_mode", isDark).apply()
    }

    fun isDarkMode(): Boolean = sharedPreferences.getBoolean("dark_mode", false)
}
