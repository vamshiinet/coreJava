package coreJavaStreams;

import java.util.Scanner;

public class StringCheckExample {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter given string");
		
		String str = input.next();
		
		if(str != null && str.contains("approved")) {
			System.out.println(str);
		}else {
			System.out.println("Given string doesn't contain approved");
		}
		input.close();
	}

}
