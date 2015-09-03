package main.scala

/**
 * Created by dmjenn02 on 9/2/15.
 */
import scala.xml.XML

object kmlExtractor {
  def main(args: Array[String]) {

    val xml = XML.loadFile("files/sample.kml")
    val coords = xml \\ "coordinates"
    println(coords)
  }
}
