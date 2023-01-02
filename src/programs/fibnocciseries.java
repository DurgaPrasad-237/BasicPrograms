package programs;

public class fibnocciseries {

	public static void main(String[] args) {
	int num = 0;
	int num2 = 1;
	int sum = 0;
	while(num<=21) {
		sum = num+num2;
		System.out.print(num+" ");
		num = num2;
		num2 = sum;
	}
	}

}
