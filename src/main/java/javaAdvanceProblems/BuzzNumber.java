package javaAdvanceProblems;


import java.io.*;
import java.util.Scanner;

class FindAllBuzzNumbers {
	public static void main(String args[]) {
		int range;
		Scanner sc = new Scanner(System.in);

		// show custom message
		System.out.println("Enter the value of range");

		// store user entered value into variable range
		range = sc.nextInt();

		for (int i = 1; i <= range; i++)
			checkNumber(i);
	}

	// create checkNumber() method to check Buzz number
	static void checkNumber(int number) {
		// check whether the number ends with 7, is divisible by 7 or not
		if (number % 10 == 7 || number % 7 == 0)
			System.out.println(number + " is an Buzz number");
	}

}