
public class LinkedList {
	
	Node head;
	Node tail;
	Node current;
	int count;
	
	
	public LinkedList() {
		this.head = null;
		this.count = 0;
	}
	
	public LinkedList(Node head) {
		this.head = head;
		this.count = 1;
	}
	
	public void insertAtStart(int data) {
		
		if(head == null) {
			head = new Node(data);
			head.setNext(null);
			current = head;
			tail = head;
		}
		else {
			Node node = new Node(data);
			node.setNext(head);
			head = node;
		}
	}
	
	
	public void insertAt(int index, int data) {
		
		int count = 0;
		if(head == null) {
			head = new Node(data);
			head.setNext(null);
			
		}
		else {
			int length = this.getListCount();
			current = head;
			current.getData();
			current.getNext();
			
			if(index > length) {
				System.out.println("Exception: List Index out of bound exception");
			}
			else {
				while(current.getNext() != null) {
					
					if((index - count) == 1) {
						//add new node
						Node node = new Node(data);
						node.setNext(current.getNext());
						current.setNext(node);
						
					}
					current = current.getNext();
					count++;
					
				}
			}
		}
	}
	
	public void addToList(int data) {
		
		if(head == null) {
			head = new Node(data);
			head.setNext(null);
			current = head;
			tail = head;
		}
		else {
			Node node = new Node(data);
			node.setNext(null);
			tail.setNext(node);
			tail = node;
			
//			while(current.getNext() !=null) {
//				current = current.getNext();
//			}
//			Node node = new Node(data);
//			node.setNext(null);
//			current.setNext(node);
			
		}
	}
	
	public void viewItems() {
		Node current = head;
		System.out.print("list  = {");
		while(current.getNext() != null) {
			System.out.print(current.getData()+",");
			current = current.getNext();
		}
		System.out.print(current.getData()+"}");
	}
	
	public void removeLastItem() {
		
		if(this.getListCount() == 1) {
			System.out.println("Deleting head");
			head = null;
		}
		else {
			Node current = head;
			while(current.getNext() != null) {
				if(current.getNext().getNext() == null) {
					current.setNext(null);
				}
				else {
					current = current.getNext();
				}
			}
		}
	}

	public int getListCount() {
		
		if(head != null) {
			count = 1;
			current = head;
			
			while(current.getNext() != null) {
				count++;
				current = current.getNext();
			}
		}
		
		return count;
	}
}
