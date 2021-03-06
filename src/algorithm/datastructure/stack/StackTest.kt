package algorithm.datastructure.stack

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
//    val stack = BaseStack<String>()
//    val stack = ArrayStack<String>(20)
    val stack = ListStack<String>()

    val count = br.readLine().trim().toInt()

    for(i in 1..count) {
        val line = br.readLine().split(" ")

        when (line[0]) {
            "push" -> stack.push(line[1])
            "pop" -> println(stack.pop() ?: -1)
            "maxSize" -> println(stack.size())
            "empty" -> println(stack.empty())
            "peek" -> println(stack.peek() ?: -1)
            else -> Unit
        }
    }

    br.close()
}