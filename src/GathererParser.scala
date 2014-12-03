
import scala.xml.Elem
import java.net.{URL, URI}

object GathererParser {

  val GathererHost:String = "gatherer.wizards.com"
  val GathererDefault:String = "/Pages/Search/Default.aspx"
  
  def GetCardByName(name:String):Elem = {
  
    // NOTE: *contains* queries are done by name=+[name]
	val uri = new URI("http",
		GathererHost,
		GathererDefault,
		s"name=[$name]",
		null)
	
	return TagSoupXmlLoader.get().load(uri.toURL())
    
  }
  // LEFTOFF: Iterate through the structure to find shit!
  // LEFTOF: Create an interface to query for stuff on magiccards.info
  // AND to construct better queries!
  // (or.. maybe just by name for now...?)
  
  
  
}