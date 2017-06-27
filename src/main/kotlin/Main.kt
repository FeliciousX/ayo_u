external fun require(module: String): dynamic

fun main(args: Array<String>) {
    println("Hello JavaScript!")

    val express = require("express")
    val app = express()

    app.get("/", { req, res ->
        val headers = JSON.stringify(req.headers, { key: String, value: Any? -> value }, 2)
        res.type("text/plain")
        res.send(headers)
        println(headers)
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}
