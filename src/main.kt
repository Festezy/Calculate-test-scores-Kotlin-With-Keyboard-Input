/** LATIHAN 1 if else*/
/** LATIHAN 2  when*/
/** PROGRAM MENGHITUNG NILAI/ CALCULATION test Scores*/
fun main() {
    print("Input Nilai: "); val input = readLine()
    val skor = input?.toInt()
    var grade = ""
    //    var skor = 50

    println("Batasan skor = 0 - 100")
    println("skor: $skor")

    if (skor in 0..100) { // using range check
        if (skor!! <= 60) {
            grade = "D"
            println("Nilai D")

        } else if (skor <= 70) {
            grade = "C"
            println("Nilai C")

        } else if (skor <= 80) {
            grade = "B"
            println("Nilai B")

        } else {
            grade = "A"
            println("Grade A")
        }
    }

    when (grade) {
        "A", "B" -> println("kamu lulus ")
        "C" -> println("Remedial")
        "D" -> println("kamu tidak lulus")
    }
}
