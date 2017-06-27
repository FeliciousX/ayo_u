external fun require(module:String):dynamic

fun main(args: Array<String>) {
  println("Hello JavaScript!")

  val express = require("express")
  val app = express()

  app.get("/", { req, res ->
    res.type("text/plain")
    res.send(JSON.stringify(req.headers, { key:String, value:Any? -> value }, 2))
  })

  app.listen(3000, {
    println("Listening on port 3000")
  })
}
