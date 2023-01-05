package array.programs;
import java.util.Scanner;
public class DuplicateElements {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<array.length; i++) {
			array[i] = input.nextInt();
		}	
		int count;
		System.out.println("the duplicate elements");
		for(int j = 0; j<array.length; j++) {
			count = 0;
			for(int k = 0; k<array.length; k++) {
				
				if(array[j] == array[k] && array[j] != -1) {
					count++;
				if(count>1) {
					array[k] = -1;		
				}	
				}	
			}
			if(count>1 && array[j] != -1)
			System.out.println(array[j]);		}	
	}
}
