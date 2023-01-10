package linkedlist.programs;

public class LinkedList {
	Node head;
	int size;
	LinkedList(){
		this.size = 0;
	}
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	public void addFirst(String data) {
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
		return;
	}
	newNode.next = head;
	head = newNode;
	}
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node cn = head;
		while(cn.next != null) {
			cn = cn.next;
		}
		cn.next = newNode;		
	}
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node cn = head;
		while(cn != null) {
			System.out.print(cn.data + " -> ");
			cn = cn.next;
		}
		System.out.print("null");
	}
	public void deleteFirst() {
		if(head == null) {
			System.out.println("list is empty");
		}
		size--;
		head = head.next;
	}
	public void deleteLast() {
		if(head == null) {
			System.out.println("list is empty");
		}
		size--;
		Node sl = head;
		Node ln = head.next;
		while(ln.next != null) {
			ln = ln.next;
			sl = sl.next;
		}
		sl.next = null;
	}
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.addFirst("this");
		obj.addLast("is");
		obj.addLast("me");
		obj.printList();
		obj.deleteFirst();
		System.out.println();
		obj.printList();


	}

}
