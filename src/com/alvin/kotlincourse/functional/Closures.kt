package com.alvin.kotlincourse.functional

import com.alvin.kotlincourse.functional.operation


fun outsideFunction() {
    for (number in 1..30){
        operation(20, { x ->
            println(number)
            x + number
        })
    }
}

fun main(args: Array<String>) {
    outsideFunction()
}