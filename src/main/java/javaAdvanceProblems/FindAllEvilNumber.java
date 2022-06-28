package javaAdvanceProblems;

import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
public class FindAllEvilNumber {  
    public static void main(String args[])  
    {  
        int range;  
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the value of range");  
        range = sc.nextInt();  
        for(int i = 1; i <= range; i++)  
            if(checkNumber(i)){  
                System.out.println(i + " is an Evil number");  
            }  
    }  
    public static boolean checkNumber(int n) {  
        long binaryNumber = convertToBinary(n);  
  
        int count = 0;  
        while(binaryNumber != 0) {  
            if(binaryNumber % 10 == 1)   
                count++;  
            binaryNumber = binaryNumber / 10;  
        }  
        if(count % 2 == 0)  
            return true;    //return true when the value of count is even  
        return false;  
    }  
    private static long convertToBinary(int number) {  
        long binaryNumber = 0;  
        int rem = 0;  
        int j = 1;  
        while(number != 0) {  
            rem = number % 2;  
            binaryNumber += rem * j;  
            number = number / 2;  
            j = j * 10;  
        }  
          
        return binaryNumber;    //return the binary equivalent number of the decimal number  
    }  
}  