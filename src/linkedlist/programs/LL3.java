package linkedlist.programs;
public class LL3 {
	Node head;
	int size;
	LL3(){
		this.size = 0;
	}
	class Node {
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
	public void normalOrder() {
		if(head == null) {
			System.out.println("list is empty");
		}
		Node cn = head;
		while(cn != null) {
			System.out.print(cn.data+" ->");
			cn = cn.next;
		}
		System.out.println("null");
	}
	public void reverseOrder() {
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
		Node cn = head;
		int count = 0;
		while (cn != null) {
			count++;
			cn = cn.next;
		}
		Node temp;
		for(int i = 1; i<=count; i++) {
			temp = head;
			for(int j = i; j<count; j++) {
				temp = temp.next;
			}
			System.out.print(temp.data+" ->");
		}
		System.out.print("null");
	}
	}
	
	public static void main(String[] args) {
		LL3 obj = new LL3();
		obj.push("1");
		obj.push("2");
		obj.push("3");
		obj.push("4");
		obj.push("5");
		obj.push("6");
		System.out.println("this is normal order");
		obj.normalOrder();
		System.out.println("this is reverse order");
		obj.reverseOrder();

	}

}
