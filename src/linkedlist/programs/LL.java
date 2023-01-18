package linkedlist.programs;

public class LL {
	
	Node head;
	int size;
	
	LL(){
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
	public void push(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;	
	}
	public void print() {
		if(head == null) {
			System.out.println("list is emptpy");
		}
		Node cn = head;
		while(cn != null) {
			System.out.print(cn.data+"->");
			cn = cn.next;
		}
		System.out.print("null");
		
	}
	public String nthNode(int index) {
		Node cn = head;
		int count = 1;
		while(cn != null) {
			if(count == index) {
				return cn.data;	
			}
			count++;
			cn = cn.next;
		}
		return null;	
	}
	public void nthNodeLast(int n) {
		Node cn = head;
		int count = 0;
		while(cn != null) {
			count++;
			cn = cn.next;
		}
		if(count>=n) {
			Node temp = head;
		     for (int i = 0; i <= count - (n + 1); i++) {
		            temp = temp.next; 
		     }
		        System.out.println(temp.data); 
			
		}
		
	}
	public static void main(String[] args) {
		LL obj = new LL();
		obj.push("n");
		obj.push("a");
		obj.push("l");
		obj.push("i");
		obj.print();
		System.out.println();
		System.out.println(obj.nthNode(4));
		obj.nthNodeLast(1);
		

	}

}
