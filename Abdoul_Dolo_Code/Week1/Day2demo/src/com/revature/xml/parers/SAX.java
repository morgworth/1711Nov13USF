package com.revature.xml.parers;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

public class SAX {
	
	static String filename = "src/com/revature/xml/people.xml";

	public static void main(String[] args) {
		//SAXParserFactory spf = SAXParserFactory.newInstance();
		try{
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sax = spf.newSAXParser();
			
			DefaultHandler handler = new DefaultHandler();
				boolean fn = false;
				boolean ln = false;
				boolean age = false;
				
				public void startElement(String uri, String localName, String name, Attributes attributes){
					System.out.println("Start Element: " + name);
					if (name.equalsIgnoreCase("FIRSTNAME")) fn = true;
					if (name.equalsIgnoreCase("LASTNAME")) fn = true;
					if (name.equalsIgnoreCase("AGE")) fn = true;
				}
			public void endElement(String uri, String localName, String qName)
			throws SAXException {
				System.out.println("End Element" + qName);
			} 
			public void characters(char ch[], int start, int length) throws SAXException{
				if(fn){
					System.out.println("Firstname" + new String(ch, Start, length));
					ln = false;
				}
				if (age){
					System.out.println("Age:" + new String(ch, Start, length));
					age = false;
				}
			}
				
		}catch (ParserConfigurationException | SAXException e){
			e.printStackTrace();
		}
	}
};
sax.parse(filename, handler);
