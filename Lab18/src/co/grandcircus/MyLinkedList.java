package co.grandcircus;

public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;

	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		head = new Node(data, head);
		length++;
	}

	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		head = head.getNext();
		length--;
	}

	@Override
	public void addAtEnd(String data) {
		// TODO You do this one.
		Node newTail = new Node(data, null);

		Node currentNode = head;

		for (int i = 0; i < length; i++) {
			if (currentNode.getNext() == null) {
				currentNode.setNext(newTail);
			}
		}
		length++;
	}

	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// find the node right before the end.
			Node beforeTail = getNodeAt(length - 2);
			// set its next to null. This ends the list here.
			beforeTail.setNext(null);
			length--;
		}
	}

	@Override
	public String get(int index) {
		return getNodeAt(index).getData();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end
		while (node != null) {
			sb.append(node.toString());
			node = node.getNext();
		}
		return sb.toString();
	}

	@Override
	public int size() {
		return length;
	}

	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return
				// null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

	@Override
	public boolean removeAt(int index) {
		if (index < 0 || index > length) {
			return false;
		}
		Node head;
		for (int i = 0; i < index; i++) {

		}

		return true;
	}
	@Override
	public boolean insertAt(int index, String data) {

		if (isFull()) {
			doubleLength();
		}
		Object[] array = null;
		for (int i = length; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = data;
		return false;

	}

	private void doubleLength() {
		// TODO Auto-generated method stub
		
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
}