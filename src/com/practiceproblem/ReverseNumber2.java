package com.practiceproblem;

import java.util.Scanner;
/**
 * 
 * @author Dipali
 *
 */
public class ReverseNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number and press enter");
         int n = sc.nextInt();
         int rev = 0;
         int rem;
         System.out.println("Original Number:" + n);
         for(int i = n; i > 0;) {
        	 rem = i % 10;
        	 rev = rev * 10 + rem;
        	 i = i / 10;
         }
         System.out.println("Reversed Number is :" + rev);
       
	}
}