package com.alvin.kotlincourse.inheritance

/**
 * File: CustomerRepository
 * -------------------------------------------------
 * date: 2018/1/5 13:25
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */
interface CustomerRepository {
    // Kotlin中接口的方法可以有方法体，这就像极了抽象类，但还是不同的，Kotlin中的接口不能有状态数据
    // val isEmpty:Boolean = true // 编译不通过

    // 但接口可以有属性
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {

    }

    fun getById(id: Int): Customer
}

class SQLCustomerRepository : CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1 {
    fun funA() {
        println("fun A from Interface1")
    }
}

interface Interface2 {
    fun funA() {
        println("fun A from Interface2")
    }
}

class Class1And2 : Interface1, Interface2 {
    override fun funA() {
        super<Interface1>.funA() // 指定要调用哪个接口的方法
    }

}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.funA() // 将打印出"fun A from Interface1"
}