package javaAdvanceProblems;

import java.util.Scanner;

public class SpyNumberExample2 {
	private static boolean isSpyNumber(int number) {
		int lastDigit = 0;
		int sum = 0;
		int product = 1;
		while (number != 0) {
			lastDigit = number % 10;
			sum = sum + lastDigit;
			product = product * lastDigit;
			number = number / 10;
		}
		if (sum == product)
			return true;
		return false;
	}

	public static void main(String args[]) {
		int lowerRange = 0, upperRange = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower range: ");
		lowerRange = sc.nextInt();
		System.out.print("Enter upper range: ");
		upperRange = sc.nextInt();
		System.out.println("The Spy numbers between " + lowerRange + " to " + upperRange + " are: ");
		for (int i = lowerRange; i <= upperRange; i++) {
			if (isSpyNumber(i))
				System.out.print(i + " ");
		}
	}
}