package chap03.section1

fun Sum1(a: Int, b:Int) : Int { //매개변수 자료형 , 리턴받을 자료형
    var sum = a+b
    return sum
}//가장 교과서적인 코딩
fun Sum2( a: Int, b:Int) : Int = a+b //컴파일 과정에서 중괄호 제외해도 가능
fun Sum3(a: Int, b:Int) = a+b  //컴파일과정에서 자동 형정의

fun main(){
    var result1 = Sum3(2,4)
    var result2 = Sum3(3,5)

    println(result1)
    println(result2)
}