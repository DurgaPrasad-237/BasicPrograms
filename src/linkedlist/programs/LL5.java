package linkedlist.programs;
public class LL5 {
	Node head;
	int size;
	LL5(){
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
	public void deleteelement(String data) {
		Node cur = head;
		Node x = cur.next;
		Node y = x.next;
		if(data == head.data) {
			head = head.next;
		}
		else if(x.data == data) {
			head.next = y;
		}
		else{
			while(y.data != data) {
				x = x.next;
				y = y.next;
			}
			x.next = y.next;	
		}	
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
	public static void main(String[] args) {
		LL5 obj = new LL5();
		obj.push("1");
		obj.push("2");
		obj.push("3");
		obj.push("4");
		obj.push("5");
		obj.push("6");
		obj.push("7");
		obj.push("8");
		obj.push("9");
		obj.push("10");
		System.out.println("before delete");
		obj.printList();
		System.out.println();
		System.out.println("After delete");
		obj.deleteelement("10");
		obj.printList();
	}

}
