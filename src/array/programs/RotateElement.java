package array.programs;
import java.util.Arrays;
import java.util.Scanner;
public class RotateElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int[] array1 = new int[size];
		int[] array2 = new int[array1.length];
		System.out.println("enter the elements");
		for(int i = 0; i<size; i++) {
			array1[i] = input.nextInt();
		}
		System.out.println("enter the number of times array should be rotate");
		int n = input.nextInt();
		int count = 0;
		for(int i = n,j=0; i<size; i++,j++) {
			array2[j] = array1[i];
			count++;		
		}
		for(int i = 0, j=array2.length-n; i<array1.length-count;i++,j++) {
			array2[j] = array1[i];
		}
		System.out.println("rotated array: "+Arrays.toString(array2));
	}
}
