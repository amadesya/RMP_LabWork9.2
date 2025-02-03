fun main(){
    var numbers: MutableList<Int> = mutableListOf()
    println("Введите количество элементов списка")
    
    var n = readln().toInt()
    if (n == null || n < 0)
        println("Введено неверное количество элементов")

    for(i in 1..n) {
        println("Введите элемент ${i}")
        var element = readln().toInt()
        if (!(element is Int))
            println("Элемент не добавлен")
        else
            numbers.add(element)
    }

    //через indexOf
    println("Индекс элемента, значение которого равно 100: ${numbers.indexOf(100)} ")
    //через sum
    println("Сумма элементов списка: ${numbers.sum()}")
    //через average
    println("Среднее значение элементов коллекции: ${numbers.average()}")

    //через any
    if (numbers.any{ it >= 0}){
        println("Не все числа больше нуля")
    }
    else{
        println("Все числа больше нуля")
    }

    //через filterNot
    println("Список нечётных чисел: ${numbers.filterNot { it % 2 == 0}}")
}
