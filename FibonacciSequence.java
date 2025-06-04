package Solutions;

import java.util.*;

public class FibonacciSequence {
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		int n = in.nextInt();//read input number of terms
		//initialize first two numbers
		int first= 0;
		int second = 1;
		/*
		 * example:
		 * input: 5
		 * print: 0 1 1 2 3 
		 * term 1: 0
		 * term 2: 1
		 * term 3: 0+1=1
		 * term 4: 1+1=2
		 * term 5: 2+1=3
		 */
		//Loop to generate and print fibonacci terms
		//for(Initialization;Condition;Update)
		for (int i =1;i<=n;i++) {
			System.out.print(first);
		if(i!=n) {
			System.out.print(" ");
		}
		int next = first+second;
		first = second;
		second = next;
	}

}
}
