package array.programs;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateelement {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size = input.nextInt();
	int[] arr = new int[size];
	System.out.println("enter the elements");
	for(int i = 0; i<size; i++) {
		arr[i] = input.nextInt();
	}
	System.out.println("enter the times you want to rotate");
	int n = input.nextInt();
	int end;
	int r;
	for(int i = 0; i<n ; i++) {
		end = arr[arr.length-1];
		
		for(r = arr.length-1; r>0; r--) {
			arr[r] = arr[r-1];
		}
		arr[r] = end;
	}
	System.out.println(Arrays.toString(arr));
	
		
	
	}

}
