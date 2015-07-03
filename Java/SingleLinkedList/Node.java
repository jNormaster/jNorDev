class Node 
{
	int element;
	Node next;
	
	public Node() //default
	{
		element = 0;
		next = null;
	}
	public Node(int element, Node next)
	{
		this.element = element;
		this.next = next;
	}
}
