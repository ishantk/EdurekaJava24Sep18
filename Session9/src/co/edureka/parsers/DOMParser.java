package co.edureka.parsers;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/employees5oct.xml");
			System.out.println("Is "+file.getName()+" existing? "+file.exists());
			
			// Built in Class
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // newInstance gives an object of DocumentBuilderFactory
			DocumentBuilder builder = factory.newDocumentBuilder(); //newDocumentBuilder  gives an object of DocumentBuilder
						
			// Document API (represent structure of XML file in an Object way ) will be used to read an XML File
			Document document = builder.parse(file);
			System.out.println("Root Element in "+file.getName()+" is: "+document.getDocumentElement().getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println(nodeList.getLength()+" employee tags found in "+file.getName());

			for(int i=0;i<nodeList.getLength();i++){
				
				Node node = nodeList.item(i);
				
				// Downcast Node as Element:
				Element element = (Element)node;
				
				System.out.println("EID\t\t"+element.getElementsByTagName("eid").item(0).getTextContent());
				System.out.println("NAME\t\t"+element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("EMAIL\t\t"+element.getElementsByTagName("email").item(0).getTextContent());
				System.out.println("SALARY\t\t"+element.getElementsByTagName("salary").item(0).getTextContent());
				System.out.println("DEPARTMENT\t\t"+element.getElementsByTagName("dept").item(0).getTextContent());
				
				System.out.println();
				
				// H.W:
				// Create Employee Object and add it to ArrayList/HashMap
			}
			
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
