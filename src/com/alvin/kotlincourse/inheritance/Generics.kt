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

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()
    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()
}

