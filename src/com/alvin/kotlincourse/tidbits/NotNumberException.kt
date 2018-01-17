package com.alvin.kotlincourse.tidbits

import java.io.BufferedReader
import java.io.FileReader

/**
 * File: NotNumberException
 * -------------------------------------------------
 * date: 2018/1/5 14:15
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */
class NotNumberException : Throwable() {
}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Integer, Long, Float, Double -> throw NotNumberException()
    }
}

fun main(args: Array<String>) {
    try {
        checkIsNumber("a")
    } catch (e: NotNumberException) {
        println("Is not a number")
    }

    val bufferedReader = BufferedReader(FileReader("README.md"))

    val buffer = CharArray(30)

    try {
        bufferedReader.read(buffer, 0, 100)
    } catch (e: IndexOutOfBoundsException) {
        println("Index out of bounds")
    } finally {
        bufferedReader.close()
    }
}