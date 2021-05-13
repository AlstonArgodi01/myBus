package com.example.mybus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<com.example.mybus.Image>(
            Image(
                R.drawable.img1,
                "Harapan Jaya",
                "Tahun berdiri \t\t: 1977\n" +
                        "Lokasi perusahaan \t: Tulungagung, Jawa Timur\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tTulungagung – Jakarta \n" +
                        "2.\tTulungagung - surabaya\n" +
                        "3.\tSurabaya - jakarta\n" +
                        "4.\tTulungagung - jogja\n"
            ),
            Image(
                R.drawable.img2,
                "Rosalia Indah",
                "Tahun berdiri \t\t: 1983\n" +
                        "Lokasi perusahaan \t: Palur, Solo, Jawa Tengah\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tSurabaya – solo – Jakarta \n" +
                        "2.\tSurabaya – Solo – Bogor\n" +
                        "3.\tKlaten - Jakarta\n"
            ),
            Image(
                R.drawable.img3,
                "Safari Dharma Raya",
                "Tahun berdiri \t\t: 1950\n" +
                        "Lokasi perusahaan \t: Temanggung, Jawa Tengah\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tMalang - Jakarta\n" +
                        "2.\tTemanggung - Bogor\n" +
                        "3.\tTemanggung – Jakarta\n" +
                        "4.\tJogja - Jakarta\n"
            ),
            Image(
                R.drawable.img4,
                "Trans",
                "Lort, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            ),
            Image(
                R.drawable.img5,
                "Gunung Harta",
                "Tahun berdiri \t\t: 1993\n" +
                        "Lokasi perusahaan \t: Tabanan,Bali\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tDenpasar - Surabaya\n" +
                        "2.\tDenpasar - jogja\n" +
                        "3.\tSurabaya - jakarta\n" +
                        "4.\tSurabaya - bogor\n" +
                        "Sejarah\t\t\t: \n" +
                        "Perusahaan Otobus Gunung Harta merupakan perusahaan jasa transportasi yang didirikan oleh Bapak I Wayan Sutika pada tahun 1993. Perusahaan Otobus ini beralamat di Jalan Ngurah Rai Nomor 70 Tabanan-Bali. Awal pendirian Perusahaan Otobus, Bapak I Wayan Sutika hanya menyediakan layanan Antar Kota Dalam Provinsi (AKDP) untuk jurusan Denpasar-Gilimanuk. \n" +
                        "Pada tahun 1995, Perusahaan Otobus Gunung Harta memberanikan diri untuk membuka trayek Antar Kota Antar Propinsi (AKAP). Dengan kerja keras Bapak I Wayan Sutika pada tahun 2004 Perusahan Otobus Gunung Harta mampu mengembangkan jumlah armada busnya yaitu sebanyak 40 unit. Selain mengembangkan armada busnya Perusahaan Otobus ini juga membuka trayek baru seperti : Denpasar tujuan Malang, Denpasar tujuan Solo tujuan Yogyakarta, Denpasar tujuan Semarang tujuan Jakarta, Denpasar tujuan Madiun tujuan Maospati tujuan Ponorogo, Denpasar tujuan Malang tujuan Blitar tujuan Tulungagung, dan Denpasar tujuan Surabaya tujuan Kediri\n"
            ),
            Image(
                R.drawable.img6,
                "PO Haryanto",
                "Tahun berdiri \t\t: 1982\n" +
                        "Lokasi perusahaan \t: kudus, jawa tengah\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tKudus - jakarta\n" +
                        "2.\tMadura - jakarta\n" +
                        "3.\tSemarang - jakarta\n" +
                        "Sejarah\t\t\t: \n" +
                        "Di sela-sela waktu bekerja sebagai sopir kendaraan militer di kesatuannya, Bapak Haji Haryanto pun meluangkan waktunya untuk menyopiri angkotnya. Saban hari beliau menyopir angkotnya pada pukul 15.00-16.00, kemudian bekerja di Kostrad hingga pukul 19.00. Selepas pukul 22.00, ia mulai mengemudikan angkotnya lagi hingga dini hari. Suka tidak suka, Bapak Haji Haryanto harus mengurangi waktu tidurnya demi menafkahi istri dan ketiga anaknya.Berkat rajin menyopiri angkotnya, tahun-tahun berikutnya Bapak Haji Haryanto terus membeli angkot dari uang yang ia sisihkan.Bekerja sambilan jadi sopir angkot karena sudah bekerja dan mengantongi gaji, pada 1982 Bapak Haji Haryanto memberanikan diri untuk menikah. Tapi, gaji belasan ribu yang diterimanya tiap bulan itu ternyata tak cukup untuk menambal semua kebutuhan hidupnya. Bahkan, rumah sewa berukuran 3 x 4 meter yang beliau huni bersama dengan istrinya tak mampu ia bayar. \"Untuk membayar sewa rumah saja saya utang,\" kenangnya. Kepepet dengan kondisi keuangan yang minim inilah yang justru mempertebal semangat Bapak Haji Haryanto untuk mulai mencari usaha sampingan. Pada 1984, dengan modal uang tabungan kurang dari Rp 1 juta, Haryanto nekat membeli satu unit mobil angkutan kota (angkot) buatan Daihatsu.beliau pun lalu menjadi sopir bagi kendaraan pribadinya yang berpelat kuning. Waktu itu rute yang ia tempuh Pasar Anyar-Serpong. \"Dulu masih kebun karet, jalannya juga enggak sebagus sekarang,\" paparnya.Kendati usianya baru 43 tahun, tahun 2002 lalu, ia melayangkan surat pengunduran diri. \"Saya enggak dapat pesangon, tapi dapat pensiun Rp 800.000 per bulan,\" ujarnya.Sejak pensiun itulah Bapak Haji Haryanto justru sibuk dengan mainan barunya, yaitu PO Haryanto yang dirintisnya pada tahun yang sama. Waktu itu Bapak Haji Haryantomendapat kucuran kredit dari Bank BRI sekitar Rp 3 miliar. Uang itu ia gunakan untuk membeli enam unit bus senilai masing-masing Rp 800 juta. "
            ),
            Image(
                R.drawable.img7,
                "Kramat Djati",
                "Tahun berdiri \t\t: 1968\n" +
                        "Lokasi perusahaan \t: bandung, jawa barat\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tMalang - jakarta\n" +
                        "2.\tSurabaya - bandung\n" +
                        "3.\tSurabaya - jakarta\n" +
                        "Sejarah\t\t\t: \n" +
                        "Kramat Djati adalah salah satu primadona transportasi darat dari Bandung. Didirikan pada tahun 1968 oleh Arief Budiman. Perusahaan telah melayani lebih dari 70 rute ke berbagai daerah di Sumatra, Jawa, dan Bali, lengkap dengan berbagai pilihan kelas dan fasilitas bus yang memenuhi kebutuhan penumpangnya.Perusahaan bus ini awalnya dikenal sebagai Sumber Djaja, sebuah perusahaan jasa pengiriman barang yang melayani rute di dalam kota Bandung, Jawa Barat. Dalam perkembangannya, perusahaan ini menjadi Kramat Djati. Pada tahun 1970, Kramat Djati mulai memperluas layanan bis antar kota dan antarprovinsi (AKAP).Dengan hanya menggunakan satu unit bus kelas ekonomi, perusahaan bus ini memperkenalkan rute baru ke Jakarta. Untuk lebih memperluas area layanannya, Kramat Djati mengembangkan armadanya dan membuka rute ke Merak. Pada tahun 1986, Kramat Djati memperkenalkan bus malam ekspres yang melayani beberapa kota di Jawa Tengah, Jawa Barat, Jawa Timur, dan Yogyakarta. Empat tahun kemudian, layanan ke Bali diluncurkan. \n"
            ),
            Image(
                R.drawable.img8,
                "Eka Cepat",
                "Tahun berdiri \t\t: 1971\n" +
                        "Lokasi perusahaan \t: mojokerto , jawa timur\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tSurabaya - jogja\n" +
                        "2.\tSurabaya - magelang\n" +
                        "3.\tSurabaya - solo\n" +
                        "Sejarah\t\t\t: \n" +
                        "PO.Eka Mira adalah perusahaan transportasi yang melayani angkutan AKAP (Antar Kota Antar Propinsi). Sudah berdiri sejak tahun 1971, didirikan oleh Bp Fendi Haryanto dengan nama awal PO Flores. Sejarah PO.Eka-Mira berasal dari sebuah toko kain yang berada di Jl Mojopahit No. 188 Mojokerto yang dimiliki oleh Bp Fendi Haryanto,  pada sekitar tahun 1971, tercetus ide dari sang pemilik toko untuk membangun bisnis transportasi masal model bis antar kota. Sesuai dengan nama tokonya nama yang dipakai adalah PO Flores.PO Flores ini melayani trayek Antar Kota Antar Propinsi Jurusan Surabaya – Solo PP, dan selain itu juga didirikan PO Surya Agung yang melayani trayek AKDP (Antar Kota Dalam Propinsi) Jurusan Malang – Surabaya – Ponorogo/Magetan. PO ini seangkatan dengan beberapa PO lama seperti Maju Mapan, Sumber Kencono,  Surya Jaya,  Rukun Makmur, Adi Jaya, Tunggal Jaya, Hasti, Jaya Raya, Agung Express, Piala, dll, meski sebagian besar diantaranya sudah tidak beroperasi lagi karena sudah gulung tikar.PO ini sempat mengoperasikan bis bumel yg mewah, dilengkapi dengan AC ( Air Conditioner ) dengan nama Surya Agung, yang seperti dijelaskan di atas bis ini melayani rute Malang – Surabaya – Madiun – Ponorogo/Magetan PP.\n"
            ),
            Image(
                R.drawable.img9,
                "M-trans",
                "Tahun berdiri \t\t: 1980\n" +
                        "Lokasi perusahaan \t: Bogor , jawa barat\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tMalang -denpasar\n" +
                        "Sejarah\t\t\t: \n" +
                        "Bus berkelir putih dengan garis kuning di bagian bawah bodi pas dipandang mata. Sore itu, bus sedang dipersiapkan untuk keluar dari Karoseri Rahayu Santosa di Nanggewer, Bogor. Tampilan sederhana, khas bus-bus pariwisata yang beredar di tahun 1980-1990-an. Sepintas kita akan terkecoh dengan tulisan Oad Reizen di bus berplat nomor Bali ini. Nama yang belum dikenal luas di kalangan transportasi bus di Indonesia. “Ya kami memang ada kontrak kerjasama dengan biro perjalanan Oad Reizen asal Belanda, untuk melayani wisatawan asal negeri itu,” ujar Manajer Operasional MTrans Bus milik MTrans ini ternyata memiliki desain khusus sesuai permintaan pengontrak. Permintaan lain yang tak kalah rumitnya adalah jarak kursi di dalam bus, peralatan keselamatan hingga perilaku pengemudi dalam mengemudikan bus. Semua harus berstandar bus-bus pariwisata di Eropa, khususnya Belanda.\n"
            ),
            Image(
                R.drawable.img10,
                "Antar Lintas Sumatra",
                "Tahun berdiri \t\t: 1980\n" +
                        "Lokasi perusahaan \t: padang, Sumatra barat\n" +
                        "Melayani trayek\t\t: \n" +
                        "1.\tPadang – malang\n" +
                        "2.\tPadang – Surabaya\n" +
                        "3.\tPadang – Jakarta\n" +
                        "4.\tPadang - banyuwangi\n" +
                        "Sejarah\t\t\t: \n" +
                        "PO ALS sendiri didirikan 29 September 1966 di Kotanopan, Mandailing Natal di Sumatera Utara. Awalnya ALS hanya memiliki trayek Medan-Kotanopan dan berkembang Medan-bukittinngi. Tahun 1972, ALS kemudian membuka trayek ke berbagai kota di Sumatera yakni Banda Aceh, Padang, Pekan Baru, Jambi, Bengkulu, Palembang dan Bandar Lampung. Baru pada tahun 1970-an juga, dimana mobil belum bisa menyeberang ke Jawa dengan kapal ferry ro-ro, ALS sudah membuka trayek ke berbagai tujuan di Pulau Jawa.Penyeberangannya ini ALS memakai jasa agen yang mengurus pemberangkatan penumpang dari pelabuhan Merak dengan kendaraan lain. Tahun 1980-an, saat mobil sudah bisa menyeberang ke Jawa dengan kapal ferry ro-ro, ALS membuka trayek langsung ke Jakarta, Bandung, Semarang, Yogyakarta, dan Surabaya. Kemudian menyusul trayek ke kota Malang dan Jember.Tidak berpuas diri di Pulau Jawa saja, perusahaan bus ini juga mulai menginjakan rodanya di Pulau Bali. PO ALS sendiri terlihat memperbaharui armada busnya. Namun bus Sumatera ini setia mempertahankan warna hijau pada liverynya. Padahal dulunya warna bus ini orange tapi entah kenapa berubah menjadi hijau seperti sekarang ini.\n"
            )
        )

        val reyclerView = findViewById<RecyclerView>(R.id._imageReyclerView)
        reyclerView.layoutManager = LinearLayoutManager(this)
        reyclerView.setHasFixedSize(true)
        reyclerView.adapter = ImageAdapter(this,imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
        val profile= findViewById<Button>(R.id.profil)
        profile.setOnClickListener {
            val intent = Intent(this, about::class.java) //Halamandepan menuju halaman rumah
            startActivity(intent)
        }
    }
}
