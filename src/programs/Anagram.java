package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first word");
		String word1 = input.nextLine();
		System.out.println("enter the second word");
		String word2 = input.nextLine();
		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		System.out.println(Arrays.equals(w1, w2));
		

	}

}
