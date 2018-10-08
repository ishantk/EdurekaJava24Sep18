package co.edureka.xml;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MySAXHandler extends DefaultHandler{
		
	public void startDocument() throws SAXException {
		System.out.println(">> Document Parsing Started");
	}

	// Reading the starting Tags !!
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.print("<"+qName+">");
	}
	
	// We get content between the Tags
	public void characters(char[] ch, int start, int length) throws SAXException {
		String content = new String(ch,start,length);
		System.out.print(content); // is the data 
	}
	
	// Reading the ending Tags !!
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println(">> Document Parsing Ended");
	}
	
}

public class SAXParserDemo {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/myemployees.xml");
			FileInputStream fis = new FileInputStream(file);
			
			MySAXHandler handler = new MySAXHandler();
			
			// SAXParser API to parse
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			parser.parse(fis, handler);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		

	}

}
