package kotlinSubmissionAfternoon.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan: String = "Ahmad"
    val namaBelakang: String = "Maulana"
    val umur: Int = 20
    val status: Boolean = false
    println(
        """
        Nama Depan : $namaDepan
        Nama Belakang : $namaBelakang
        Umur : $umur
        Status : ${if (status) "Single" else "Double"}
    """.trimIndent()
    )
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
//    println("Group ID : $groupId")
//    println("Group Member : ")
//    for (member in groupMember) {
//        println("- $member")
//    }
//    println("Session : $session")
    return println("Group ID : $groupId \nGroup Member : $groupMember \nSession : $session")
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val member = listOf(
        "Ahmad Maulana",
        "Gina Salma Sabilla",
        "Alysa Syakirah",
        "Dariwan",
        "Syauqillah Hadie Ahsana"
    )
    return listOf(member[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = listOf("Kak Kelvin", "Kak Iffan", "Kak Shania").count()
    val countOfGroup = myTeam().count()

    return mentor + countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(
        "1",
        listOf(
            "Ahmad Maulana",
            "Gina Salma Sabilla",
            "Alysa Syakirah",
            "Dariwan",
            "Syauqillah Hadie Ahsana"
        ),
        "Afternoon"
    )

}