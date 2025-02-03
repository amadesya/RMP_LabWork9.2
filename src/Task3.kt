fun main() {
    val goods = mutableMapOf(
        "Royal Canin" to 2133,
        "Кожаный ремень" to 539,
        "Худи" to 2154
    )

    while (true) {
        println("Выберите действие:\n1 - Добавить товар\n2 - Найти товар\n3 - Подсчитать дубликаты\n4 - Удалить товар")
        when (readln().toIntOrNull()) {
            1 -> addGoods(goods)
            2 -> findGoods(goods)
            3 -> countDuplicates(goods)
            4 -> deleteGoods(goods)
            else -> println("Некорректный выбор действия")
        }
    }
}

fun addGoods(goods: MutableMap<String, Int>) {
    println("Введите количество товаров, которое вы хотите добавить")
    val n = readln().toIntOrNull()
    if (n == null || n < 0) {
        println("Введено неверное количество элементов")
        return
    }
    repeat(n) {
        println("Введите название товара")
        val goodName = readln()
        println("Введите цену товара")
        val price = readln().toDoubleOrNull()?.toInt()
        if (price == null) {
            println("Некорректная цена")
        } else {
            goods[goodName] = price
        }
    }
    displayGoods(goods)
}

fun findGoods(goods: Map<String, Int>) {
    println("Введите название товара для поиска")
    val key = readln()
    println(goods[key]?.let { "Товар: $key - Цена: $it" } ?: "Товара с таким названием нет")
}

fun countDuplicates(goods: Map<String, Int>) {
    println("Введите цену для подсчёта дубликатов")
    val duplicate = readln().toIntOrNull()
    if (duplicate == null) {
        println("Некорректная цена")
        return
    }
    val count = goods.values.count { it == duplicate }
    println(if (count > 0) "Найдено $count товара(ов) с такой ценой: $duplicate" else "Нет такой цены")
}

fun deleteGoods(goods: MutableMap<String, Int>) {
    println("Введите название товара для удаления")
    val deletingGood = readln()
    if (goods.remove(deletingGood) != null) {
        println("Товар удалён. Обновленный список:")
        displayGoods(goods)
    } else {
        println("Данный товар не найден")
    }
}

fun displayGoods(goods: Map<String, Int>) {
    goods.forEach { (i, k) -> println("Товар: $i - Цена: $k") }
}
