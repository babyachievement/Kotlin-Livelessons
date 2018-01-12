package com.alvin.kotlincourse.inheritance

/**
 * File: Inheritances
 * -------------------------------------------------
 * date: 2018/1/5 13:15
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */
open class Person {
    open fun validate() {

    }


}

open class Customer : Person {
    open override fun validate() {

    }

    constructor() : super() {

    }
}

class SpecialCustomer : Customer() {
}

data class CustomerEntity(val name: String) : Person()