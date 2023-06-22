# Proyek-SBD-Kelas_Kelompok-8

Word Count merupakan salah satu hal basic dalam dunia pemrograman yang sesuai namanya akan menghitung frekuensi kemunculan setiap kata dalam suatu dokumen berformat text

A. Langkah-langkah meng-install Apache Hadoop untuk sistem operasi windows (versi 11)

1. Pastikan Java yang terinstall adalah versi 1.8.0. Anda bisa mengeceknya pada command prompt di laptop / PC Anda dengan memasukkan komen "java -version"

2. Extrak file berformat zip dari Apache Hadoop untuk disimpan ke direktori "C"

3. Tambahkan JAVA_HOME dan HADOOP_HOME pada environment variable agar tercipta variabel environtment baru yang akan bernama sama dan berisikan file bin masing-masing folder.

4. Lanjutkan proses konfigurasi yang diperlukan, seperti: 

Konfiguurasi file hadoop-env dengan menambahkan path yang sesuai untuk JAVA_HOME (masukkan "hadoop" pada command prompt untuk memastikannya sudah terkonfigurasi dengan benar)

Konfigurasi file core-site.xml dengan menambahkan tulisan dibawah ini:


![Image](https://github.com/Michaeltzy/jsleep-android/assets/88538611/ee2b9b32-d7c4-45b4-83bf-cfd4ddbef4f8)


Konfigurasi file hdfs-site.xml dengan menambahkan tulisan dibawah ini:


![Image](https://github.com/Michaeltzy/jsleep-android/assets/88538611/207b48c2-1978-401c-9ac7-862144f523f1)

Konfigurasi file hdfs-site.xml sebelum mengkonfigurasikan file hdfs-site.xml dengan membuat sebuah folder data berisikan folder namenode dan datanode, serta menambahkan tulisan berikut:


![Image](https://github.com/Michaeltzy/jsleep-android/assets/88538611/2193e6d8-4dfe-44b1-ad40-7c53cbe51744)


Konfigurasi file mapred-site.xml dengan menambahkan tulisan dibawah ini:


![Image](https://github.com/Michaeltzy/jsleep-android/assets/88538611/e253a917-4371-4d76-8ee2-d0a50953f8d0)


Konfigurasi file yarn-site.xml dengan menambahkan tulisan dibawah ini:


![Image](https://github.com/Michaeltzy/jsleep-android/assets/88538611/45dbad90-464b-4368-90c4-3492e3c94bf7)


Jalankan Hadoop dengan "start-all.cmd" sehingga node dapat berjalan

Jalankan Perintah JPS sebagi akhir.
