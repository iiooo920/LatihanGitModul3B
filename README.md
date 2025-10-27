# Proyek Peliharaan Virtual - Modul 2 & 3 Pemrograman Lanjut

Ini adalah proyek sederhana yang dibuat sebagai bagian dari Tugas 3 Modul 2 (Refactoring) dan Tugas 2 Modul 3 (Dokumentasi) mata kuliah Pemrograman Lanjut.

## Deskripsi Proyek

Program ini mensimulasikan interaksi dasar dengan seekor peliharaan virtual. Peliharaan memiliki status lapar (`hunger`) dan senang (`happiness`) yang dapat berubah ketika diberi makan (`feed()`) atau diajak bermain (`play()`).

Proyek ini menunjukkan penerapan beberapa teknik refactoring untuk menghasilkan kode yang bersih dan terstruktur, serta penggunaan dokumentasi JavaDoc dan README.

## Struktur Kode

Kode dibagi menjadi beberapa kelas:
* `LivingThing.java`: Kelas abstrak induk yang menyimpan data umum (nama).
* `VirtualPet.java`: Kelas utama yang mewakili peliharaan, mewarisi dari `LivingThing`, dan berisi logika interaksi (`feed()`, `play()`).
* `Game.java`: Kelas yang berisi `main method` untuk menjalankan simulasi.

*(Opsional: Jika kamu menggunakan paket, sebutkan nama paketnya)*
* Semua kelas hasil refactoring diletakkan di dalam paket `sesudah_refactoring`.
* File `VirtualPetBefore.java` adalah versi kode sebelum direfactoring.

## Cara Menjalankan

1.  Pastikan Anda memiliki **Java Development Kit (JDK)** terinstal.
2.  Buka proyek ini menggunakan **IntelliJ IDEA** (atau IDE Java lainnya).
3.  Temukan file `Game.java` (di dalam paket `sesudah_refactoring` jika ada).
4.  **Klik kanan** pada file `Game.java` dan pilih **`Run 'Game.main()'`**.
5.  Output simulasi akan muncul di konsol.

## Teknologi yang Digunakan

* Java
* IntelliJ IDEA