
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
		System.out.println("Count of list a begining ="+ list.getListCount());
		
		list.addToList(5);
		list.addToList(10);
		list.addToList(15);
		list.addToList(15);
//		list.addToList(25);
		
		System.out.println("Count of list after adding ="+ list.getListCount());
		
		list.viewItems();
		
		System.out.println("Add item to start of linkedlist...");
		
		list.insertAtStart(100);
		
		list.viewItems();
		
		System.out.println("Insert at given index");
		
		list.insertAt(0, 35);
		list.viewItems();
		
		//System.out.println("removing last item");
//		list.removeLastItem();
//		System.out.println("Count of list after removing ="+ list.getListCount());
//		list.viewItems();
	}

}
