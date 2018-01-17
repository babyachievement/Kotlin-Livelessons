package com.alvin.kotlincourse.interop

import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor

fun main(args: Array<String>) {/**/
    val customer = CustomerJava()
    customer.id = 1
    customer.name = "babyachievement"
    customer.email = "babyachievement@gmail.com"

    customer.prettyPrint()

    val runnable = Runnable { println("Invoking") }
    Executors.newSingleThreadExecutor().execute(runnable)
}

class CustomerKotlin:PersonJava() {

}

class CustomerRepositoryKotlin : CustomerRepository {
    override fun getById(id: Int): CustomerJava? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}