fun main() {
    print("Задание 1. Введите сумму перевода (перевод осуществляется в рублях): ")
    val perevod = readln().toDouble()
    val comis = maxOf(perevod * 0.0075, 35.0)
    println("Перевод (с учетом комиссии): ${perevod - comis} руб. Комиссия: $comis руб.")


    print("Задание 2. Введите количество лайков: ")
    val like = readln().toInt()
    val people = if (like % 10 == 1 && like % 100 != 11) "человеку" else "людям"
    println("Понравилось $like $people")


    print("Задание 3. Сколько пользователь потратил? ")
    var rub = readln().toDouble()
    print("Пользователь - постоянный клиентом? (Да/Нет) ")
    val postoashka = readln().equals("Да", ignoreCase = true)
    if (rub >= 10001) {
        rub *= 0.95
        if (postoashka) rub *= 0.99
    } else if (rub >= 1001) {
        rub -= 100
    }
    println("К оплате (с учетом скидки): $rub руб.")
}