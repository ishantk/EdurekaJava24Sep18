package co.edureka;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// import org.glassfish.jersey.servlet.ServletContainer; -> Configure the same in web.xml file

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){
		Date date = new Date();
		String response = "A Plain Textual Hello Response. Today is: "+date;
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		Date date = new Date();
		String response = "<html><body><h3><i>A Plain HTML Hello Response. Today is: "+date+"</i></h3></body></html>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		Date date = new Date();
		String response = "<?xml version='1.0' encoding='UTF-8'?><hello>A Plain XML Hello Response. Today is: "+date+"</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		// JSON is a key value pair a kind of HashMap or dictionary
		Date date = new Date();
		String response = "{ 'hello':'A Plain JSON Hello Response. Today is: "+date+"' }";
		return response;
	}
	
	
}
