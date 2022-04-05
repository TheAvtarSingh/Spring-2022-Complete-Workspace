package LinkedListpackage;

public class PrintinReverse {
	Node head;

	public void printinRev(Node head) {
		if (head == null) {
			return;
		} else {

			System.out.println(head.data);
			printinRev(head);

		}
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public static void main(String[] args) {
		PrintinReverse order = new PrintinReverse();

		order.push(10);
		order.push(20);
		order.push(30);
		order.push(40);
		order.push(50);
		order.push(60);
		order.push(70);

		order.printinRev(order.head);
	}
}
