package com.practiceproblem;

import java.util.Scanner;
/**
 * 
 * @author Dipali
 *
 */
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month");
		int month = sc.nextInt();
		System.out.println("Enter Date");
		int date = sc.nextInt();
		if (date <= 20) {
			for (int i = 1; i <= date; i++) {
				if (month >= 3 && month <= 6) {
					System.out.println("True");
					break;
				} else {
					System.out.println("false");
					break;
				}
			}
		} else
			System.out.println("false:");

	}

}
