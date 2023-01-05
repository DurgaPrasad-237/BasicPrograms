package array.programs;
import java.util.Arrays;
import java.util.Scanner;
public class EvenPostition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("the even position elements");
		for(int i = 0,k=0; i<arr.length; i++) {
			if(i%2 == 0) {
				System.out.println(arr[i]);
			}
	}
}
}
