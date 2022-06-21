package javaAdvanceProblems;

import java.util.Scanner;

public class AutomorphicNumbers {
	private static boolean isAutomorphic(int num) {
		int count = 0;
		int square = num * num;
		int temp = num;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		int lastDigit = (int) (square % (Math.pow(10, count)));
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
		for (int i = start; i <= end; i++) {
			if (isAutomorphic(i))
				System.out.print(i + " ");
		}
	}
}