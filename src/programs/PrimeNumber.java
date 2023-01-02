package programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int number = input.nextInt();
		int count = 0;
		for(int i = 1; i<=number; i++) {
			if(i%number == 0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("it is not prime");
		}
		else {
			System.out.println("it is  prime");
		}

	}

}
