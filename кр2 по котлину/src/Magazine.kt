import Interface.*
class Magazine (var zhanr:String,var avtor:String,var vpsk:Int,empname:String,empnum:Int,empdata:Int):Info(empname,empnum,empdata){

    open fun inff(){
        println("это ${vpsk} выпуск,тематика этого журнала- ${zhanr},автор этого журнала- ${avtor}")
    }
    open fun neww(){
        if(vpsk>2) println("этот журнал популярный")
    }
}