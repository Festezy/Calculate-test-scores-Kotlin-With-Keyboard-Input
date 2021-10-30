/** Latihan Function */
fun main() {
    print("Input Nilai: "); val input = readLine()
    val score = input?.toInt()
//    var skor = 50
    var grade = ""

    println("Batasan skor = 0 - 100")
    println("skor: $score")

    grade = getGrade(score!!)
    println("Grade: $grade")

    printDescription(grade)

}

/** LATIHAN 1 */
fun printDescription(grade: String){
    when (grade){
        "A" , "B" -> println("kamu lulus ")
        "C" -> println("Remedial")
        "D" -> println("kamu tidak lulus")
    }
}

/** LATIHAN 2 */
fun getGrade(score: Int): String {// integer parameter to String return
    var grade = "-"
    if (score in 0..100) {
        if (score <= 60) {
            grade = "D"
            println("Nilai D")

        } else if (score <= 70) {
            grade = "C"
            println("Nilai C")

        } else if (score <= 80) {
            grade = "B"
            println("Nilai B")

        } else {
            grade = "A"
            println("Grade A")
        }
    }
    return grade
}