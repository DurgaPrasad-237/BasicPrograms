package array.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("enter the elements");
		for(int i = 0;  i<array.length; i++) {
			array[i] = input.nextInt();
		}
		for(int j = array.length-1; j>=0; j--) {
		System.out.print(array[j]+" ");
		}
	}
}
