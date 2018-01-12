package com.alvin.kotlincourse.example

import java.util.*

/**
 * File: `GreedyVertexColoring`
 * -------------------------------------------------
 * date: 2018/1/3 15:25
 * Copyright (C) 2008-2018 oneapm.com. all rights reserved.
 * @author haoqiang
 * @version version 1.0
 * @since 1.0
 */

class Graph(private var v: Int) {
    private var adj: Array<LinkedList<Int>>

    init {
        this.v = v
        adj = Array(v, { _ -> LinkedList<Int>() })
    }

    fun addEdge(i: Int, j: Int) {
        adj[i].add(j)
        adj[j].add(i)
    }

    fun greedyColoring() {
        val result = Array(v, { _ -> -1 })

        result[0] = 0

        val available = Array(v, { _ -> true })

        for (i in 1 until v) {
            adj[i].filter { result[it] != -1 }
                    .forEach { available[result[it]] = false }

            var cr = 0

            while (cr < v) {
                if (available[cr]) {
                    break
                }
                cr++
            }

            result[i] = cr

            Arrays.fill(available, true)
        }


        for (i in result) {
            println(i)
        }

    }
}

fun main(args: Array<String>) {
    val graph = Graph(5)
    graph.addEdge(0, 1)
    graph.addEdge(0, 2)
    graph.addEdge(1, 2)
    graph.addEdge(1, 3)
    graph.addEdge(2, 3)
    graph.addEdge(3, 4)
    graph.greedyColoring()

    val graph2 = Graph(5)
    graph2.addEdge(0, 1)
    graph2.addEdge(0, 2)
    graph2.addEdge(1, 2)
    graph2.addEdge(1, 4)
    graph2.addEdge(2, 4)
    graph2.addEdge(4, 3)
    graph2.greedyColoring()
}