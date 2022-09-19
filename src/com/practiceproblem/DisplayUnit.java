package com.practiceproblem;

import java.util.Scanner;
/**
 * 
 * @author Dipali
 *
 */
public class DisplayUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number:1, 10, 100, 1000 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("Ones place digit");
		} else if (num == 10) {
			System.out.println("Tens place digit");
		} else if (num == 100) {
			System.out.println("Hundred place digit");
		} else if (num == 1000) {
			System.out.println("Thousand place digit");
		} else {
			System.out.println("Wrong Input....");
		}

	}
}
