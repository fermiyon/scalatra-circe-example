package foo

import org.scalatra._

class foo extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/deneme") {
    views.html.hello()
  }

}
