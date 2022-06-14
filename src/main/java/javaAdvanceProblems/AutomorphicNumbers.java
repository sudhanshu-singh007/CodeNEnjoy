package javaAdvanceProblems;

import java.util.Scanner;

public class AutomorphicNumbers {
//user-defined static method that checks whether the number is automorphic or not  
	private static boolean isAutomorphic(int num) {
		int count = 0;
//determines the square of the given number  
		int square = num * num;
//copying the variable num into temp  
		int temp = num;
//iterate over the variable num until the condition become false  
		while (temp > 0) {
			count++;
//removes last digit of the variable num  
			temp = temp / 10;
		}
//determines the last digit of the variable square  
		int lastDigit = (int) (square % (Math.pow(10, count)));
//compare the last digit with num  
		return num == lastDigit;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int start, end;
		System.out.print("Enter the starting value: ");
		start = in.nextInt();
		System.out.print("Enter the ending value: ");
		end = in.nextInt();
		System.out.println("Automorphic numbers between " + start + " and " + end + " are: ");
//the for loop starts from the starting value and execute until the condition becomes false  
		for (int i = start; i <= end; i++) {
//calling the user-defined method      
			if (isAutomorphic(i))
//prints the number if it is automorphic  
				System.out.print(i + " ");
		}
	}
}