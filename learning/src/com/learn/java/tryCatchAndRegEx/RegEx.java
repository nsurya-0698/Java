package com.learn.java.tryCatchAndRegEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Ram", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Jai Sri ram");
		
		boolean findIf = matcher.find();
		
		if (findIf) {
			System.out.println("Match found");
		}else {
			System.out.println("Match not found");
		}
	}
}