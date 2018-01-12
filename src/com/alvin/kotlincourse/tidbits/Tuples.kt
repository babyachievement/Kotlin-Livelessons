package com.alvin.kotlincourse.tidbits

/**
 * File: Tuples
 * -------------------------------------------------
 * date: 2018/1/5 14:30
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */
fun capitalAndPolulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 2200000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>) {
    val result = capitalAndPolulation("Madrid")
    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("Spain")
    countryInfo.third

    val (capital, _, population) = countryInformation("Spain")
    println(capital)
    println(population)
}