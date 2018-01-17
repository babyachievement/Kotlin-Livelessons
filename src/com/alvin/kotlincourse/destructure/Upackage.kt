package com.alvin.kotlincourse.destructure

fun main(args: Array<String>) {
    val list = listOf("test", *args) // * spread operator unpacks the array contents
    println(list)
}