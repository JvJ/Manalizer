
import scala.xml._
import java.net.URI
import java.net.URL
import java.net.HttpURLConnection
import java.io.BufferedReader
import java.io.InputStreamReader

object Main {

  def main (args: Array[String]){
    
    var xmlTest = TagSoupXmlLoader.get().load(new URL("http://www.something.com"));
    
    xmlTest match {
      case <html>{_, <body>{x}</body>}</html> => println(s"Got x: $x")
      case _ => println(s"Got nothing!")
    }
    
    println(xmlTest );
    println("Fhtagn\n");
    
    //println("Stormbreaths:");
    println(GathererParser.GetCardByName("Counterspell"))
  }
}