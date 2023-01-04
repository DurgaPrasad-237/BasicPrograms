package array.programs;

import java.util.Scanner;

public class LargetElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size  = input.nextInt();
		int[] array = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<array.length; i++) {
			array[i] = input.nextInt();
		}
		int max = array[0];
		for(int i = 0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("maximum element is : "+max);

	}

}
