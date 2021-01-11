public class Tester {
	public static void main(String[] args) {

		//node.java:

		//testing creation of node
		Node one = new Node("hi");
		Node two = new Node("whats up");

		System.out.println("testing get before setting: ");
		System.out.println(one.getData().equals("hi"));
		System.out.println(two.getData().equals("whats up"));
		System.out.println(one.getNext() == null);
		System.out.println(two.getPrev() == null);

		System.out.println("testing set and get: ");
		Node previous = new Node("good morning");
		Node next = new Node("good night");
		one.setPrev(previous);
		one.setData("good afternoon");
		one.setNext(next);
		System.out.println(one.getPrev() == previous);
		System.out.println(one.getData().equals("good afternoon"));
		System.out.println(one.getNext() == next);


		//mylinkedlist.java:

		System.out.println("testing creation of mylinkedlist: ");
		MyLinkedList three = new MyLinkedList();
		System.out.println(three.size() == 0);
		
		System.out.println("testing add boolean: ");
		MyLinkedList four = new MyLinkedList();
		System.out.println(four.add("1"));
		System.out.println(four.add("hii"));
		System.out.println(four.toString());
	}
}