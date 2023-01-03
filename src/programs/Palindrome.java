package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int number = input.nextInt();
		int temp = number;
		int sum = 0,rem;
		while(number>0) {
			rem = number%10;
			number = number/10;
			sum = (sum*10)+rem;
		}
		if(temp == sum) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
		

	}

}
