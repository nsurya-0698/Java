package com.learn.java.UserInput;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter Name");
		
		String userName = myObj.nextLine(); // reads the String info from this line(nextLine, nextLong....)
		System.out.println("Username is: " + userName);
		
		
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println(myDateTime);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDateTime.format(myFormatObj);
		System.out.println(formattedDate);
	}
}