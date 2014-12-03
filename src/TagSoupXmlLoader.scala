import scala.xml.{Elem, XML}
import scala.xml.factory.XMLLoader
import org.ccil.cowan.tagsoup.jaxp.SAXFactoryImpl
import java.io.FileDescriptor
import java.io.FileInputStream

// Obtained from http://blog.dub.podval.org/2010/08/scala-and-tag-soup.html#!
object TagSoupXmlLoader {

  private val factory = new SAXFactoryImpl()
  
  
  def get(): XMLLoader[Elem] = {
    XML.withSAXParser(factory.newSAXParser())
  }
}