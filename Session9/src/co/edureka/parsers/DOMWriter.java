package co.edureka.parsers;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Employee{
	
	// Attributes of Object
	int eid;
	String name;
	String email;
	int salary;
	String department;
}

public class DOMWriter {

	public static void main(String[] args) {
		
		// Employee Object is constructed in the RAM and is temporary !!
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "John";
		e1.email = "john@example.com";
		e1.salary = 30000;
		e1.department = "Research";
		
		// We will write code to generate an XML File and save the employee details in it !!
		
		try {
			
			// Built in Class
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // newInstance gives an object of DocumentBuilderFactory
			DocumentBuilder builder = factory.newDocumentBuilder(); //newDocumentBuilder  gives an object of DocumentBuilder
			
			// Document API (represent structure of XML file in an Object way ) will be used to create an XML File
			Document document = builder.newDocument(); // newDocument gives an object of Document
			
			// Tags or Elements needed in XML Document !!
			Element elmRoot = document.createElement("employees");
			Element elmEmployee = document.createElement("employee");
			Element elmEid = document.createElement("eid");
			Element elmName = document.createElement("name");
			Element elmEmail = document.createElement("email");
			Element elmSalary = document.createElement("salalry");
			Element elmDepartment = document.createElement("department");
			
			// Content within Tags or Elements needed in XML Document !!
			Text txtEid = document.createTextNode(String.valueOf(e1.eid));
			Text txtName = document.createTextNode(e1.name);
			Text txtEmail = document.createTextNode(e1.email);
			Text txtSalary = document.createTextNode(String.valueOf(e1.salary));
			Text txtDepartment = document.createTextNode(e1.department);
			
			// Putting the textual content within the tag
			elmEid.appendChild(txtEid);
			elmName.appendChild(txtName);
			elmEmail.appendChild(txtEmail);
			elmSalary.appendChild(txtSalary);
			elmDepartment.appendChild(txtDepartment);
			
			// Putting the tags with data in the root tag and the document
			elmEmployee.appendChild(elmEid);
			elmEmployee.appendChild(elmName);
			elmEmployee.appendChild(elmEmail);
			elmEmployee.appendChild(elmSalary);
			elmEmployee.appendChild(elmDepartment);
			
			elmRoot.appendChild(elmEmployee);
			
			document.appendChild(elmRoot);
			
			// Transform document object in an XML File
			
			// Source:
			DOMSource source = new DOMSource(document);
			
			// Destinition:
			File file = new File("/Users/ishantkumar/Downloads/myemployees.xml");
			FileOutputStream fos = new FileOutputStream(file);
			StreamResult result = new StreamResult(fos);
			
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			
			transformer.transform(source, result);
			System.out.println("=="+file.getName()+" Generated==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}

}
