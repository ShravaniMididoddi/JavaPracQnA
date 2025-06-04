package Solutions;

import java.util.Scanner;

public class LongestWord {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input: ");
		String s=in.nextLine();
		String s1[]=s.split(" ");
		int max= 0;
		for(int i=1;i<s1.length;i++) {
			if(s1[i].length()>s1[max].length())
			{
				max=i;
			}
		}
			System.out.print("Longest word:"+s1[max]);
			in.close();
		}

}
