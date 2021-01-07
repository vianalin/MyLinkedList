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

	}
}