public interface Interface{
    var name:String
    var num:Int
    var data:String

    open fun mgzn(){
        if(num>2) println("эта газета популярная")
    }
    open fun nazn(){
        if(name=="справочник") println("это учебное издание")
    }
}