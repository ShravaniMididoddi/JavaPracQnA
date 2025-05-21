package Solutions;

import java.util.Scanner;

public class ReverseStringAndLength {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		 Scanner in = new Scanner(System.in);
	        String s= in.nextLine();
	        StringBuilder s1= new StringBuilder(s);
	        System.out.println(s1.reverse());
	        System.out.print(s1.length());
	    }

}
