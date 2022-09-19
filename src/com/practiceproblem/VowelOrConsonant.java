package com.practiceproblem;

import java.util.Scanner;

 /**
  * 
  * @author Dipali
  */
	public class VowelOrConsonant {

		public static void main(String[] args) {
			boolean isVowel = false;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter character to check for Vowel or Consonant");
			char ch = sc.next().charAt(0);
			switch (ch) {
			case 'a':
				System.out.println("It is a Vowel");
				break;
			case 'e':
				System.out.println("It is a Vowel");
				break;
			case 'i':
				System.out.println("It is a Vowel");
				break;
			case 'o':
				System.out.println("It is a Vowel");
				break;
			case 'u':
				System.out.println("It is a Vowel");
				break;
			case 'A':
				System.out.println("It is a Vowel");
				break;
			case 'E':
				System.out.println("It is a Vowel");
				break;
			case 'I':
				System.out.println("It is a Vowel");
				break;
			case 'O':
				System.out.println("It is a Vowel");
				break;
			case 'U':
				System.out.println("It is a Vowel");
				break;
			default:
				System.out.println("It is a Consonant");
			}

		}
	}