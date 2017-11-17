package com.revature.io;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXML {

	static String filename = "src/logs/samplexml.xml";
	

	public static void main(String[] args) {

		try {
			// create XML doc
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.newDocument();
			
			// add elements
			
			// root elements
			Element root = doc.createElement("cars");
			doc.appendChild(root);
			
			// Element 1
			Element lux = doc.createElement("luxury");
			root.appendChild(lux);
			
			// Attribute 1
			Attr attr = doc.createAttribute("company");
			attr.setValue("Ferrari");
			lux.setAttributeNode(attr);
			
			/*
			//Attribute 2
			Element Model = doc.createElement("Model");
			lux.appendChild(Model);
			
			Attr attr2 = doc.createAttribute("California");
			attr2.setValue("California");
			*/
			
			// Element 2
			Element Eco = doc.createElement("Economy");
			root.appendChild(Eco);
			
			// Attribute 1
			Attr attr1 = doc.createAttribute("company");
			attr1.setValue("Toyota");
			Eco.setAttributeNode(attr1);
				
			
			// write the content to xml
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer tr = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filename));
			tr.transform(source,  result);
			StreamResult consoleResult = new StreamResult(System.out);
			tr.transform(source,consoleResult);

		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
