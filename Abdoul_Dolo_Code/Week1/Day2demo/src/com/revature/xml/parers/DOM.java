package com.revature.xml.parers;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOM {
	/*
	 * DOM XML Parser in Java:
	 *DOM stands for document Object Model and it represents
	 *XML in a tree format, where every element in memory tree representation
	 * */
	static String filename = "src/com/evature/xml/people.xml";
	public static void main(String[] args) {
		
		try{
		//Document represents our XML tree
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = (Document) db.parse(new File(filename));
		doc.normalize();
		
		String root = doc.getDocumentElement().getNodeName();
		
		NodeList person = doc.getElementsByTagName("person");
		for(int i = 0; i < persons.getLength(); i++){
			NodeList leaves = persons.item(i).getChildNodes();
			for(int x = 0); x < leaves.getLength(); x++){
				if(leaves.item(x).getNodeType() == Node.ELEMENT_NODE){
					System.out.println(leaves.item(x).getTextContent());
				}
				System.out.println("-------");
			}
		}
		
	}catch (ParserConfigurationException e){
		e.printStackTrace();
	}catch (SAXException e){
		e.printStackTrace();
	}catch (IOException e){
		e.printStackTrace();
	}
	}
}

