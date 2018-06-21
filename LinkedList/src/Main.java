
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating Liked List");
		Node head = new Node(5);
		Node n1 = new Node(10);
		Node n2 = new Node(1);
		Node n3 = new Node(8);
		Node n4 = new Node(15);
		Node n5 = new Node(19);
		Node n6 = new Node(20);
		Node n7 = new Node(26);
		
		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		
		LinkedList l = new LinkedList();
		int count = l.getListCount();
		System.out.println("LinkedLis Count = "+ count);
		
		int[] a = {1,2,3,4,5};
		int[] b = new int[5];
	}

}
