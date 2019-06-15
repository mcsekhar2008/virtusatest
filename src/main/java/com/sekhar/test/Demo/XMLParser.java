package com.sekhar.test.Demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLParser {
	static String str = "<customer><age>35</age><name>aaa</name></customer>";
	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter your tag to read:");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		if(!input.equals("NA")) {
			System.out.println(parse(input));
		}
		}
		  
				
	}
 /**
  * need to correct regular expression. It is late so I just left.
  * @param s
  * @return
  */
	private static String parse(String s) {
		Pattern p = Pattern.compile(s+">(.*?</"+s, Pattern.DOTALL);//. represents single character  
		Matcher m = p.matcher(str);  
		if( m.matches()) {
		   return m.group(1);	
		}
		else {
			return "tag not found";
		}
	}
}
