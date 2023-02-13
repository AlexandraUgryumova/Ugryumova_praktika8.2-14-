fun main(){
    val Car1 = Car()
    var power1: Int
    while(true){
        try{
            println("напишите марку автомобиля")
            val mark1 = readLine().toString()
            Car1.marks = mark1
            while (true) {
                println("какая мощность автомобиля?")
                power1 = readLine()!!.toInt()
                if(power1 > 0) break
                else
                    println("такой мощности не может быть")
            }
            Car1.power = power1
            println("какой ценовой категории?\n1. от 200тыс до 650тыс рублей\n2. от 650тыс до 1млн рублей\n3. от 1млн до 5млн")
            val sale1: Int = readLine()!!.toInt()
            when(sale1){
                1->Car1.sale = "Дешевая"
                2->Car1.sale = "Средней стоимости"
                3->Car1.sale = "Дорогая"
                else ->println("выбран отсутсвующий вариант,автоматически выбран дешёвый")
            }
            Car1.SaleCar1()
            break
        }
        catch (e: Exception){
            println("ошибка в написании")
        }
    }
}