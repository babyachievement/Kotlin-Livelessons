package com.alvin.kotlincourse.basics

/**
 * File: Variables
 * -------------------------------------------------
 * date: 2018/1/2 11:42
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */

fun main(args: Array<String>) {
    var streetNumber: Int
    var streetName = "High Street"

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01


    val myInt = 100
    val myLongAgain:Long = myInt.toLong()


    val myChar = 'A'
    val myString = "My String"
    val escapeCharacters = "A new line \n"

    val rawString = "Hello" +
            "This is second line"+
            "A third line"


    val multipleLine = """
        This is a String
        This is another line
        """

    val years = 10

    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"
}