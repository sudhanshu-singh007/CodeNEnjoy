package javaAdvanceProblems;
import java.util.*;

public class ReverseNumber {
	public static void main(String args[]) {
		System.out.print("Enter the number that you want to reverse: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse_number = reverseNumber(n);
		System.out.println("The reverse of the given number is: " + reverse_number);
	}

	public static int reverseNumber(int number) {
		boolean isNoNegative = number < 0 ? true : false;
		if (isNoNegative) {
			number = number * -1; // makes the number positive if the given number is negative
		}
		int reverse = 0;
		int lastDigit = 0;
		while (number >= 1) {
			lastDigit = number % 10; // gives the last digit of the number
			reverse = reverse * 10 + lastDigit;
			number = number / 10; // removes the last digit of the number
		}
		return isNoNegative == true ? reverse * -1 : reverse;
	}
}