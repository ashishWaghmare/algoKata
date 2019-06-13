package in.apptitude;

//http://www.ardendertat.com/2011/09/29/programming-interview-questions-5-linkedlist-remove-nodes/
class LinkedListDelete {

	public static void main(String[] args) {
		// 1 2 5 5 3
		Node root = new Node(1);
		root.add(2).add(5).add(5).add(3);
		StringBuffer buf = root.print(new StringBuffer());
		System.out.println(buf);
		Node newRoot = delete(root, 5);
		System.out.println(newRoot.print(new StringBuffer()));
	}

	public static Node delete(Node root, int toDelete) {
		Node current = root;
		Node prev = null;
		while (current != null) {
			if (current.value == toDelete) {
				if (prev == null) {
					root = current.next;
				} else {
					prev.next = current.next;
				}
			} else {
				prev = current;
			}
			current = current.next;
		}
		return root;
	}

}

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}

	Node add(int value) {
		Node newNode = new Node(value);
		next = newNode;
		return next;
	}

	StringBuffer print(StringBuffer buffer) {
		buffer.append(value).append("->");
		if (next != null)
			buffer = next.print(buffer);
		return buffer;
	}
}
