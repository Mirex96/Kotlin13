// 13. Написать функцию, которая на вход принимает массив и проходится по его значениям. Использовать цикл for
fun main() {
    val array = arrayOf(1,2,3,4,5)
    values(array)
}
fun values(array: Array<Int>) {
    for(i in 1..array.size)
        println(i)

}