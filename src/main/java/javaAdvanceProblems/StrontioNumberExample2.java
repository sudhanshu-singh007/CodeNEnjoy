package javaAdvanceProblems;

import java.util.*;

public class StrontioNumberExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a four-digit number:");
		int num = sc.nextInt();
		if ((num > 999) && (num < 10000)) {
			int n = num;
//multiplies the given number by 2  
			num = num * 2;
//removes first digit  
			num = num / 10;
//removes last digit  
			num = num % 100;
//compares the quotient and remainder   
			if ((num / 10) == (num % 10))
				System.out.println(n + " is a strontio number.");
			else
				System.out.println(n + " is not a strontio number");
		} else
			System.out.println("Please enter a four-digit number.");
	}
}