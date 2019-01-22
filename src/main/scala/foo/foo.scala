package foo

import org.scalatra._
import io.circe._
import io.circe.parser._
import io.circe.syntax._
import io.circe.generic.auto._
import FlowerData._


class foo extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/flower") {
    FlowerData.all.asJson
  }

  get("/json") {
    List(1,2).asJson
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