package array.programs;
import java.util.Arrays;
import java.util.Scanner;
public class RotateElement2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the element");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<size; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("enter the times you want to rotate");
		int n = input.nextInt();
		int first;
		int s;
		for(int i = 0; i<n; i++) {	
			first = array[0];
			for(s = 0; s<array.length-1; s++) {
				array[s] = array[s+1];
			}
			array[s] = first;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
