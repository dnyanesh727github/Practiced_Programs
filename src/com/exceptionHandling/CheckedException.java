package com.exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

// checked exceptions are those exceptions that are checked at compile-time. 

public class CheckedException {

	public static void main(String[] args) {
		
		FileReader fileReader = null;
		
		try {
			// attempt to open a file that may not be exist
			fileReader = new FileReader("Non_Existent_File.txt");
			// perform some file reading operations here
		}catch(IOException e) {
			// handle the IOException or checked Exception
			System.out.println("An IOException Occured : " + e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				// close the fileReader in the finally block to ensure it is always closed
				if (fileReader != null) {
					fileReader.close();
				}
			}catch(IOException e) {
				// handle any exception that occure while closing the file.
				System.out.println("Error closing the file :" + e.getMessage());
			}
		}

	}

}
