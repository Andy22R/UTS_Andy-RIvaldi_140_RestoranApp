Deskripsi Aplikasi

Resto Nusantara adalah aplikasi Android modern berbasis Jetpack Compose yang menampilkan profil restoran serta daftar menu makanan khas Nusantara.
Aplikasi ini dibuat dengan konsep UI modern menggunakan Material 3, dark mode, animasi transisi, serta penyimpanan data profil menggunakan SharedPreferences.

1. Splash Screen
   
<img width="300" alt="image" src="https://github.com/user-attachments/assets/92e0b2c8-867a-4c64-88b3-8a13a4ad8342" />
   
Halaman splash screen tampil saat aplikasi pertama kali dibuka.
Menampilkan logo restoran “Rasa Nusantara” dengan desain modern berwarna orange serta animasi sederhana untuk memberikan kesan premium pada aplikasi.

2. Home Screen (Light Mode)
   
<img width="300" alt="image" src="https://github.com/user-attachments/assets/8aa43792-0e14-484b-9373-f3e71b4300b0" />

Home screen menampilkan:

Banner restoran
Sapaan selamat datang
Menu rekomendasi
Tombol navigasi menuju menu dan profil restoran

Tampilan dibuat modern menggunakan card, gradient, dan bottom navigation agar lebih menarik dan mudah digunakan.

3. Menu Screen
   
<img width="300" alt="image" src="https://github.com/user-attachments/assets/19deb239-3bdd-4ce0-8881-3a5c80e4e6a2" />
<img width="300" alt="image" src="https://github.com/user-attachments/assets/a635d303-8446-469b-8ea0-61cd211dbb57" />

Halaman menu menampilkan daftar makanan dan minuman khas Nusantara seperti:

Nasi Goreng Spesial
Ayam Bakar Madu
Es Teh Nusantara
Kopi Aren

Setiap menu memiliki:

Gambar makanan
Harga
Rating
Favorite button

Desain menggunakan card modern dengan rounded corner dan dark theme.

4. Detail Menu Screen
   
<img width="300" alt="image" src="https://github.com/user-attachments/assets/2f443820-bc1c-4e6c-b452-28d9ae4bb13c" />

Halaman detail menu menampilkan informasi lengkap mengenai makanan yang dipilih, seperti:

Gambar ukuran besar
Nama menu
Harga
Rating bintang
Deskripsi makanan

Terdapat tombol:

“Pesan Sekarang”
“Kembali ke Menu”

5. Profile Screen
   
<img width="300"  alt="image" src="https://github.com/user-attachments/assets/4196727c-cebb-4eab-bd39-0f02ff8fff3d" />

Halaman profil restoran menampilkan:

Nama restoran
Lokasi
Jam operasional
Deskripsi restoran

Selain itu ditambahkan juga:

Nomor telepon restoran
Instagram
TikTok
WhatsApp

Desain dibuat clean dan modern agar terlihat seperti aplikasi restoran profesional.

6. Edit Profile Screen
   
<img width="300" alt="image" src="https://github.com/user-attachments/assets/3b5b9fbf-40e0-4118-9e6a-4b5895690286" />
<img width="300" alt="image" src="https://github.com/user-attachments/assets/41f53e1a-f875-432c-abeb-c294f4186088" />

Halaman edit profile digunakan untuk mengubah data restoran seperti:

Nama restoran
Alamat
Deskripsi
Jam buka
Nomor telepon
Media sosial

Semua data disimpan menggunakan SharedPreferences sehingga data tetap tersimpan saat aplikasi dibuka kembali.

7. Dark Mode

Aplikasi mendukung fitur dark mode untuk memberikan tampilan yang lebih elegan dan nyaman digunakan pada malam hari.
Tema dark mode menggunakan kombinasi warna hitam dan orange agar tetap konsisten dengan identitas aplikasi.

1. Home Screen tampilan dark mode
<img width="300" alt="image" src="https://github.com/user-attachments/assets/8f0f6786-1942-4b17-8f8a-c7c7f5262919" />

2. Menu Screen tampilan dark mode
<img width="300" alt="image" src="https://github.com/user-attachments/assets/d2f6fd9a-d56f-4df2-85e0-83d482d46410" />

3. Profile Screen
<img width="300" alt="image" src="https://github.com/user-attachments/assets/0e22dbfe-85e9-4f87-9a90-59920fa54680" />

Fitur Utama
Jetpack Compose
Navigation Compose
SharedPreferences
Dark & Light Mode
Bottom Navigation
Modern UI Design
Animasi Transisi
Interactive Rating
Favorite Menu Button

Teknologi yang Digunakan :

Kotlin
Jetpack Compose
Material 3
Navigation Compose
SharedPreferences
Coil Image Loader
