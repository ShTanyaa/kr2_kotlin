import kotlinx.coroutines.*
import Interface.*
suspend fun main()= coroutineScope{
    println("введите кол-во функций ")
    var n= readLine()!!.toInt()
    while(true){
        if(n>0) {
            break
        }
        else{
            println("error")
            n= readLine()!!.toInt()
        }
    }
    var inf:Info=Interface("справочник",3,2013)
    launch {
        for(i in 1..n){
            inf.old()
            inf.inf()
            inf.numb()
            delay(5000L)
        }
    }

}