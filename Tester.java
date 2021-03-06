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

		//part 1:
		System.out.println("testing creation of mylinkedlist: ");
		MyLinkedList three = new MyLinkedList();
		System.out.println(three.size() == 0);
		
		System.out.println("testing add boolean: ");
		MyLinkedList four = new MyLinkedList();
		System.out.println(four.add("1"));
		System.out.println(four.add("hii"));
		System.out.println(four.toString().equals("[1, hii]"));
		System.out.println(four.size() == 2);

		System.out.println("testing add void: ");
		four.add(1, "hi");
		four.add(0, "ih");
		four.add(1, "hello");
		System.out.println(four.toString().equals("[ih, hello, 1, hi, hii]"));
		//four.add(-4, "stupid"); //testing out of bounds exception
		//four.add(5, "idiot");

		System.out.println("testing index: ");
		System.out.println(four.get(2).equals("1"));
		//four.get(7); //testing out of bounds exception
		//four.get(-6);

		System.out.println("testing set: ");
		System.out.println(four.toString().equals("[ih, hello, 1, hi, hii]"));
		four.set(1, "bye");
		System.out.println(four.toString().equals("[ih, bye, 1, hi, hii]"));
		//four.set(-9, "sup"); //testing out of bounds exception
		//four.set(8, "hola");

		//part 2:
		System.out.println("testing remove: ");
		four.remove(0);
		System.out.println(four.toString().equals("[bye, 1, hi, hii]"));
		four.remove(3);
		System.out.println(four.toString().equals("[bye, 1, hi]"));
		four.remove(1);
		System.out.println(four.toString().equals("[bye, hi]"));
		//four.remove(-1); //testing out of bounds exception
		//four.remove(7);

		System.out.println("testing extend: ");
		MyLinkedList five = new MyLinkedList();
		five.add("banana");
		five.add("6000");
		five.add("monkey");
		four.extend(five);
		System.out.println(four.toString().equals("[bye, hi, banana, 6000, monkey]"));

		MyLinkedList a = new MyLinkedList();
    	MyLinkedList b = new MyLinkedList();
    	for(int i = 0; i < 10; i++){
    		if(i < 5){
        	a.add(i+"");
      		}else{
        	b.add(i+"");
      		}
    	}
   		System.out.println();
    	System.out.println("A:"+a+a.size());
    	System.out.println("B:"+b+b.size());

    	a.extend(b);
    	System.out.println("A:"+a+a.size());
    	System.out.println("B:"+b+b.size());

	}
}