package com.rhodes.forms;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;






public class Forms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println("Well hello there");
			String sourceFile = "Lynda/src/SourceForm.txt";
			String targetFile = "Lynda/src/CompleteForm.txt";
			
			
			
			try {
				
				FileReader fReader = new FileReader(sourceFile);
				BufferedReader bReader = new BufferedReader(fReader);
				FileWriter writer = new FileWriter(targetFile);
			
				while(true){
					String line = bReader.readLine();
					if(line ==null) {
						break;
					} else {
					writer.write(line + "\n");
				}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}



	
	