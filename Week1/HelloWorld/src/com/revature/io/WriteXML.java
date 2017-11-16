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

	//static String filename = "HelloWorld/src/logs/samplexml.xml";
	static String filename = "HelloWorld/src/logs/RhodesWebsite.xml";
	
	public static void main(String[] args) {
		try{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			// the third option for Document in the dropdown when putting
			// in the info. pick the w3c.org 
			Document doc = dBuilder.newDocument();
			
			
			//add elements:
			
			// root elements:
			
			Element root = doc.createElement("cars");
			doc.appendChild(root);
			
			
			// other elements:
			Element lux = doc.createElement("luxury");
			root.appendChild(lux);
			Element ev = doc.createElement("Electric");
			root.appendChild(ev);
			
			Attr attr = doc.createAttribute("company");
			attr.setValue("Ferrari");
			lux.setAttributeNode(attr);
			
			Attr attr1 = doc.createAttribute("Owner");
			attr1.setValue("Tony Stark");
			ev.setAttributeNode(attr1);
			
			
			
			
			//write the content to xml
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer tr = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filename));
			tr.transform(source,  result);
			StreamResult consoleResult = new StreamResult(System.out);
			tr.transform(source, consoleResult);
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
