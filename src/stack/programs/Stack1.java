package stack.programs;
// stack using array
public class Stack1 {
	int index;
	int size = 1;
	int a[] = new int[size]; // Maximum size of Stack
	Stack1(){
		index = -1;
	}
	boolean isEmpty(){
		return index < 0;
	}
	void push(int x){
		if(index >= (size - 1)) {
			System.out.println("over flow");
		}
		else {
			a[++index] = x;
			System.out.println(x +" is pushed");
		}
	}
	void pop()
	{
		if (index < 0) {
			System.out.println("no elements");
		}
		else {
			int x = a[index--];
			System.out.println(x +" is removed");
		}
	}

	void peek()
	{
		if (index < 0) {
			System.out.println("Stack Underflow");
			
		}
		else {
			int x = a[index];
			System.out.println(x +" peek element");
		}
	}	
	void print(){
	if(index >= 0) {
		System.out.println("elements present in stack are:");
	for(int i = index;i>-1;i--){
	System.out.print( a[i]+" ");
	}
	}
	else {
		System.out.println("no elements");
	}
	
}
	public static void main(String args[])
	{
		Stack1 obj = new Stack1();	
		obj.push(10);
		obj.pop();
		obj.push(22);
		obj.print();
		
		
	}
}

