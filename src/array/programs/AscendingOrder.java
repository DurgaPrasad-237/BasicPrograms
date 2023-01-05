package array.programs;
import java.util.Arrays;
import java.util.Scanner;
public class AscendingOrder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}		   		
		System.out.println(Arrays.toString(arr));
	}

}
