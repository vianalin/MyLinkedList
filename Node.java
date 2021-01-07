public class Node{

	private String data;
	private Node next, prev;
	
	public Node(String value) {/*create a constructor*/
		data = value;
		next = null;
		prev = null;
	}
	
 	//write get/set methods for all three instance variables.

 	public String getData() {
 		return data;
 	}

 	public Node getNext() {
 		return next;
 	}

 	public Node getPrev() {
 		return prev;
 	}

 	public void setData(String value) {
 		data = value;
 	}

 	public void setNext(Node value) {
 		next = value;
 	}

 	public void setPrev(Node value) {
 		prev = value;
 	}


}