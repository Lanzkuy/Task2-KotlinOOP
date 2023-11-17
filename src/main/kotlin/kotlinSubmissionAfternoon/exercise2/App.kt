package kotlinSubmissionAfternoon.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val even = mutableListOf<Int>()
    for (i in 1..100) {
        if (i % 2 == 0) {
            even.add(i)
        }
    }
    println(even)


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst... */
    val monthMap = mutableMapOf<String, String>()
    monthMap["Jan"] = "January"
    monthMap["Feb"] = "February"
    monthMap["Mar"] = "March"
    monthMap["Apr"] = "April"
    monthMap["Mei"] = "Mei"
    monthMap["Jun"] = "June"
    monthMap["Jul"] = "July"
    monthMap["Aug"] = "August"
    monthMap["Sep"] = "September"
    monthMap["Oct"] = "October"
    monthMap["Nov"] = "November"
    monthMap["Dec"] = "December"

    /** Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst... */
    monthMap.forEach{ data ->
        println("${data.key} -> ${data.value}")
    }

    /** Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}" */
    val monthNow = "November"
    val birthMonth = "September"
    println("It's $monthNow now, I was born in $birthMonth")
}