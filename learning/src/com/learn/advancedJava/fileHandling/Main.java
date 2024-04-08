package com.learn.advancedJava.fileHandling;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

	File file = new File("lean.txt");
	
	
    // Writing to the file
    FileWriter writer = new FileWriter(file);
    writer.write("Consistent learning is key for success");
    writer.close();
    
//	FileOutputStream fos = new FileOutputStream(file);
//	DataOutputStream dos = new DataOutputStream(fos);
//	dos.writeUTF("Consistent learning is key for success");
	
    
    // Reading from the file
    FileReader reader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(reader);
    String str = bufferedReader.readLine();
    bufferedReader.close();
    
//	FileInputStream fis = new FileInputStream(file);
//	DataInputStream dis = new DataInputStream(fis);
//	String str = dis.readUTF();
	
	System.out.println(str);
	}
}