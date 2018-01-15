package com.alvin.kotlincourse.extentions.strings

fun String.lastChar(): Char = this.get(this.length - 1)


fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}