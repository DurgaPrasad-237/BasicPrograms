package linkedlist.programs;

public class LL4MiddleElement {
	Node head;
	int size;
	LL4MiddleElement(){
		this.size = size;
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
	public void middle() {
		Node cn = head;
		int count = 0;
		while(cn != null) {
			count++;
			cn =cn.next;
		}
		int md = count/2;
		Node temp = head;
		for(int i = 0; i<md; i++) {
			temp = temp.next;
		}
		System.out.println("the middle element is "+"["+temp.data+"]");
	}
	public static void main(String[] args) {
		LL4MiddleElement obj = new LL4MiddleElement();
		obj.push("1");
		obj.push("2");
		obj.push("3");
		obj.push("4");
		obj.push("5");
		obj.push("6");
		obj.push("7");
		obj.middle();
		
		
		

	}

}
