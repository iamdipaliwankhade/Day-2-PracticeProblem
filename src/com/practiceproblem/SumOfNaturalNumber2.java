package com.practiceproblem;

/**
 * 
 * @author Dipali
 *
 */
public class SumOfNaturalNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, num = 5, sum = 0;

		// executes until the condition return true

		for (i = 1; i <= num; i++) {

			// adding the value of i into sum variable

			sum = sum + i;
		}
		System.out.println("sum of first Natural numbers is =" + sum);
	}

}
