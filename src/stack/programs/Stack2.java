package stack.programs;
import java.util.ArrayList;
// stack using array list
public class Stack2 {
	ArrayList<Integer> al = new ArrayList<Integer>();
	boolean isEmpty() {
		return al.size() == 0;
	}
	void push(int x) {
		al.add(x);
	}
	int pop() {
		
		if(isEmpty()) {
			System.out.println("no elements");
		}
		int top = al.get(al.size()-1);
		al.remove(al.size()-1);
		return top;
	}
	int peek() {
		
		if(isEmpty()) {
			System.out.println("empty");
		}
		int top = al.get(al.size()-1);
		return top;
	}
	void print() {
		if(isEmpty()) {
			System.out.println("no elements");
		}
		else {
		System.out.print("the elements are :");
		for(int i = 0; i<al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		}
	}
	public static void main(String[] args) {
		Stack2 obj = new Stack2();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.print();
		System.out.println();
		System.out.println(obj.peek()+" is peek element");
		System.out.println(obj.pop()+" is removed");
		obj.print();
	}
}
