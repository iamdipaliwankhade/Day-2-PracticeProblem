package com.practiceproblem;
/**
 * 
 * @author Dipali
 *
 */
public class ReverseIntegerNumber {

	static int reverseDigits(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}

	public static void main(String[] args) {
		{
			int num = 231;
			System.out.println("Reverse of number is " + reverseDigits(num));
		}
	}

}
