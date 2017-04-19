
public class LinkedList<T> implements List<T> {

	private Node<T> rootNode;
	private int size;
	@Override
	public void insert(T data) {		
		size++;
		if(rootNode == null)
		{
			this.rootNode = new Node<T>(data);
		}
		else
		{
			insertNodeInEnd(data, rootNode);
		}
	}
	
	private void insertNodeInEnd(T data, Node<T> node)
	{
		if(node.next != null)
		{
			insertNodeInEnd(data, node.next);
		}
		else
		{
			node.next = new Node<T>(data);
		}
	}

	@Override
	public void traverse() {

		if(this.rootNode == null) return;
		Node<T> actualNode = rootNode;
		
		while(actualNode!= null)
		{
			System.out.println("node data: " + actualNode.data);
			actualNode = actualNode.next;
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
