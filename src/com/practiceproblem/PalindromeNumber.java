package com.practiceproblem;

import java.util.Scanner;

/**
 * 
 * @author Dipali
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number");
		int n = sc.nextInt();
		int r, sum = 0, temp;
		temp = n;
		for (int i = 1; i <= n;) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("It is a palindrome");
		} else
			System.out.println("It is not a palindrome");

	}
}
