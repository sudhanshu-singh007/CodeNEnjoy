package javaAdvanceProblems;

import java.util.*;

public class SmithNumberExample2 {
//function finds all the prime factors for the given number  
	static List<Integer> findPrimeFactors(int n) {
//creating an array list that stores the prime factors      
		List<Integer> result = new ArrayList<>();
		for (int i = 2; n % i == 0; n = n / i)
			result.add(i);
		for (int i = 3; i * i <= n; i = i + 2) {
			while (n % i == 0) {
				result.add(i);
				n = n / i;
			}
		}
		if (n != 1)
//the add() method adds the prime factors to the list  
			result.add(n);
		return result;
	}

//function finds the sum of digits of the given number  
	static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
//finds the last digit and add it to the sum      
			sum = sum + (n % 10);
//removes the last digit from the number  
			n = n / 10;
		}
//returns the sum of digits  
		return sum;
	}

//driver code      
	public static void main(String args[]) {
//finds all smit numbers up to 10000      
		for (int n = 1; n < 10000; n++) {
//calling the user-defined function that finds prime factors  
			List<Integer> factors = findPrimeFactors(n);
//the size() method returns the number of elements in the list  
//executes until the condition becomes false  
			if (factors.size() > 1) {
				int sum = sumOfDigits(n);
				for (int f : factors)
					sum = sum - sumOfDigits(f);
				if (sum == 0)
					System.out.println(n);
			}
		}
	}
}