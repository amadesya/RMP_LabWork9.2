fun main(){
    val failedStudents1 = setOf("Tom", "Sam", "Bob", "Mike")
    val failedStudents2 = setOf("Tom", "Sam", "Kate", "Alice")

    val all = failedStudents1 union failedStudents2
    println("Сколько всего студентов было отправлено на пересдачу: ${all.size}")

    val failedTwoExams = failedStudents1 intersect failedStudents2
    println("Сколько студентов не сдали оба зачёта: ${failedTwoExams.size}")

    val failedOneExams = all subtract failedTwoExams
    println("Сколько студентов не сдали один зачёт: ${failedOneExams.size} ")
}
