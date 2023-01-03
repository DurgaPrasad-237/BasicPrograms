package programs;

import java.util.Scanner;

public class palindromestring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the word");
		String word = input.nextLine();
		int length = (word.length()-1);
		int i = length;
		String x = "";
		while(i>=0) {
			x += word.charAt(i)+"";
			i--;		
		}
		if(word.equals(x)) {
		System.out.println("IT IS PALIDROME");
		}
		else {
			System.out.println("NOT PALIDROME");
		}
		
		

	}

}
