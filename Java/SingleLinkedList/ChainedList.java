import java.util.Scanner;
public class ChainedList 
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		boolean quit = false;
		System.out.println("Welcome to ChainedList." + "\n");
		
		//Get array size from user
		System.out.print("Set array size: ");
		int n = input.nextInt();
		SingleLinkedList [] chainArray = new SingleLinkedList[n];
		for(int m = 0 ; m < n ; m++)
			chainArray[m] = new SingleLinkedList();
		
		//Get number of elements from user
		System.out.print("How many elements? ");
		int k = input.nextInt();
		double kD = k;
		int [] listNum = new int[k];
		
		//Get elements
		for (int j = 0; j < k; j++)
	    {
			System.out.print("Enter element number " + (j + 1) + ": ");
	    	listNum[j] = input.nextInt();
	    	int index = divHash( listNum[j], n );
	    	chainArray[index].insertFirstElement( listNum[j] );		
	    }
		
		//menu
		while(quit != true)
		{
			System.out.println();
			menu();
			String menu = new String();
			menu = input.next();
			
			switch(menu)
			{
				case "1": //Print the chained list
					
					for(int m = 0 ; m < n ; m++)
					{	
				    	System.out.println("\n  Index");
				    	System.out.println(" -------\n|   "+ m + "   | --> " + chainArray[m].toString() 
				    			+ " | with loadfactor: " + chainArray[m].getElements() + " / " 
				    			+ kD + " = " + (chainArray[m].getElements() / kD) + "\n -------\n");	
					}//end for m
				break; //case1
				
				case "2": //Change the array size
					
					System.out.print("Set new array size: ");
					n = input.nextInt();
					chainArray = new SingleLinkedList[n];
					for(int m = 0 ; m < n ; m++)
						chainArray[m] = new SingleLinkedList();
					
					for (int j = 0; j < k; j++)
				    {
				    	int index = divHash( listNum[j], n );
				    	chainArray[index].insertFirstElement( listNum[j] );		
				    }
					
					for(int m = 0 ; m < n ; m++)
					{	
						System.out.println("\n  Index");
				    	System.out.println(" -------\n|   "+ m + "   | --> " + chainArray[m].toString() 
				    			+ " | with loadfactor: " + chainArray[m].getElements() + " // " 
				    			+ kD + " = " + (chainArray[m].getElements() / kD) + "\n -------");	
					}//end for m
				break; // case 2
				
				case "3": //Terminate program
					System.out.println("Program terminates. Have a nice day!");
					quit = true;
				break; //case 3
				
				default: //default for bad inputs from user
					System.out.println("Bad input");
				break; //end default
			
			}//end switch
		}//end while
	} //end main
	
	//Printing menu
	public static void menu()
	{
		System.out.println("Menu\n" + "Enter 1: Print the chained list\n" + "Enter 2: Enter new arraysize\n" + 
							 "Enter 3: Terminate program");
	} //end menu method
	
	//Calculating index for numbers to the chained linked list
	public static int divHash(int k, int n)
	{	
		return k % n;
	} //end divHash method

} //end ChainedList class