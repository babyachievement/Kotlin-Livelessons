package com.alvin.kotlincourse.tidbits

/**
 * File: Casting
 * -------------------------------------------------
 * date: 2018/1/5 14:21
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */
open class Person {

}

class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("Your need more vacation")
        }
    }
}

fun hasVacation(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(20) // 这里没有进行转换，compiler做了这部分工作
    } else {
    }
}

class Constractor : Person() {

}

var input: Any = 10

fun main(args: Array<String>) {
    val str = input as? String // 如果input不是String类型的，?编译器不会执行转换
}