package ru.gc986

import spark.Spark

fun main(args: Array<String>) {

    val port = if (args.isNotEmpty())
                    args[0].toInt()
                else
                    9869

    println("http://localhost:$port") // печатаем в консоль адрес сервера
    println("http://localhost:$port/hello")

    Spark.port(port)

    Spark.get("hello"){ _, _ ->
        "Hi @username"
    }

}

