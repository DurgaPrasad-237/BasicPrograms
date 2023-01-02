package programs;

import java.util.Scanner;

public class NumberOfAmstrongs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the starting number");
		int number1 = input.nextInt();
		System.out.println("enter the last number");
		int number2 = input.nextInt();
		int sum;
		System.out.print("ARMSTRONG NUMBERS: ");
		for(int i = number1; i<=number2; i++) {
			int temp = i;
			int len = String.valueOf(temp).length();
			sum = 0;
			while(temp>0) {
				int num = temp%10;
				sum += Math.pow(num, len);
				temp = temp/10;
			}
			if(i == sum) {
				System.out.print(i+" ");
			}
		
		}
	}

}
