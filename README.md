# Proyek-SBD-Kelas_Kelompok-8

Word Count merupakan salah satu hal basic dalam dunia pemrograman yang sesuai namanya akan menghitung frekuensi kemunculan setiap kata dalam suatu dokumen berformat text

A. Langkah-langkah meng-install Apache Hadoop untuk sistem operasi windows (versi 11)

1. Pastikan Java yang terinstall adalah versi 1.8.0. Anda bisa mengeceknya pada command prompt di laptop / PC Anda dengan memasukkan komen "java -version"

2. Extrak file berformat zip dari Apache Hadoop untuk disimpan ke direktori "C"

3. Tambahkan JAVA_HOME dan HADOOP_HOME pada environment variable agar tercipta variabel environtment baru yang akan bernama sama dan berisikan file bin masing-masing folder.

4. Lanjutkan proses konfigurasi yang diperlukan, seperti: 

Konfiguurasi file hadoop-env dengan menambahkan path yang sesuai untuk JAVA_HOME (masukkan "hadoop" pada command prompt untuk memastikannya sudah terkonfigurasi dengan benar)

Konfigurasi file core-site.xml dengan menambahkan tulisan dibawah ini:


![Image](https://github.com/Michaeltzy/Proyek-SBD-Kelas_Kelompok-8/blob/main/Assets/image_1.jpg)


Konfigurasi file hdfs-site.xml dengan menambahkan tulisan dibawah ini:


![Image](https://github.com/Michaeltzy/Proyek-SBD-Kelas_Kelompok-8/blob/main/Assets/image_2.jpg)

Konfigurasi file hdfs-site.xml sebelum mengkonfigurasikan file hdfs-site.xml dengan membuat sebuah folder data berisikan folder namenode dan datanode, serta menambahkan tulisan berikut:


![Image](https://github.com/Michaeltzy/Proyek-SBD-Kelas_Kelompok-8/blob/main/Assets/image_3.jpg)


Konfigurasi file mapred-site.xml dengan menambahkan tulisan dibawah ini:


![Image](https://github.com/Michaeltzy/Proyek-SBD-Kelas_Kelompok-8/blob/main/Assets/image_4.jpg)


Konfigurasi file yarn-site.xml dengan menambahkan tulisan dibawah ini:


![Image](https://github.com/Michaeltzy/Proyek-SBD-Kelas_Kelompok-8/blob/main/Assets/image_5.jpg)


Jalankan Hadoop dengan "start-all.cmd" sehingga node dapat berjalan


Kemudian untuk menjalankan hadoop untuk tiap file gunakan
```
hdfs dfs -put (file-path) /(nama-folder)

hadoop jar (file-path) wordcount /(nama-folder)/gutenberg-1G.txt /output/result-1G

hdfs dfs -get /output/hd_wordcount/part-r-00000 (file-path-output)
```

Terakhir untuk mematikan hadoop jalankan
stop-all.cmd


