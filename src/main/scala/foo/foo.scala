package foo

import org.scalatra._

class foo extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/deneme") {
    views.html.hello()
  }

  get("/json") {
    FlowerData.all
  }

}

object FlowerData {
  case class Flower(slug: String, name: String)

  /**
   * Some fake flowers data so we can simulate retrievals.
   */
  var all = List(
      Flower("yellow-tulip", "Yellow Tulip"),
      Flower("red-rose", "Red Rose"),
      Flower("black-rose", "Black Rose"))
}