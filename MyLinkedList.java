public class MyLinkedList{

	private int size;
	private Node start, end;  

 	public MyLinkedList() {
 		size = 0;
 	}

 	//part 1:

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

 	public String get(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
		return getNode(index).getData();
	}

 	public String set(int index, String value) throws IndexOutOfBoundsException {
 		if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
 		Node n = getNode(index);
 		String result = n.getData();
 		n.setData(value);
 		return result;
 	}

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

	//Any helper method that returns a Node object MUST BE PRIVATE!
 	private Node getNode(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		Node current = start;
		for(int i = 0; i < index; i++) {
			current = current.getNext();
		}
		return current;
	}


	//part 2
 	//A Implement the remove operation.
	//cases: 
	//removing the head/tail , 
	//removing the final element of a list (size 1 list)
	//removing from the middle.
	public String remove(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
		if(size == 1) {
			String result = start.getData();
			start = null;
			end = null;
			size--;
			return result;
		}
		if(index == 0) {
			String result = start.getData();
			start = start.getNext();
			start.getPrev().setNext(null);
			start.setPrev(null);
			size--;
			return result;
		}
		if(index > 0 && index < size - 1) {
			Node prev = getNode(index - 1);
			Node remove = getNode(index);
			Node next = getNode(index + 1);
			String result = remove.getData();
			prev.setNext(next);
			next.setPrev(prev);
			remove.setNext(null);
			remove.setPrev(null);
			size--;
			return result;
		}
		String result = end.getData();
		end = end.getPrev();
		end.getNext().setPrev(null);
		end.setNext(null);
		size--;
		return result;
	}
}
