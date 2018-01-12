package com.alvin.kotlincourse.classes

import java.util.*

/**
 * File: Classes
 * -------------------------------------------------
 * date: 2018/1/3 10:22
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */

// 这里的var|val表示id和name是属性，如果没有加var|val，则表示只是构造函数的参数
class Customer(var id: Int, name: String, var email: String = "", val yearOfBirth: Int) {
    init {
        email = email.toUpperCase()
    }

    constructor(id: Int, email: String) : this(id, "", email, 1973)


    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth


    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }

            field = value // 这里使用了关键字field, kotlin中field持有着属性的值
        }

    override fun toString(): String {
        return "Customer(id=$id, email='$email', yearOfBirth=$yearOfBirth)"
    }


}

fun main(args: Array<String>) {
    val customer = Customer(10, "alvin")



    customer.id = 1
    // customer.name // 这里无法访问到name属性，因为没有加上var|val，name只是构造函数的参数

    val customer2 = Customer(1, "babyachievement@gmail.com")

    println(customer2)

    customer2.socialSecurityNumber = "1234"

}