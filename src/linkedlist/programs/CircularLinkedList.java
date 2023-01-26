package linkedlist.programs;

public class CircularLinkedList {
	Node head;
	Node tail;
	int size;
	CircularLinkedList(){
		this.size = 0;
	}
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
			size++;
		}
		
	}
	public void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.next  = head;
		tail.next = newNode;
		head = newNode;
	}
	public void print() {
		Node temp = head;
//		do {
//			System.out.print(temp.data+" ->");
//			temp = temp.next;
//		}while(temp != head);	
		System.out.print(temp.data+"->");
		while(temp.next != head) {
			System.out.print(temp.next.data+"->");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		CircularLinkedList obj = new CircularLinkedList();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.print();
	}

}
