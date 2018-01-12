package com.alvin.kotlincourse.inheritance

/**
 * File: AbstractClasses
 * -------------------------------------------------
 * date: 2018/1/5 13:21
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */

abstract class StoredEntity {
    val isActive = true
    abstract fun store()

    fun status(): String {
        return isActive.toString()
    }
}

class Enmployee : StoredEntity() {
    override fun store() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    println(Enmployee().status())
}