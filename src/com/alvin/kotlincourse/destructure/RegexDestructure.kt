package com.alvin.kotlincourse.destructure

fun parsePath(path: String) {
    // 这里使用三引号避免转义
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult != null){
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main(args: Array<String>) {
    parsePath("/home/babyachievement/demo.txt")
}