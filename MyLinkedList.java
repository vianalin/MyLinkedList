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




 	//public boolean add(int index, String value);

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

 	//Any helper method that returns a Node object MUST BE PRIVATE!
}
