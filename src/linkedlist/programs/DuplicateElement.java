package linkedlist.programs;

import linkedlist.programs.LL4MiddleElement.Node;

public class DuplicateElement {
	Node head;
	int size;
	DuplicateElement(){
		this.size = 0;
	}
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	public void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
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
	public void duplicate() {
		Node curr = head;
		while(curr != null) {
			Node temp = curr;
			while(temp != null && temp.data ==curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		DuplicateElement obj = new DuplicateElement();
		obj.push(11);
		obj.push(11);
		obj.push(11);
		obj.push(11);
		obj.push(13);
		obj.push(13);
		obj.push(20);
		System.out.println("before revoming duplicates");
		obj.printList();
		System.out.println();
		System.out.println("after removing duplicates");
		obj.duplicate();
		obj.printList();
		
	}

}
