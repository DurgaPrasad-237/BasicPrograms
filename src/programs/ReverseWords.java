package programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the sentence");
		String sentence = input.nextLine();
		String[] sen = sentence.split(" ");
		for(int i = sen.length-1; i>=0; i--) {
			System.out.print(sen[i]+" ");
		}
		
		

	}

}
