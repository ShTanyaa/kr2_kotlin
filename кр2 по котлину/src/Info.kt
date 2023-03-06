import  Interface.*
abstract class Info (var name:String,var num:Int,var data:Int){

    open fun old(){
        if(data<2000) println("эта газета устарела")
    }
    open  fun numb() {
        if (num == 1) println("эта газета вышла недавно")
    }
    open fun inf(){
        println("информация о газете")
        println("название: ${name},номер: ${num},дата выпуска: ${data}")
    }
}