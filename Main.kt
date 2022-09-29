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



















}
