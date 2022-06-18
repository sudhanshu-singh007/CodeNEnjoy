package javaAdvanceProblems;

import java.io.*;

public class NeonNumberExample2 {
	static boolean isNeon(int num) {
		int sq = num * num;
		int sumOfdigits = 0;
		while (sq != 0) {
			sumOfdigits = sumOfdigits + sq % 10;
			sq = sq / 10;
		}
		return (sumOfdigits == num);
	}
//driver Code   
	public static void main(String args[]) {
		System.out.print("Neon Numbers between the given range are: ");
		for (int i = 0; i <= 100000; i++)
			if (isNeon(i))
				System.out.print(i + " ");
	}
}