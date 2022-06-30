package javaAdvanceProblems;

import java.util.*;

public class StrontioNumberExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a four-digit number:");
		int num = sc.nextInt();
		if ((num > 999) && (num < 10000)) {
			int n = num;
			num = num * 2;
			num = num / 10;
			num = num % 100;
			if ((num / 10) == (num % 10))
				System.out.println(n + " is a strontio number.");
			else
				System.out.println(n + " is not a strontio number");
		} else
			System.out.println("Please enter a four-digit number.");
	}
}