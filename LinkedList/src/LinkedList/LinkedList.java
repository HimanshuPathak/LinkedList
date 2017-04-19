package LinkedList;

public class LinkedList<T> {
	
	private Node<T> root;
	
	public void insert(T data)
	{
		if(root == null)
		{
			root = new Node<T>(data);
		}
		else
		{
			addNodeAtEnd(data, root);
		}
	}
	
	public void insertAtTheBegining(T data)
	{
		if(root == null)
		{
			root = new Node<T>(data);
		}
		else
		{
			addNodeAtStart(data, root);
		}
	}
	
	
	private void addNodeAtStart(T data, Node<T> node)
	{
		Node<T> newNode = new Node<T>(data);
		newNode.next = root;
		root = newNode;
	}
	
	private void addNodeAtEnd(T data, Node<T> node)
	{
		if(node.next != null)
		{
			addNodeAtEnd(data, node.next);
		}
		else
		{
			node.next = new Node<T>(data);
		}
	}
	
	
	
	public void traverse()
	{
		if(root == null) return;
		Node<T> actual = root;
		
		while(actual != null)
		{
			System.out.println(actual.data);
			actual = actual.next;
		}
	}

}
