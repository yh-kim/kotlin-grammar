package algorithm.datastructure.queue

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2017-05-26
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var queue = Queue<String>()

    val count = br.readLine().trim().toInt()

    for(i in 1..count) {
        val line = br.readLine().split(" ")

        when (line[0]) {
            "push" -> queue.push(line[1])
            "pop" -> println(queue.pop() ?: -1)
            "size" -> println(queue.size())
            "empty" -> println(queue.empty())
            "front" -> println(queue.front() ?: -1)
            "back" -> println(queue.back() ?: -1)
            else -> Unit
        }
    }

    br.close()
}