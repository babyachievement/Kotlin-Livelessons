package com.alvin.kotlincourse.basics

/**
 * File: LoopsAndRanges
 * -------------------------------------------------
 * date: 2018/1/2 13:39
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */


fun main(array: Array<String>) {
    for (a in 1..100) {
        println(a)
    }

    val numbers = 1..100

    for (a in numbers) {
        println(a)
    }

    for (a in 100 downTo 1) {
        println(a)
    }

    for (b in 100 downTo 1 step 5) {
        println(b)
    }

    val capitals = listOf("London", "Paris", "Roma", "Madrid")

    for (capital in capitals) {
        println(capital)
    }


    var i = 100

    while (i > 0) {
        i--
    }

    do {
        var x = 10
        x--
    } while (x > 10)

    // label
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                break@loop
            }
        }
    }
}