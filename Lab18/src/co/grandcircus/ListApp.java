package co.grandcircus;

public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyArrayList();
		list.addAtBeginning("A");
		list.addAtBeginning("B");
		list.addAtBeginning("C");
		list.addAtBeginning("D");
		list.addAtBeginning("E");
		list.addAtBeginning("F");

		list.insertAt(2, "ABS");
		list.insertAt(3, "SBA");
		System.out.println(list);
	}

	private static void test(MyList list) {
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.removeFromBeginning();
		list.removeFromEnd();
		// list.addAtEnd(data);

		System.out.println(list);
		System.out.println(list.size());
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
	}

}
