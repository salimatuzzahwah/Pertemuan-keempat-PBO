# Pertemuan-keempat-PBO
 Connect Netbeans dengan Postgresql  untuk membuat Tabel, dengan Class Create, Insert, Update, Delete,  Read/Select yang Interaktif dan MainClass di Netbeans.
# CRUD Java with JDBC & PostgreSQL
Koneksi antara NetBeans dan PostgreSQL merupakan langkah penting dalam 
pengembangan program berbasis database. PostgreSQL adalah sistem manajemen basis data 
relasional open-source yang handal dan banyak digunakan. NetBeans sebagai Integrated 
Development Environment (IDE) menyediakan kemudahan dalam mengelola proyek Java 
yang terintegrasi dengan database PostgreSQL melalui JDBC (Java Database Connectivity). 
Dengan koneksi ini, pengembang dapat melakukan operasi CRUD (Create, Read, Update, 
Delete) secara langsung dari aplikasi Java yang dibuat di NetBeans. 
Project ini merupakan implementasi CRUD (Create, Read, Update, Delete) menggunakan bahasa pemrograman Java dengan JDBC untuk koneksi ke PostgreSQL.
Aplikasi berjalan di console dengan menu interaktif.
# CLASS CREATE, INSERT, UPDATE, DELETE dan SELECT 
- Class Insert berfungsi untuk menambahkan data baru ke tabel. Data dimasukkan oleh pengguna melalui console. Proses penyimpanan data menggunakan PreparedStatement sehingga lebih aman dari serangan SQL Injection, dan program akan menampilkan pesan berhasil atau gagal setelah data ditambahkan.
- Class Select digunakan untuk menampilkan semua data yang ada di tabel. Hasil query ditampilkan di console dalam bentuk tabel sederhana. Jika tabel tidak memiliki data, maka akan muncul pesan bahwa data kosong.
- Class Update memungkinkan pengguna untuk mengubah data berdasarkan id sebagai primary key. Pengguna diminta memasukkan data yang ingin diubah. Jika data yang dimasukkan ada di database, data akan berhasil diperbarui, namun jika tidak ada maka akan muncul pesan gagal.
- Class Delete digunakan untuk menghapus data berdasarkan primary key. Pengguna hanya perlu memasukkan primary key yang ingin dihapus. Jika data dengan primary key tersebut ditemukan, maka data akan dihapus dan program menampilkan pesan berhasil, sedangkan jika tidak ditemukan maka akan muncul pesan data tidak ada.
# INTERAKTIVITAS dan MAIN CLASS di NETBEANS 
Untuk memudahkan pengguna dalam menjalankan operasi CRUD, dibuat sebuah 
MainClass di NetBeans yang berfungsi sebagai antarmuka interaktif. MainClass ini akan 
mengatur alur program dan memanggil metode-metode dari kelas Insert, Update, 
Delete, dan Select sesuai dengan kebutuhan pengguna. Dengan pendekatan ini, aplikasi 
menjadi lebih terstruktur dan mudah digunakan.
