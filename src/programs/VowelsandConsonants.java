package programs;
import java.util.Scanner;
public class VowelsandConsonants {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence = input.nextLine();
		char[] vowels = {'a','e','i','o','u'};
		int count = 0;
		int count2 = 0;
		for(int i = 0; i<sentence.length(); i++) {
			if(sentence.charAt(i) != ' ') {
				for(int j = 0; j<vowels.length; j++) {
					if(vowels[j] == sentence.charAt(i)) {
						count++;
					}
				}
			}
			else {
				count2++;
			}
		}
		System.out.println("number of vowels: "+count);
		int con = sentence.length()-count2;
		System.out.println("number of consonants: "+ (con-count));

	}

}
