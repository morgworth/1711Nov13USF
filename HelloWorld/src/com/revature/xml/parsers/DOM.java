package com.revature.xml.parsers;


import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DOM 
{
/*
 * DOM XML Parser in Java:
 * DOM stands for Document Object Model and it represents
 * XML in a tree format, where every element represent a trre
 * branch. A Dom parser creates an in-memory trre representation of the xml
 * file,then parses it. So it requires more memory.
 * Dom parsing is fast for a small xml file but is slow or 
 * may not even load larger xml files because it requies a 
 * lot of memory to create an Xml Dom tree.
 */
	static String filename = "src/com/revature/xml/squishy.xml";
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Document represents out XML tree
		try{
			
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db =dbf.newDocumentBuilder();
		Document doc = db.parse(new File("src/com/revature/i/squishy.xml"));
		doc.normalize();
		
		//gets node name for root node
		String root = doc.getDocumentElement().getNodeName();
		
		//get persons node
		NodeList person = doc.getElementsByTagName("person");
		for(int i =0;i<person.getLength();i++)
		{
			//** get "leaves" **//
			NodeList leaves = person.item(i).getChildNodes();
			for(int x =0;x<leaves.getLength();x++)
			{
				if(leaves.item(x).getNodeType()==Node.ELEMENT_NODE)
				{
					System.out.println(leaves.item(x).getTextContent());
				}
			}
			System.out.println("--");
		}
		}
		catch(ParserConfigurationException e)
		{
			e.printStackTrace();
		}
		catch(SAXException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
