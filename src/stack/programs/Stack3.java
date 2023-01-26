package stack.programs;
//Stack using linked list
public class Stack3 {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			System.out.println(data+" is pushed");
			return;
		}
		newNode.next = head;
		head = newNode;
		System.out.println(data+" is pushed");	
	}
	void pop() {
		if(head == null) {
			System.out.println("stack is empty");
		}
		System.out.println(head.data+" is removed");
		head = head.next;
	}
	void peek() {
		if(head == null) {
			System.out.println("stack is empty");
		}
		System.out.println(head.data+" is peek");
	}
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node cn = head;
		System.out.print("the elements are:");
		while(cn != null) {
			System.out.print(cn.data + " ");
			cn = cn.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Stack3 obj = new Stack3();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);		
		obj.printList();
		System.out.println();
		obj.pop();
		System.out.println(obj.isEmpty());
		obj.printList();

		obj.peek();
	}

}
