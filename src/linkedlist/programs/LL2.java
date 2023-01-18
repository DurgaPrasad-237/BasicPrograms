package linkedlist.programs;

public class LL2 {
	Node head;
	int size;
	LL2(){
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
			head  = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public boolean search(String n) {
		Node cn = head;
		while(cn != null) {
			if(cn.data == n) {
				return true;
			}
			else {
				cn = cn.next;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		LL2 obj = new LL2();
		obj.push("1");
		obj.push("2");
		obj.push("3");
		obj.push("4");
		obj.push("5");
		System.out.println(obj.search("6"));

	}

}
