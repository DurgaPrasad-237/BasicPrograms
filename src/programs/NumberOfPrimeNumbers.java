package programs;
import java.util.ArrayList;
import java.util.Scanner;
public class NumberOfPrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the starting number");
		int number1 = input.nextInt();
		System.out.println("enter the ending number");
		int number2 = input.nextInt();
		int count;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		ArrayList<Integer> notprime = new ArrayList<Integer>();
		for(int i = number1; i<=number2; i++) {
			count = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count <= 2) {
				prime.add(i);
			}
			else {
				notprime.add(i);
			}	
		}
		System.out.println("prime :"+prime);
		System.out.println("not prime :"+notprime);
	}
}
