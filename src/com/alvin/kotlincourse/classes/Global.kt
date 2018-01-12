package com.alvin.kotlincourse.classes

/**
 * File: Global
 * -------------------------------------------------
 * date: 2018/1/5 13:11
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */


// object lazy initialization
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    println(Global.PI)

    val localObject= object {
        val PI = 3.14159
    }
    println(localObject.PI)
}