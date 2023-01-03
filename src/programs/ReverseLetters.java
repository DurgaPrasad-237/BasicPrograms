package programs;
import java.util.Scanner;
public class ReverseLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence = input.nextLine();
		String[] sen = sentence.split(" ");
		String temp = "";
		for(int i = 0; i<sen.length; i++) {			
			for(int j = sen[i].length()-1; j>=0; j--) {
				System.out.print(sen[i].charAt(j));
			}
			System.out.print(" ");	
		}
		String c = "hello nani";	
	}
}
