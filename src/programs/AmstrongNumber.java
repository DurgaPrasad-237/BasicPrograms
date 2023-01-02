package programs;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int number = input.nextInt();
		int len = String.valueOf(number).length();
		int sum = 0;
		int temp = number;
		
		while(temp>0) {
			int num = temp%10;
			sum += Math.pow(num, len);
			temp = temp/10;
		}
		if(number == sum)
			System.out.println("AMSTRONG NUMBER");
		else 
			System.out.println("NOT AMSTRONG");

	}

}
