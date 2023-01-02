package programs;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number");
		int fn = input.nextInt();
		System.out.println("enter the second number");
		int sn = input.nextInt();
		int r = 0;
		int p = fn*sn;
		while(sn%fn != 0) {
			 r = sn%fn;		
			fn = sn;
			sn = r;		
		}
		System.out.println("LCM:"+p/r);

	}

}
