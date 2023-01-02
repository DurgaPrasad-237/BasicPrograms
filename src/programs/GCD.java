package programs;
import java.util.Scanner;
public class GCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number");
		int fn = input.nextInt();
		System.out.println("enter the second number");
		int sn = input.nextInt();
		int r = 0;
		if(fn<sn) {
			while(sn%fn != 0) {
			 r = sn%fn;		
			fn = sn;
			sn = r;		
		}
		}
		else {
			while(fn%sn != 0) {
				r = fn%sn;		
				sn = fn;
				fn = r;	
			}
	    }
		System.out.println(r);

}
}
