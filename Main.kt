fun main() {
    /*
    MAC hotkeys
    control + R - Run program
    command + C - copy
    command + V - paste
    command + X - cut
     */
    println("Hello yall!")

    var mutableString: String = "Aneudy" // mutable
    val immutableString: String = "Programer"
    val inferredString = "Joseph"

    var age: Int = 9
    var doubleNum: Double = 3.4
    var longNum: Long = 10L
    val floatNum: Float = 34.2F
    val trueBoolean: Boolean = true

    val greeting = "Hello, " + mutableString
    val greetingTemplate = "Hell0 $mutableString"
    val interpolated = "Helloo, ${mutableString.uppercase()}"

    println(interpolated)

    // checking for null
    val someName: String? = "ayyy"
    if(someName != null && someName.length > 0){
        print("String length is ${someName.length}")
    }else{
        print("String is empty")
    }

    // Elvis Operator - Similar to Tenary
    val nullableString = ""
    val nonNullStringLength: Int = nullableString?.length ?: 0

    // Safe Cast
    //val nullableCar: Car? = (input as? Car)
    var theName: String? = null

    val length1: Int? = theName?.length

    // smart casts and checking for null
    var nonNullableAuthor: String
    var nullableAuthor: String?
    if(theName != null){
        nonNullableAuthor = theName
    }else{
        nullableAuthor = theName
    }

    // if to set value
    val x = 100
    val y = 1
    val more = if(x > y) x else y
    val less = if(x < y){
        println("X is smaller")
        x
    }else{
        println("y is smaller")
        y
    }

    // Using when to choose different paths
    val year = 2015
    when(year){
        2010 -> print("Froyo")
        2011 -> print("ice cream sandwich")
        2008, 2009 -> print("The early days")
        in 2012..2015 ->{
            println("Jellybean through marshmellow,")
            println("when things got interesting")
        }else -> println("Some other era")
    }

    // using when to set a value
    val androidEra = when(year){
        2010 -> print("Froyo")
        2011 -> print("ice cream sandwich")
        2008, 2009 -> print("The early days")
        in 2012..2015 ->{
            println("Jellybean through marshmellow,")
            println("when things got interesting")
        }else -> println("Some other era")
    }


    // using when with conditionals to set a value
    val catsOwned = 2
    val dogsOwned = 1
    val judgement = when {
        catsOwned == 0 -> "No cats"
        catsOwned < 0 -> {
            print("Call the cat police!")
            // the last expression is the block's value
            "Owes someone some cats"
        }
        catsOwned == 1 && dogsOwned == 1 -> "Seeking balace"
        catsOwned > 0 && catsOwned < 3 -> "Yay cats!"
        else -> "Cat nirvana"
    }
    println(judgement)




    // Collections: List
    val immutableList = listOf("Alice", "Bob")
    val valMutableList = mutableListOf("Carol", "Dave")
    var varMutableList = mutableListOf("Eve", "Frank")

    // one way to test membership
    val isBobThere1 = "Bob" in immutableList
    // Another way to test membership
    val isBobThere2 = immutableList.contains("Bob")

    val anotherName: String = immutableList[0] // access by index
    valMutableList[1] = "Bart"
    valMutableList.add(2, "Ellen") // add item at index
    // delete by index
    val remoedPerson = valMutableList.removeAt(1)
    // delete by value
    val wasRemoved = valMutableList.remove("Bart")




    // Collections: Map

    val immutableMap = mapOf("Name" to "Kirk","rank" to "captain")
    val mutableMap = mutableMapOf("name" to "picard", "rank" to "captain")
    val hasRankKey = immutableMap.containsKey("rank")
    val hasKirkValue = immutableMap.containsValue("Kirk")

    // access by key, returns nullable
    val name: String? = immutableMap["name"]
    // update value for key
    mutableMap["name"] = "janeway"
    // add new key and value
    mutableMap["ship"] = "Voyager"
    mutableMap.remove("rank") // delete by key
    // delete by key and value
    mutableMap.remove("ship", "Voyager")




    // Collections: Set
    val immutableSet = setOf<String>("Chocolate","Vanilla","chocolate")
    val mutableSet = mutableSetOf("Butterscotch","Strawberry")
    // one way to test membership
    val hasChocolate1 = "chocolate" in immutableSet
    // another way
    val hasChocolate2 = immutableSet.contains("chocolate")
    mutableSet.add("green tea") // add item
    //delete by value
    val flavorWasRemoved = mutableSet.remove("strawberry")




    // Control flow: loops
    for(item in immutableList){
        println(item)
    }
    //iterate over map
    for ((key,value) in mutableMap){
        println("$key -> $value")
    }

    // iterating over ranges
    for(i in 0..10){
        print(i)
    }
    println()
    for(i in 11 until 20){
        print(i)
    }
    println()
    for(i in 10 downTo 1){
        print("$i \t")
    }
    println()

    // while and do-while

    var t = 0;
    while(t < 10){
        t++
        print(t)
    }
    println()

    do{
        t--
        print(t)
    }while(t > 0)
    println()




    // Functions
    fun sayHi(){
        println("Hello")
    }
    sayHi()

    fun sayHello(name: String){
        println("Hello, $name!")
    }
    sayHello("AJ")

    // default parameters
    fun sayFriendlyHello(name: String = "Friend"){
        print("Hello, $name!")
    }
    sayFriendlyHello()
    println()

    // function with mix of regular and default arguments
    fun createCat(name: String = "Kitty", age: Int, isSpayed: Boolean = false){
        print("$name / $age / $isSpayed")
    }
    createCat(age = 2)
    println()
    createCat("Fluffy", 3, true)
    println()

    // function with parameters and return value
    fun total(x: Int, y: Int): Int{
        return x + y
    }
    println(total(4,4))

    // single line expression function
    fun product(x: Int, y: Int) = x * y
    println(product(9,9))

    // a function that accepts another function
    fun doMath(mathOperation: (Int, Int) -> Int, a: Int, b: Int): Int{
        return mathOperation(a,b)
    }

    // calling a function that accepts another function
    val add = doMath(::total, 2, 3)
    val multiply = doMath(::product,2 ,3)
    println(add)
    println(multiply)




    // LAMBDAS
    val adder: (Int, Int) -> Int = {x, y -> x + y}
    // Lambda with single parameter: it keyword
    val square: (Int) -> Int = {it * it}
    // passing a lambda to a function
    val addWithLambda = doMath(adder, 2, 3)




    // Objects
    /*
    object Constants{
        const val baseUrl = "http://duckduckgo.com"
    }
    */

    /*
    class Spaceship(var name: String, val size: Int){
        var speed: Int = 0
        fun fly(){
            speed = 100
        }
        fun isFlying(): Boolean{
            return speed > 0
        }
        // companion object replaces static members
        companion object{
            fun newSpaceship(): Spaceship{
                return Spaceship("Falcon", 25)
            }
        }
    }
    */








    












}

