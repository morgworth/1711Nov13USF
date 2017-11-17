package com.reveture.xml.parsers;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class SAX {

	
	/*
	 *SAX XML Parser in Java
	 *SAX stands for Simple API for XML Parsing
	 *This is an event based XML parser and it parses 
	 *the XML file step by step. It is much more suitable for larger XML files. SAX XML parser fires an 
	 *event when it encounters an opening tag, element, or
	 *attribute, and parses accordingly. 
	 * 
	 */
	static String filename = "HelloWorld/src/com/revature/xml/people.xml";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sax = spf.newSAXParser();
			//inner class
			DefaultHandler handler = new DefaultHandler(){
				boolean fn = false;
				boolean ln = false;
				boolean age = false;
				
				public void startElement(String uri, String LocalName, String qName, 
						Attributes attributes){
						System.out.println("Start Element: " + qName);
						if(qName.equalsIgnoreCase("FIRSTNAME")) fn = true;
						if(qName.equalsIgnoreCase("LASTNAME")) ln = true;
						if(qName.equalsIgnoreCase("AGE")) age = true;
				}
				public void endElement(String uri, String localName, String qName) throws SAXException {
					System.out.println("End Element" + qName);
				}
				public void characters(char[] ch, int start, int length) throws SAXException {
					if(fn){
						System.out.println("Firstname " + new String(ch, start, length));
						fn  = false;
					}
					if(ln){
						System.out.println("Lastname " + new String(ch, start, length));
						ln  = false;
					}
					if(age){
						System.out.println("Age " + new String(ch, start, length));
						age  = false;
					}
				}
				
			};
			
			sax.parse(filename, handler);
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
