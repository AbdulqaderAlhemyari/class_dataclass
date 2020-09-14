fun main() {
    val teacher1=Teacher("Mohktar",29)
    val teacher2=Teacher("Haithem",27)
    val teacher3=Teacher("Haithem",27)
    println(teacher1)
    println(teacher1.equals(teacher2))
    println(teacher2.equals(teacher3))

    val stu1=Student("Yaseen",23)
    var stu2=Student("abdulqader",24)
    val stu3=Student("abdulqader",24)
    println(stu1)
    println("you can compare between to data class object value " )
    println(stu1.equals(stu2))
    println(stu2.equals(stu3))



}


class Teacher(name:String,age:Int){

}
data class Student(var name:String,var age:Int)