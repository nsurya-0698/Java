package com.learn.java.newSwitchCase;

public class UpdatedSeitch {
	
	public static void main(String[] args) {
		
		String day = "Sunday";
		String result = "";
		
		
		//instead of breck we use ->
		result = switch(day) {
		case "Saturday", "Sunday" -> "6am";
		case "Monday", "Tuseday" -> "5am";
		default -> "7 am";
		};
		
		System.out.println(result);
	}

}
