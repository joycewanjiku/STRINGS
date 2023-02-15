fun main(){
    school("akirachix")
println(student("joy",20))

    val j= fullSentence("table", 1)
    println(j)
}
fun  school(name:String){
    println(name[0])
    println(name[2])
    println(name[3])
}
fun student(name: String ,age:Int):String{
    return "Hi, my $name and am $age years old"

}
fun fullSentence(name: String, length: Int): String{
    var sentence= "The measurement of the $name is $length metres"
    return sentence

}
fun name(name: String){
    var NAME ="joy"
    if(name==NAME)
        println("that's me")
    println("i dont know who that is")

}




