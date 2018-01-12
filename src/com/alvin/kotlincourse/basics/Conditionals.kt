package com.alvin.kotlincourse.basics

/**
 * File: Conditionals
 * -------------------------------------------------
 * date: 2018/1/2 13:52
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */

fun main(args: Array<String>) {
    var myString = "Not empty"

    val result = if (myString != " ") {
        println("Not empty")
    } else {
        println("Is empty")
    }

    println(result)

    val result2 = "Value"

    val whenValue =  when (result2) {
        "Value" -> {
            println("Its a value")
            println("Second statement")

            "Return from first when case"
            // 这里不用使用break，自带break效果
        }
        is String -> {
            println("Excellent")
            "Remove that"
        }
        else -> {
            println("Nothing")
            "ELSE"
        }
    }

    println(whenValue)
}