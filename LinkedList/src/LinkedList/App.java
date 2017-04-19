package LinkedList;

public class App {
	
	public static void main(String [] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
//		list.insert(10);
//		list.insert(100);
//		list.insert(1000);
//		list.insert(10000);
//		
//		list.traverse();
		
		list.insertAtTheBegining(10);
		list.insertAtTheBegining(100);
		list.insertAtTheBegining(1000);
		list.insertAtTheBegining(10000);
		
		list.traverse();

	}

}
