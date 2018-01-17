package com.alvin.kotlincourse.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun operation(x: Int, op: (Int) -> Unit) {
    op(x)
}

fun main(args: Array<String>) {
    operation(operation(1, 2, ::sum), ::println)
    val someLambda: (Int, Int) -> Int = { x, y -> y - x }
    operation(1, 2, someLambda)
}