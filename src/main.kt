import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    val n =0
    while(n == 0){
        explorer()

        println("Хотите ли вы продолжить тестирование задач? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()
        when(answer)
        {
            "lf","да","yes" -> continue
            "ytn","нет","no" -> break
            else ->{println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход");break }
        }
//        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
//            continue
//        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
//            break
//        else
//        {
//            println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход")
//            break
//        }
    }
}
fun explorer()
{
    println("Добро пожаловать!\nЭта программа является решебником по задачнику Абрамяна на языке Kotlin.\nВнутренний синтаксис(Begin1 - b1)")
//    print("Список доступных задач:\nBegin12\nBegin13\nBegin23\nBegin33\nInteder28\nFor1\nArray1\nIf30\nIf29\nIf28\nIf1\nIf2\nIf3\nCase1\nInteger19\nInteger20\nBoolean7\n")
    print("Выберите задачу: "); var user_choise = readLine().toString().toLowerCase()
    when(user_choise)
    {
        "b1" ->Begin1()
        "b2" ->Begin2()
        "b3" ->Begin3()
        "b4" ->Begin4()
        "b5" ->Begin5()
        "b6" ->begin6()
        "b7" ->Begin7_1()
        "b8" ->Begin8_1()
        "b9" ->Begin9_1()
        "b61" -> begin6_1()
        "b10" -> Begin10_1()
        "b11" -> Begin11_1()
        "b12" -> Begin12()
        "b13" -> Begin13()
        "b15" -> Begin15()
        "if6" -> If6()
        "if8" -> if8()
        "b33" -> Begin33()
//        "b23" -> Begin23()
        "i7"-> Interger7()
        "i9"-> Interger9()
        "i11"-> Integer11()
        "i28" -> Integer28()
        "f1" -> For1()
        "a1" -> Araray1()
        "if30" -> If30()
        "if29" -> If29()
        "if28" -> If28()
        "if1" -> If1()
        "if2" -> If2()
        "if3" -> If3()
        "i19" -> Integer19()
        "i20" -> Integer20()
        "c1" -> Case1()
        "bl7" -> Boolean7()
        "for1" -> For1_master()
        "for2" -> For2_master()
        "i28m" -> Integer28_master()
//
//        "bl34" -> Boolean34()
        "i24" -> Integer24()
        else -> println("Такой задачи нет!")
    }
}

//КУЗНЕЦОВ КИРИЛЛ нетрогать пж пж пж пж пж!!!!!!!!!!!!!

fun Begin1()
{
   var a = 5
   var P = 4*a
   println(P)
}
fun Begin2()
{
    var a = 100
    var S = a*a
    println(S)
}
fun Begin3()
{
    var a = 100
    var b = 400
    var S = a*b
    var P = 2*(a+b)
    println(S)
    println(P)
}
fun Begin4()
{
    var d = 100
    var p = 3.14
    var L = p * d
    println(L)
}
fun Begin5()
{
    var a = 100.0
    var V =a.pow(3)
    var S = 6*a*a
    println(V)
    println(S)
}

fun begin6_1()
{
    var a = 100
    var b = 555
    var c = 222
    var V = a*b*c
    var S = 2*(a*b+b*c+a*c)
    println(V)
    println(S)
}


fun Begin7_1()
{
    var R = 100
    var p =3.14
    var L = 2*p*R
    var S = p*R*R
    println(L)
    println(S)
}

fun Begin8_1()
{
    var a = 100
    var b = 500
    var S = (a+b)/2
    println(S)
}
 fun Begin9_1()
 {
     var a = sqrt(200.0)
     var b = a.pow(2)


println(a)
     println(b)


 }

fun Begin10_1()
{
    var a = 3.0
    var b = 4.0
    var a_2 = a.pow(2)
    var b_2 = b.pow(2)
    var S = a_2+b_2
    var F = a_2*b_2
    var G = a_2*b_2
    var X = a_2/b_2
    println(S)
    println(F)
    println(G)
    println(X)
}

fun Begin11_1()
{
    print("Введите a: ")
    var a = readLine()!!.toDouble()
    print("Введите b: ")
    var b = readLine()!!.toDouble()
    var a_module = sqrt(a.pow(2)) ////// |-20|=20    |-999|=999  |65|=65    -5*(-5)=+25  5*5=25
    var b_module = sqrt(b.pow(2))
    println("Наши числа: $a и $b")
    println("По модулю они равны: a = $a_module и b = $b_module")
    var S = a_module+b_module

    var F = a_module-b_module

    var G = a_module*b_module

    var X = a_module/b_module

//-2*(-2)=4

    print("Сумма модулей: ")
    println(S)
    print("Разность модулей: ")
    println(F)
    print("Произведение модулей: ")
    println(G)
    print("Частное модулей: ")
    println(X)
}





fun begin6() { //решил Лев Горобец
    println("Begin6.\n Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).\n")
    println("Ребро a: ")
    var a = readLine()!!.toDouble()
    println("Ребро b: ")
    var b = readLine()!!.toDouble()
    println("Ребро h: ")
    var h = readLine()!!.toDouble()
    var V = a*b*h
    var S = 2*(a*b+h*b+a*h)
    println("V (Объем) = $V")
    println("S (Площадь поверхности) = $S")
}




fun Begin12()//Миха Розенталь
{
    print("\nBegin12\nДаны катеты прямоугольного треугольника a и b. Найти его гипотенузу и периметр P.\n")
    print("Введите катет а: ")
    var a = readLine()!!.toDouble()
    print("Введите катет b: ")
    var b = readLine()!!.toDouble()
    var c = sqrt(a.pow(2)+b.pow(2)) //sqrt(*выражение*) = (*выражение*).pow(0.5)
    var cpow = (a.pow(2)+b.pow(2)).pow(0.5)
    var P = a+b+c
    var Pcpow = a+b+cpow
    print("Гипотенуза с = $c \n Гипотенуза сpow = $cpow \n")
    print("Периметр = $P \n Периметр(pow) = $Pcpow \n")
}
fun Integer11()//Решила межгалакическая коллегия группы итв-5
{
    print("Integer11.\nДано трехзначное число. Найти сумму и произведение его цифр.\n")
    print("Введите число от -999 до 999: ")
    var number = readLine()!!.toInt()
    println("Сотни: ${number/100}")
    println("Десятки: ${number%100/10}")
    println("Единицы: ${number%100%10}")
    println("Сумма: ${number/100+number%100/10+number%100%10}")
    println("Произведение: ${number/100*number%100/10*number%100%10}")
}
fun If30_1()
{

}
fun Interger7()//Решила Ожогина Танюшка!11!!!11
{
    print("Integer7.\n Дано дыухзначное число. Найтри сумму и произведение его цифр.\n")
    print("Введите число от -99 до 99: ")
    var number = readLine()!!.toInt()
    println("Десятки: ${number/10}")
    println("${number%10}")
    println("Сумма: ${number/10+number%10}")
    println("Произведение: ${number/10*number%10}")



}
fun Interger9()// Снова Ожогина Танюшка лол!!1!!!!1!
{
    print("Integer9.\n Дано трёхзначное число. Используя одну операцию деления нацело, вывести первую цифру данного числа(сотни)\n")
    print("Введите число от -999 до 999: ")
    var number = readLine()!!.toInt()
    println("Сотни: ${number/100}")
}
// большая коробка решений Гладких Марины *_*
fun Integer28()
{
    val days = mapOf(1 to "Понедельник", 2 to "Вторник", 3 to "Среда", 4 to "Четверг", 5 to "Пятница", 6 to "Суббота", 0 to "Воскресенье")

    print("Введите номер дня недели, которым было 1-е января: "); val N = readLine()!!.toInt()
    print("Введите номер дня года: "); val K = readLine()!!.toInt()
// а
    var i = (1 + N - 1) % 7
    println("1-е января: 1\nДень недели: ${days[i]}\n")

    var n = (K + N - 1) % 7
    println("День года: $K\nДень недели: ${days[n]}")
}
fun For1()
{
    println("Введите целые числа K и N, большее нуля.")
    print("K: ");
    val K = readLine()!!.toInt()
    print("N: ");
    val N = readLine()!!.toInt()

    for (i in 0..N) {
        println(K)
    }
}
fun Araray1()
{
    print("Введите число N, большее нуля: "); val N = readLine()!!.toInt()
    val numbers: Array<Int> = Array(N) { 0 }
    for(i in 0..N)
    {
        numbers[i] = i * 2 + 1

    }
    println(numbers)
}
fun If30()
{
    val n = 0
    while(n == 0)
    {
        print("Введите число в диапазоне от 1 до 999: "); val number = readLine()!!.toInt()

        if (number >= 0 && number < 10)
        {
            if (number % 2 == 0)
                println("Число $number является чётным однозначным")
            else
                println("Число $number является нечётным однозначным")
        }
        else if (number >= 10 && number < 100)
        {
            if (number % 2 == 0)
                println("Число $number является чётным двузначным")
            else
                println("Число $number является нечётным двузначным")
        }
        else if (number >= 100 && number < 1000)
        {
            if (number % 2 == 0)
                println("Число $number является чётным трёхзначным")
            else
                println("Число $number является нечётным трёхзначным")
        }
        else if (number < 1 || number > 999)
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString()

        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
            continue
        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
            break
        else
        {
            println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход")
            break
        }
    }
}
fun If6() //решил Лев Горобец
{
    println("If6.\n Даны два числа. Вывести большее из них.")
    println("Первое число: ")
    var a = readLine()!!
    println("Второе число: ")
    var b = readLine()!!
    if (a > b) {
        println("Большее число: $a")
    } else if (b > a) {
        println("Большее число: $b")
    } else if (a == b) {
        println("Оба числа равны.")
    } else {
        println("Программа тебя не понимает.")
    }
}
fun if8() //решил Лев Горобец
{
    println("If8.\nДаны два числа. Вывести вначале большее, а затем меньшее из них.")
    println("Первое число: ")
    var a = readLine()!!
    println("Второе число: ")
    var b = readLine()!!
    if (a > b) {
        println("Большее число: $a")
        println("Меньшее число: $b")
    } else if (a == b) {
        println("Оба числа равны.")
    } else {
        println("Большее число: $b")
        println("Меньшее число: $a")
    }
}
fun If29()
{
    val n = 0
    while(n == 0)
    {
        print("Введите целое число: "); val number = readLine()!!.toInt()
        if(number < 0)
        {
            if (number % 2 == 0)
                println("Число $number является чётным отрицательным")
            else
                println("Число $number является нечётным отрицательным")
        }
        else if(number > 0)
        {
            if (number % 2 == 0)
                println("Число $number является чётным положительным")
            else
                println("Число $number является нечётным положительным")
        }
        else if(number == 0)
            println("Число $number является нулевым")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString()

        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
            continue
        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
            break
        else
        {
            println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход")
            break
        }
    }
}
fun If28()
{
    val n = 0
    while (n == 0)
    {
        print("Введите номер года: "); val number = readLine()!!.toInt()

        if(number % 4 == 0)
        {
            if(number % 100 == 0 && number % 400 != 0)
                println("$number год не является високосным. В нем 365 дней")
            else
                println("$number год является високосным. В нем 366 дней")
        }
        else
            println("$number год не является високосным. В нем 365 дней")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString()

        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
            continue
        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
            break
        else
        {
            println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход")
            break
        }
    }
}
fun If1()
{
    val n = 0
    while(n == 0)
    {
        print("Введите целое число: "); var number = readLine()!!.toInt()

        if(number > 0)
            println("Число $number положительно.\nПрибавляем к нему 1\nРезультат: ${number + 1}")
        else if(number < 0)
            println("Число $number отрицательно.\nНикаких действий не выполняется\nРезультат: $number")
        else
            println("Число $number является нулём.")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString()

        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
            continue
        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
            break
        else
        {
            println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход")
            break
        }
    }
}
fun If2()
{
    val n = 0
    while(n == 0)
    {
        print("Введите целое число: "); var number = readLine()!!.toInt()

        if(number > 0)
            println("Число $number положительно.\nПрибавляем к нему 1\nРезультат: ${number + 1}")
        else if(number < 0)
            println("Число $number отрицательно.\nВычитаем из него 2\nРезультат: ${number - 2}")
        else
            println("Число $number является нулём.")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString()

        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
            continue
        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
            break
        else
        {
            println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход")
            break
        }
    }
}
fun If3()
{
    val n = 0
    while(n == 0)
    {
        print("Введите целое число: "); var number = readLine()!!.toInt()

        if(number > 0)
            println("Число $number положительно.\nПрибавляем к нему 1\nРезультат: ${number + 1}")
        else if(number < 0)
            println("Число $number отрицательно.\nВычитаем из него 2\nРезультат: ${number - 2}")
        else
            println("Число $number является нулём.\nЗаменяем его на 10\nРезультат: 10")

        println("\nХотите продолжить? [да/нет]\n")
        print("Ответ: "); var answer = readLine()!!.toString()

        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
            continue
        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
            break
        else
        {
            println("\nПрограмма не может распознать ваш ответ. Выполнятеся аварийный выход")
            break
        }
    }
}
fun Case1()
{
    val n = 0
    while (n == 0)
    {
        print("Введите число от 1 до 7: "); val number = readLine()!!.toInt()

        when(number)
        {
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
            else -> println("В неделе всего семь дней. Продлить выходные не получится")
        }

        println("\nХотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString()

        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
            continue
        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
            break
        else
        {
            println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход")
            break
        }
    }
}
// всё ещё коробка -_-

///*
//fun main() {
//    var truePassword = "123456"
//
//    println("Введите пароль")
//    var userPass = readLine()
//
//    if (truePassword == userPass) {
//        println("Добро пожаловать!")
//    }
//    else {
//        println("Пароль неверный")
//    }
//}*/
//
//
//
//
////fun main()
////{
////    var Temperature_f = readLine()!!.toDouble()
////    var Tc = (Temperature_f-32)*5/9
////    print(Tc)
////
////}
////    print("Введите скорость первого автомобиля: ")
////    var V1 = readLine()!!.toDouble()
////    print("Введите скорость второго автомобиля: ")
////    var V2 = readLine()!!.toDouble()
////    print("Введите расстояние на момент начала рассчета: ")
////    var S_begin = readLine()!!.toDouble()
////    print("Время прошедшее со старта: ")
////    var T = readLine()!!.toDouble()
////    var S_final =  S_begin+V1*T+V2*T
////        print("Итоговый рассчет: $S_final")
//
//
////    var Week = readLine()!!.toInt()
////    var Year = readLine()!!.toInt()
//import kotlin.math.sqrt
////import kotlin.random.Random
////fun main()
////{
////    B1()
////    var a = Random.nextInt(1,8)
////
////
////
////}
//
//
//
//ето мая точка, вы кто такие, я вас не звал, идите нахфиг) "ArtemKorol1999"
fun Begin13 ()
{
    ("\nBegin13\nДаны два круга с общим центром и радиусами R1 и R2 Найти площади этих кругов S1 и S2, а также площадь S3 кольца\n")
    print("Ввидите внешний радиус кольца:")
    var p = 3.14
    var R1 = readLine()!!.toDouble()
    print("Ввидите внутренний радиус:")
    var R2 = readLine()!!.toDouble()
    print("площадь 1 круга\n")
    var S1 = R1.pow(2)*p
    print(S1)
    print("\nплощадь 2 круга\n")
    var S2 = R2.pow(2)*p
    print(S2)
    print("\nплощадь кольца\n")
    var S3 = S1-S2
    print(S3)
}
fun Begin33()
{
    print("\nBegin33\nИзвестно, что X кг конфет стоит A рублей. Определить, сколько стоит 1 кг и Y кг этих же конфет\n")
    print("Ввидите кол-во кг конфет:\n")
    var X = readLine()!!.toDouble()
    print("Ввидите цену конфет:\n")
    var A = readLine()!!.toDouble()
    print("Цена 1 кг:")
    var kg1 = X/A
    print(kg1)
    print("\nВвидите 2 кол-во кг конфет\n")
    var Y = readLine()!!.toDouble()
    print("Цена 2 партии конфет:\n")
    var Yrub = kg1*Y
    print(Yrub)
}
fun Begin15()
{
    print("\nBegin15\nДана площадь S круга. Найти его диаметр D и длину L окружности,ограничивающей этот круг\n")
    var p = 3.14
    print("Ввидите площадь круга:")
    var S = readLine()!!.toDouble()
    print("Диаметр круга:")
    var D = 2*sqrt(S/p)
    print(D)
    print("Длинна окружности:")
    var R = D/2
    var L = 2*p*R
    print(L)
}
fun Integer19()
{
    print("Integer19\nС начала суток прошло N секунд (N — целое). Найти количество полных минут, прошедших с начала суток\nВвидите кол-во сек.")
    var s = readLine()!!.toInt()
    print("Полное кол-во минут:${s/60}")
}
fun Integer20()
{
    print("Integer20\nС начала суток прошло N секунд (N — целое). Найти количество полных часов, прошедших с начала суток\nВвидите кол-во сек.")
    var s = readLine()!!.toInt()
    print("Полное кол-во часов:${s/360}")
}
fun Boolean7() {
    print("Boolean7\nДаны три целых числа: A, B, C. Проверить истинность высказывания: «Число B находится между числами A и C»\nВвидите 1 число ")
    var A = readLine()!!.toDouble()
    print("Ввидите 2 число")
    var B = readLine()!!.toDouble()
    print("Ввидите 3 число")
    var C = readLine()!!.toDouble()
    if (A < B && B < C) {
        print("Утверждение верно")
    } else if (A > B && B > C) {
        print("Утверждение верно")
    } else print("Утверждение не верно (B не находится между A и C)")
}
//fun Boolean34() {
//    print("Boolean34\nДаны координаты поля шахматной доски x, y (целые числа, лежащие в диапазоне 1–8). Учитывая, что левое нижнее поле доски (1, 1) является черным, проверить истинность высказывания:«Данное поле является белым»/n")
//    print("Выберите координаты клетки")
//    var x = readLine()!!.toInt()
//    var y = readLine()!!.toInt()
//    if (x = 1 && y = 1 || x = 2 && y = 2 || x = 3 && y = 3 || x = 4 && y = 4 || x = 5 && y = 5 || x = 6 && y = 6 || x = 7 && y = 7 || x = 8 && y = 8 || x = 1 && y = 3 || x = 1 && y = 5 || x = 1 && y = 7 || x = 3 && y = 3 || x = 3 && y = 5 || x = 3 && y = 7 || x = 5 && y = 3 || x = 5 && y = 5 || x = 5 && y = 7 || x = 7 && y = 3 || x = 7 && y = 5 || x = 7 && y = 7 || x = 2 && y = 4 || x = 2 && y = 2 || x = 2 && y = 6 || x = 2 && y = 8 || x = 4 && y = 2 || x = 4 && y = 4 || x = 4 && y = 6 || x = 4 && y = 8 || x = 6 && y = 2 || x = 6 && y = 4 || x = 6 && y = 6 || x = 6 && y = 8 || x = 8 && y = 2 || x = 8 && y = 4 || x = 8 && y = 6 || x = 8 && y = 8 ||) {
//        print("Утверждение не верно")
//    } else {
//        print("Утверждение верно")
//    }
//}
//этот проект заброшен создателем
fun  Integer24()
{
    val week_days_list = mapOf(
            1 to "Понедельник",
            2 to "Вторник",
            3 to "Среда",
            4 to "Четверг",
            5 to "Пятница",
            6 to "Суббота",
            0 to "Воскресенье",
    )
    print("Integer24.")
    print("Дни недели пронумерованы следующим образом:\n 0 — воскресенье, 1 — понедельник, 2 — вторник, . . . , 6 — суббота.\nДано целое число K, лежащее в диапазоне 1–365.\nОпределить номер дня недели для K-го дня года, если известно, что в этом году 1 января было понедельником.")
    print("\nВведите день года, который хотите узнать: ")
    var year_days = readLine()!!.toInt()
    var week_days = 1
    var user_choise = (year_days+week_days-1)%7
    print("$year_days-ый день: ${week_days_list[user_choise]}\n")
}
fun integer1() {
    print("Введите расстояние в сантиметрах")
    var a = readLine()!!.toDouble()
    var b = a/100
    print("Количество полных метров= $b")
}


fun begin2(){
    print("Введите сторону квадрата:")
    var a = readLine()!!.toDouble()
    var S = a*a
    print("Площадь квадрата равна: $S")
}
//
fun begin25() {
    print("Введите значение переменной х:")
    var x = readLine()!!.toDouble()
    var y = 3*x.pow(6)-6*x.pow(2)-7
    print("Значение выражения равно : $y")


}
fun begin9 (){
    print("Введите два неотрицательных числа:")
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = sqrt(a*b)
    print("Среднее геометрическое этих двух чисел равно: $c")
}

////import kotlin.math.abs
////
////Савелий Соломатов
////fun main() {
////    //Boolean 40
////    var yes = true;
////    var no = false;
////    print("Введите кординату где стоит конь по вертикали(от 1 до 8):")
////    var x1 = readLine()!!.toInt()
////    print("Введите кординату где стоит конь по горизонтали(от 1 до 8):")
////    var y1 = readLine()!!.toInt()
////    print("Введите кординату куда пойдёт конь по вертикали(от 1 до 8):")
////    var x2 = readLine()!!.toInt()
////    print("Введите кординату куда пойдёт конь по горизонтали(от 1 до 8):")
////    var y2 = readLine()!!.toInt()
////    var vertikal = abs (x1-x2)
////    var gorizontal = abs(y1-y2)
////    var hod = abs(x1-x2)+ abs(y1-y2)
////    print(yes.and((hod == 3 )&&((gorizontal==1)||(gorizontal==2))&&((vertikal==1)||(vertikal==2))))
////}

//////просто строчки (начало)
////fun begin1 () {
////    var a = readLine().toString().toDouble()
////    println(4*a)
////}
//
//
//
////fun begin2() {
////    var a = readLine().toString().toDouble()
////    println(a*a)
////}
//
//
//
////fun begin3() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    println("b: ")
////    var b = readLine().toString().toDouble()
////    var S = a*b
////    var P = 2*(a+b)
////    println("S = $S")
////    println("P = $P")
////}
//
//
//
////fun begin4() {
////    println("d: ")
////    var d = readLine().toString().toDouble()
////    var pi = 3.14 //В качестве значения пи использовать 3.14
////    println(pi*d)
////}
//
//
//
////fun begin5() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    var V = a.pow(3)
////    var S = 6*(a*a)
////    println("V = $V")
////    println("S = $S")
////}
//
//
//
////fun begin6() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    println("b: ")
////    var b = readLine().toString().toDouble()
////    println("h: ")
////    var h = readLine().toString().toDouble()
////    var V = a*b*h
////    var S = 2*(a*b+h*b+a*h)
////    println("V = $V")
////    println("S = $S")
////}
//
//
//
////fun begin7() {
////    println("R: ")
////    var R = readLine().toString().toDouble()
////    var pi = 3.14 //В качестве значения пи использовать 3.14
////    var L = 2*pi*R
////    var S = pi*(R*R)
////    println("L = $L")
////    println("S = $S")
////}
//
//
//
////fun begin8() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    println("b: ")
////    var b = readLine().toString().toDouble()
////    println((a+b)/2)
////}
//
//
////fun begin9() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    println("b: ")
////    var b = readLine().toString().toDouble()
////    println(sqrt(a*b))
////}
/*fun int11() {
    println("Дано трехзначное число. Найти сумму и произведение его цифр.")
    println("Введите число: ")
    var num = readLine().toString().toDouble()
    var num_sot = num/100
    var num_des = num%100/10
    var num_edin = num%100%10/1
    println("Сумма: ${num_sot+num_des+num_edin}")
    println("Произведение: ${num_sot+num_des+num_edin}")
}

 */
//////просто строчки (конец)

fun If8() {
    println("If8.\nДаны два числа. Вывести вначале большее, а затем меньшее из них.")
    println("Первое число: ")
    var a = readLine().toString().toDouble()
    println("Второе число: ")
    var b = readLine().toString().toDouble()
    if (a > b) {
        println("Большее число: $a")
        println("Меньшее число: $b")
    } else if (b < a) {
        println("Большее число: $b")
        println("Меньшее число: $a")
    } else if (a == b) {
        println("Оба числа равны.")
    } else {
        println("Программа тебя не понимает.")
    }
}

fun if4() {
    println("If6.\n Даны два числа. Вывести большее из них.")
    println("Первое число: ")
    var a = readLine().toString().toDouble()
    println("Второе число: ")
    var b = readLine().toString().toDouble()
    if (a > b) {
        println("Большее число: $a")
    } else if (b < a) {
        println("Большее число: $b")
    } else if (a == b) {
        println("Оба числа равны.")
    } else {
        println("Программа тебя не понимает.")
    }
}

fun For1_master()
{
    println("For1\n. Даны целые числа K и N (N > 0). Вывести N раз число K.\n")
    print("Введите число K: ")
    var K = readLine()!!.toInt()
    print("Введите количество N: ")
    var N = readLine()!!.toInt()
    for(counter in 1..N)
    {
        println(K)
    }
}


fun For2_master()
{
    println("For2")
    print("Введите число A: ")
    var A = readLine()!!.toInt()
    print("Введите число B: ")
    var B = readLine()!!.toInt()
    for(counter in A..B)
    {
        println(counter)
    }
    var amount = B-A+1
    print("Количество чисел: $amount\n")
}

//


fun Integer28_master()
{
    val week_days_list = mapOf(
        1 to "Понедельник",
        2 to "Вторник",
        3 to "Среда",
        4 to "Четверг",
        5 to "Пятница",
        6 to "Суббота",
        0 to "Воскресенье",
        666 to "Утро понедельника",
    )

    print("Integer28. Решила межгаллактическая коллегия группы ИТВ5\n")
    print("Дни недели пронумерованы следующим образом: 1 — понедельник,\n 2 — вторник,. . ., 6 — суббота, 7 — воскресенье.\n Дано целое число K, лежащее в диапазоне 1–365, и целое число N, лежащее в диапазоне 1–7.\nОпределить номер дня недели дляK-го дня года, если известно, что вэтом году 1 января было днем недели с номером N.\n")
    print("Введите день года, который хотите узнать: ")
    var year_days = readLine()!!.toInt() //1..365
    print("Введите день недели, которым было 1-е января: ")
    var week_days = readLine()!!.toInt() //1..7
    var user_choise = (year_days+week_days-1)%7
//    if(user_choise==0)
//    {
//        user_choise=user_choise+7
//    }

    print("$year_days-ый день: ${week_days_list[user_choise]}\n")


}






//Дни недели пронумерованы следующим образом: 1 — понедель-ник, 2 — вторник,. . ., 6 — суббота, 7 — воскресенье. Дано целое числоK,лежащее в диапазоне 1–365, и целое числоN, лежащее в диапазоне 1–7.Определить номер дня недели дляK-го дня года, если известно, что вэтом году 1 января было днем недели с номеромN.