public class MyLinkedList{

	private int size;
	private Node start, end;  

 	public MyLinkedList() {
 		size = 0;
 	}
 	
 	public int size() {
 		return size;
 	}

 	public boolean add(String value) {
 		Node n = new Node(value);
 		if(start == null) {
 			start = n;
 			end = n;
 		}
 		else {
 			n.setPrev(end);
 			end.setNext(n);
 			end = n;
 		}
 		size++;
 		return true;
 	}

	public void add(int index, String value) throws IndexOutOfBoundsException {
		if(index < 0 || index > size()) throw new IndexOutOfBoundsException();

		if(index == 0) { //add in start
			Node n = new Node(value);
			n.setNext(start);
			start.setPrev(n);
			start = n;
			size++;
			return;
		}

		if(index > 0 && index < size) { //add in middle
			Node prev = getNode(index - 1);
			Node next = getNode(index);
			Node n = new Node(value);
			n.setPrev(prev);
			n.setNext(next);
			prev.setNext(n);
			next.setPrev(n);
			size++;
			return;
		}

		add(value); //add to end
		return;
	}

 	//public String get(int index); 
 	//if(index < 0 || index >= size) throw new IndexOutOfBoundsException();

 	//public String set(int index, String value);

 	public String toString() {
 		String result = "[";
 		Node current = start;
 		int count = 0;
 		while(current != null) {
 			result += current.getData();
 			if(current.getNext() != null) result += ", ";
 			current = current.getNext();
 			count++;
 		}
 		result += "]";
 		return result;
 	}

 	private Node getNode(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		Node n = start;
		for(int i = 0; i < index; i++) {
			n = n.getNext();
		}
		return n;
	}
 	//Any helper method that returns a Node object MUST BE PRIVATE!
}
