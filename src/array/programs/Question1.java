package array.programs;
import java.util.Arrays;
import java.util.Scanner;
public class Question1 {
	public static void main(String[] args) {
		System.out.println(a());		
	}	
		static String a() {
		String ss = "yes";
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		System.out.println("how many arrays you want");
		int num = input.nextInt();
		System.out.println("enter the elements");
		for(int i = 0; i<num; i++) {
			int[] ar = new int[size];
			for(int j = 0; j<size; j++) {
				ar[j] = input.nextInt();
			}
			for(int k = 0; k<size-1; k++) {
				if(ar[k]%2 == 0 && ar[k+1]%2 == 0) {
					ss = "no";
				}
				else if(ar[k]%2 == 1 && ar[k+1]%2 == 1) {
					ss = "no";
				}
			}		
		}
		return ss;
	}
}
