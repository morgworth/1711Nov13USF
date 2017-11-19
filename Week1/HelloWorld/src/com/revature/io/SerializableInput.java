package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableInput {

	
	/*
	 * 
	 * To serialize an object means to convert its state to 
	 * a byte stream so that the byte stream can be reverted
	 * back into a copy of the object. A Java object is
	 * serializable if its class 
	 * 
	 * 
	 */
	
	
	static String filename = "HelloWorld/src/logs/bytestream.txt";
	void writeStream(Object o ){
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(o);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Object readObject(Object a){
		Object obj = a;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
		obj = ois.readObject();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} 
		return(obj);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
