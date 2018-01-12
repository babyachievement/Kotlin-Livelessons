package com.alvin.kotlincourse.functions

/**
 * File: Functions
 * -------------------------------------------------
 * date: 2018/1/2 16:21
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */

// function 是顶级对象，不需要封装在类内部

fun hello(): Unit {
    println("Hello")
}


fun throwingExceptions(): Nothing {
    throw Exception("The function throws an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0) = x + y + z

fun printDetails(name: String, email: String = "", phone: String = "") {
    println("name: $name - email: $email - phone: $phone")
}


// unlimited parameters :vararg
fun printStrings(vararg strings: String) {
    reallyPrintStrings(*strings) //
}

private fun reallyPrintStrings(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun main(args: Array<String>) {
    hello()

    val value = returnsAFour()

    println(sum(1, 2))
    sum(1, 2, 3)


    printDetails("alvin", phone = "010283819")

    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")
}