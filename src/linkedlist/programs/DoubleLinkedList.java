package linkedlist.programs;
public class DoubleLinkedList {
	Node head;
	Node tail;
	int size;
	DoubleLinkedList(){
		this.size = 0;
	}
	class Node{
		int num;
		Node next;
		Node prev;
		Node(int num){
			this.num = num;
			this.next = null;
			this.prev = null;
		}
	}
	public void push(int data) {
		Node newNode = new Node(data);
		
		newNode.next = head;
		newNode.prev = null;
		if(head != null) {
			head.prev = newNode;		
		}
		head = newNode;		
	}
	public void addlast(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}
		Node cur = head;
		while(cur.next != null) {
			cur = cur.next;
		}
		cur.next = newNode;
		newNode.prev = cur;
	}
	public void print() {
		if(head == null) {
			System.out.println("list is empty");
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.num+"->");
			temp = temp.next;
		}	
		System.out.print("null \n");
	}
	public void deletefirst() {
		head = head.next;		
	}
	public void deletelast() {
		Node ln = head.next;
		Node sl = head;
		if(ln.next != null) {
			ln = ln.next;
			sl = sl.next;
		}
		sl.next = null;	
	}
	public static void main(String[] args) {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.push(1);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.print();
		obj.deletefirst();
		obj.print();
		obj.deletelast();
		obj.print();
		obj.addlast(999);
		obj.print();
	}
}
