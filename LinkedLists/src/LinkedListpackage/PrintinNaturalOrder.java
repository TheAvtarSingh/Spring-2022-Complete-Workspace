package LinkedListpackage;

public class PrintinNaturalOrder {
	Node head;

	public void print(Node head) {
		Node temp = head;
		while (temp!=null) {
			System.out.println(temp.next);;
			temp = temp.next;
		}
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = null;
		
		if (head==null) {
			head = node;
		}else {
			Node temp=head;
			while (temp!=null) {
				
				temp = temp.next;
			}
		}
		
	}

	public static void main(String[] args) {
		PrintinNaturalOrder order = new PrintinNaturalOrder();

		order.push(10);
		order.push(20);
		order.push(30);
		order.push(40);
		order.push(50);
		order.push(60);
		order.push(70);

		order.print(order.head);
	}
}
