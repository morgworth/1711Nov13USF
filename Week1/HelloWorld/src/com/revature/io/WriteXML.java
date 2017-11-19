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
	static String filename = "src/logs/RhodesWebsite.xml";
	
	public static void main(String[] args) {
		try{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			// the third option for Document in the dropdown when putting
			// in the info. pick the w3c.org 
			Document doc = dBuilder.newDocument();
			
			
			//add elements:
			
			// root elements:
			
			Element root = doc.createElement("Parts");
			doc.appendChild(root);
			
			Element root1 = doc.createElement("Docs");
			doc.appendChild(root1);
			
			// other elements:
			Element wre = doc.createElement("Plumber");
			root.appendChild(wre);
			Element el = doc.createElement("Electtrician");
			root.appendChild(el);
			Element hvac = doc.createElement("HVAC");
			root.appendChild(hvac);
			Element cool = doc.createElement("AC");
			root.appendChild(cool);
			
			
			Attr attr = doc.createAttribute("plumbing");
			attr.setValue("Wrench");
			wre.setAttributeNode(attr);

			Attr attr1 = doc.createAttribute("Electrical");
			attr1.setValue("Lineman-Pliers");
			el.setAttributeNode(attr1);
			
			Attr attr2 = doc.createAttribute("Heating");
			attr2.setValue("Multimeter");
			hvac.setAttributeNode(attr2);
			
			Attr attr3 = doc.createAttribute("measuring");
			attr3.setValue("Voltage");
			cool.setAttributeNode(attr3);
			
			
			
			//write the content to xml

			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer tr = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filename));

			tr.transform(source,  result);
			StreamResult consoleResult = new StreamResult(System.out);
			tr.transform(source, consoleResult);
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


}
