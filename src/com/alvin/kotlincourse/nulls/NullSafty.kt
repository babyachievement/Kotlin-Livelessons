package com.alvin.kotlincourse.nulls

/**
 * File: NullSafty
 * -------------------------------------------------
 * date: 2018/1/5 13:53
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */
fun main(args: Array<String>) {
    val message: String = "A message"
    println(message.length)


    val nullMessage: String? = null
    val inferredNull = null

    println(nullMessage?.length) // 如果nullMessage为空,不执行
    println(nullMessage!!.length) // 不管nullMessage是否为空，都要执行

}