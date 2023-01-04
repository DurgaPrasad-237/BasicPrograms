package array.programs;
import java.util.Arrays;
import java.util.Scanner;
public class CopyArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int[] array = new int[size];
		int[] array2 = new int[array.length];
		System.out.println("enter the elements");
		for(int i = 0; i<array.length; i++) {
			array[i] = input.nextInt();
		}
		for(int j =0 ; j<array.length; j++) {
			array2[j] = array[j];
		}
		System.out.println("second array :"+Arrays.toString(array2));
	}
}
