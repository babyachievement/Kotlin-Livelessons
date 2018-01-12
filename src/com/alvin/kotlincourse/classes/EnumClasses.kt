package com.alvin.kotlincourse.classes

/**
 * File: EnumClasses
 * -------------------------------------------------
 * date: 2018/1/3 13:43
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */
enum class Priority {
    MINOR,
    NORMAL,
    MAJOR,
    CRITICAL
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL

    println(priority)
    println(priority.ordinal)
    println(priority.name)

    for (pri in Priority.values()) {
        println(pri)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)
}