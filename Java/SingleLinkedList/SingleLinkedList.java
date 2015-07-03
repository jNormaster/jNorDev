import java.util.Random;

class SingleLinkedList// class single linked list
{
	private Node head;
	private int elements;

	public SingleLinkedList()
	{
		
		head = null;
		elements = 0;
		
	}//End SingleLinkedList constructor
	
	/* Deletes the first element in the list */
	public void deleteFirstElement() //Belongs to case 1
	{
		
			head = head.next;
			elements -= 1;
			
	}//End deleteFirstElement
	
	/* Deletes the last element in the list */
	public void deleteLastElement() //Belongs to case 2
	{
		
		Node pp = head;
		Node cp = head.next;
		
		if(elements == 1)
			deleteFirstElement();
	
		else
		{		
			
			while(cp.next != null)
			{
				pp = cp;
				cp = cp.next;
			}//End while
		
			pp.next = null;
			elements -= 1;
			
		}//End else
		
	}//End deleteLastElement
	
	/* Delete a chosen element from the list (only the first encounter) */
	public void deleteChosenElement(int e) //Belongs to case 3
	{
		
		Node pp = null;
		Node cp = head;
		
		if(cp.element == e)
			deleteFirstElement();
		
		else
		{
			
			while (cp != null && cp.element != e)
			{
				pp = cp;
				cp = cp.next;
			}//End while
			
			pp.next = cp.next;
			elements -= 1;
			
		}//End else
		
	}//End deleteChosenValue
	
	/* Insert first element in the list */
 	public void insertFirstElement(int value) //Belongs to case 4
	{
 		
		if (elements == 0)
			head = new Node(value, null);
		
		else 
			head = new Node(value, head);
		
		elements += 1;
		
	}//End insertFirstElement
	
 	/* Insert last element in the list */
	public void insertLastElement(int value) //Belongs to case 5
	{
		
		if (elements == 0)
			insertFirstElement(value);
		
		else 
		{		
				Node x = head;
				while(x.next != null)
				{
					x = x.next;
				}//End while
				
				x.next = new Node(value, null);
				elements += 1;
		}//End else
		
	}//End insertLastElement
	
	/* Inserts element behind a chosen element in the list */
	public void behindChosenElement(int e, int out) //Belongs to case 6
	{
		
		Node x = head;
		
		while (x != null && x.element != e)
		{
			x = x.next;
		}//End while
			
		x.next = new Node (out, x.next);
		elements += 1;
		
	}//End behindChosenElement
	
	/* Inserts element infront of a chosen element in the list */
	public void infrontOfChosenElement(int e, int out) //Belongs to case 7
	{
		
		Node cp = head;
		Node pp = null;
		Node temp = new Node (out, head);
		
		if(cp.element == e)
			insertFirstElement(out);
	
		else
		{
			
			while (cp != null && cp.element != e)
			{
				pp = cp;
				cp = cp.next;
			}//End while
		
			
			pp.next = temp;
			temp.next = cp;
			elements += 1;
			
		}
			
	}//End insertInFront
	
	/* Returns how many elements in the list */
	public int getElements() //Belongs to case 8
	{
		
		return elements;
		
	}//End getElements
	
	/* Returns how many elements of a chosen element in the list */
	public int numbOfElementsChosenValue(int e) //Belongs to case 9
	{
		
		Node x = head;
		int numOf = 0;
	
		while (x != null)
		{
			
			if(x.element == e)
			{
				numOf = numOf + 1;
			}
		
			x = x.next;
				
		}//End for
		
		return numOf;
		
	}//End NumbOfElementsChosenValue
	
	@override /* Prints out the list */
	public String toString() //Belongs to printList method
	{
		
		String text = "";
		Node pointer = head;
		
		for (int i=1 ; i <= elements ; i ++)
		{ 
			text = text + pointer.element + " ";
			
			if(i % 5 == 0)
				text = text + "\n";
			
			pointer = pointer.next;
		}//End for
		
		return text;
		
	}//End toString
	
	/* Delete the whole list */
	public void deleteList() //Belongs to case 11
	{		
		
		head = null;
		elements = 0;		
		
	}//End deleteList
	
	/* Make a list with random numbers with chosen elements in the list */
	public void makeList(int length) //Belongs to case 12
	{
		
		int i=1;
		Random randomGenerator = new Random();
		
	    for (i = 1; i <= length; i++)
	    {
	    	int randomInt = randomGenerator.nextInt(length + 15) + 1;
	    	insertLastElement(randomInt);
	    } 
	    
	}//End makeList
	
	/* Testing the list if a chosen element excist in the list */
	public boolean test(int e)
	{
		
		Node pointer = head;
		boolean test = false;
		
		for(int k = 1 ; k <= elements ; k++)
		{
			if(pointer.element == e)
			{
				test = true;
			}
			pointer = pointer.next;
		}
		return test;
	}
	
	/* easterEgg method! Special treat for Helge! */
	\u0070\u0075\u0062\u006c\u0069\u0063 \u0076\u006f\u0069\u0064 \u0065\u0061\u0073\u0074\u0065\u0072\u0045\u0067\u0067\u0028\u0029
	\u007b
				
	        \u004e\u006f\u0064\u0065 \u0063\u0070 \u003d \u0068\u0065\u0061\u0064\u003b
		\u004e\u006f\u0064\u0065 \u0070\u0070 \u003d \u006e\u0075\u006c\u006c\u003b

		\u0077\u0068\u0069\u006c\u0065\u0028\u0063\u0070 \u0021\u003d \u006e\u0075\u006c\u006c \u0026\u0026 \u0070\u0070 \u0021\u003d \u0068\u0065\u0061\u0064\u0029
		\u007b
			\u004e\u006f\u0064\u0065 \u006e\u0065\u0078\u0074 \u003d \u0063\u0070\u003b
			\u0066\u006f\u0072\u0028 \u003b \u006e\u0065\u0078\u0074\u002e\u006e\u0065\u0078\u0074 \u0021\u003d \u0070\u0070 \u003b \u006e\u0065\u0078\u0074 \u003d \u006e\u0065\u0078\u0074\u002e\u006e\u0065\u0078\u0074\u0029
			\u007b
				\u0069\u0066\u0028\u006e\u0065\u0078\u0074\u002e\u0065\u006c\u0065\u006d\u0065\u006e\u0074 \u003e\u003d \u006e\u0065\u0078\u0074\u002e\u006e\u0065\u0078\u0074\u002e\u0065\u006c\u0065\u006d\u0065\u006e\u0074\u0029
				\u007b
					\u0069\u006e\u0074 \u0074\u0065\u006d\u0070 \u003d \u006e\u0065\u0078\u0074\u002e\u0065\u006c\u0065\u006d\u0065\u006e\u0074\u003b
					\u006e\u0065\u0078\u0074\u002e\u0065\u006c\u0065\u006d\u0065\u006e\u0074 \u003d \u006e\u0065\u0078\u0074\u002e\u006e\u0065\u0078\u0074\u002e\u0065\u006c\u0065\u006d\u0065\u006e\u0074\u003b
					\u006e\u0065\u0078\u0074\u002e\u006e\u0065\u0078\u0074\u002e\u0065\u006c\u0065\u006d\u0065\u006e\u0074 \u003d \u0074\u0065\u006d\u0070\u003b
				\u007d
			\u007d
				
			\u0070\u0070 \u003d \u006e\u0065\u0078\u0074\u003b
			\u0063\u0070 \u003d \u0068\u0065\u0061\u0064\u003b
		\u007d	
				
	\u007d

}//End SingleLinkedList