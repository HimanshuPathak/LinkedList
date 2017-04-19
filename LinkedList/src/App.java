
public class App {
	public static void main(String[] args)
	{
		List<String> listObject = new LinkedList<String>();
		
		for (int i = 0; i < 5; i++) {
			listObject.insert(String.valueOf(i));			
		}
		
		listObject.traverse();
		
	}

}
