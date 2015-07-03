import java.util.Scanner;

public class Main 
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int value = 0, value1 = 0, value2 = 0;
		SingleLinkedList myList = new SingleLinkedList();
		boolean quit = false;
		
		System.out.print(information() + "\n");
		
		while( quit != true )
		{	
			menu();
			String menu = input.next();
			
			switch ( menu )
			{
				case "1": //Delete first element in the list
													
					System.out.println("Delete the first element in the list" + "\n");
					
					if(myList.getElements() == 0)
						System.out.println("The list is empty");
							
					else
					{	
						myList.deleteFirstElement();
						
						if(myList.getElements() == 0)
							System.out.println("The list is now empty");
						
						else
							System.out.println("\n" + "The new list is: " + "\n" + myList.toString());
					}
					
				break; //End case 1
							
				
				case "2": //Delete last element in the list
					
					System.out.println("Delete the last element in the list" + "\n");
					
					if(myList.getElements() == 0)
						System.out.println("The list is empty");
							
					else
					{
						myList.deleteLastElement();
						
						if(myList.getElements() == 0)
							System.out.println("The list is now empty");
						
						else
							System.out.println("\n" + "The new list is: " + "\n" + myList.toString());
					}
					
				break; //End case 2
							
				
				case "3": //Delete first chosen element from list
					
					System.out.println("Delete first chosen element from list" + "\n");
					
					if(myList.getElements() == 0)
						System.out.println("The list is empty");
							
					else
					{
						System.out.println(myList.toString());
						System.out.println("Enter element to delete (only first encounter): ");
						value = input.nextInt();
						
						if(myList.test(value) == true)
						{
							myList.deleteChosenElement(value);
							
							if(myList.getElements() == 0)
								System.out.println("The list is empty");
							
							else
								System.out.println("The new list is: " + "\n" + myList.toString());
						}
						
						else
							System.out.println("\n" + "* Number does not excist *" + "\n");
						
					}
					
					break;
							
					
				case "4": //Add element to the first place in the list
					
					System.out.println("Add element to the first place in the list" + "\n");
					
					System.out.println("Enter value: ");
					value = input.nextInt();
					
					myList.insertFirstElement(value);
					
					System.out.println("\n" + "The new list is: " + "\n" + myList.toString());
					
				break; //End case 4
						
				
				case "5": //Add element to the end of the list
					
					System.out.println("Add element to the end of the list" + "\n");
					
					System.out.println("Enter value: ");
					value = input.nextInt();
			
					myList.insertLastElement(value);
				
					System.out.println("\n" + "The new list is: " + "\n" + myList.toString());
				
				break; //End case 5
						
				
				case "6": //Insert element behind a chosen element in the list
				
					System.out.println("Add element behind chosen element" + "\n");
					
					if(myList.getElements() == 0)
						System.out.println("Not possible, the list is empty");
					
					else
					{	
						System.out.println("The list: " + myList.toString());
						System.out.println("Choose number from the list");
						value1 = input.nextInt();
						
						if(myList.test(value1) == true)
						{
							System.out.println("Number behind " + value1 + ":");
							value2 = input.nextInt();
							myList.behindChosenElement(value1, value2);
						}
						
						else
							System.out.println("\n" + "* Number does not excist *" + "\n");
						
						System.out.println("\n" + "The new list is: " + "\n" + myList.toString());
					}
					
					
				break;
				
				
				case "7": //Insert element in front of a chosen element in the list
 
					System.out.println("Add element infront of chosen element" + "\n");
					
					if (myList.getElements() == 0)
						System.out.println("* List is empty *");
					else
					{
						System.out.println(myList.toString());
						System.out.println("Choose number from the list");
						value1=input.nextInt();
						
						if (myList.test(value1) == true)
						{
							System.out.println("Which number to put infront of " + value1 + ":");
							value2=input.nextInt();
							myList.infrontOfChosenElement(value1, value2);
						}
						
						else
							System.out.println("\n" + "* Number does not excist *" + "\n");
					}
					
					System.out.println("\n" + "The new list is: " + "\n" + myList.toString());
					
				break;							
				
				
				case "8": //Prints the length of the list
					
					System.out.println("Print the length of the list" + "\n");
					System.out.println("Number of elements in the list is: " + myList.getElements());
				
				break; //End case 8
					
				
				case "9":
					
					System.out.println("How many elements of the chosen element" + "\n");
					
					if(myList.getElements() == 0)
						System.out.println("List is empty");
					
					else
					{
						System.out.println("List:\n" + myList.toString());
						System.out.println("Choose element from the list");
						value1 = input.nextInt();
						
						if(myList.test(value1) == true)
							System.out.println("Elements of " + value1 + " in the list is: " + myList.numbOfElementsChosenValue(value1) + "\n");
						
						else
							System.out.println("* Element is not in list *");
					}
					
				break;
			
				
				case "10": //Print the list
				
					System.out.println("Print the list" + "\n");
					
					if(myList.getElements() == 0)
						System.out.println("The list is empty");
					 
					else
						System.out.println("\n" + "The list is: " + "\n" + myList.toString());
									
				break; //End case 10
						
				
				case "11": //Delete the list
				
					System.out.println("Delete the list" + "\n");
					
					boolean endDel = false;
					int numOf = 0;
					
					if(myList.getElements() == 0)
						System.out.println("The list is empty, nothing to delete");
					
					else
					{
					
						System.out.println("WARNING! THE LIST WIL BE DELETED!" + "\n" + "Press 1 or delete for deleting the list, press anything else for cancel");
						String del = input.next();
					
						while (endDel != true)
						{
							
							switch(del)
							{
							
								case "1": case "delete":							
									numOf = myList.getElements();
									myList.deleteList();
									System.out.println("The list is now empty, you removed " + numOf + " elements");
									endDel = true;
									
								break; //End case 1
									
								default:
									
									System.out.println("The list is safe.");
									endDel = true;
									
								break; //End default
								
							} //End switch
							
						} //End while
						
					} //End else
				
				break; //End case 11
						
				
				case "12": //Here you make list with random numbers and chosen amount of elements
				
					System.out.println("Make a list (fast)" + "\n");
					
					System.out.println("Enter amount of elements you like to have in your list");
					int numb = input.nextInt();
					
					if(myList.getElements() == 0)	
					{
						myList.makeList(numb);
						System.out.println("\n" + "The list is: " + "\n" + myList.toString());
					}
				
					else 
					{	
						myList.makeList(numb);
						System.out.println("\n" + "You have added " + numb + " new elements." + "\n" + "The new list is: " + "\n" + myList.toString());
					}
						
				break; //End case 12
					
				
				case "13": //End the program
					
					System.out.println("The program terminates.." + "\nHave a nice day!");
					quit = true;
				
				break; //End case 13
				
				
				case "EasterEgg": case "easteregg": case "14": //EASTER EGG!! Try writing it in the menu ** TO HELGE **
					
					System.out.println("\u0057\u0065\u006c\u0063\u006f\u006d\u0065 "
							+ "\u0074\u006f "
							+ "\u0074\u0068\u0065 "
							+ "\u0045\u0061\u0073\u0074\u0065\u0072 "
							+ "\u0045\u0067\u0067");
					
					if(myList.getElements() == 0)
						System.out.println("\u004e\u006f "
								+ "\u0045\u0061\u0073\u0074\u0065\u0072 "
								+ "\u0045\u0067\u0067 \u0077\u0068\u0065\u006e "
								+ "\u0074\u0068\u0065 \u006c\u0069\u0073\u0074 "
								+ "\u0069\u0073 \u0065\u006d\u0070\u0074\u0079\u0021\u0021");
					
					else
					{
						System.out.println("\u0043\u006f\u006e\u0067\u0072\u0061\u0074"
							+ "\u0075\u006c\u0061\u0074"
							+ "\u0069\u006f\u006e\u0021 \u0059\u006f\u0075 "
							+ "\u0066\u006f\u0075\u006e\u0064 \u0074\u0068\u0065 "
							+ "\u0065\u0061\u0073\u0074\u0065\u0072 \u0065\u0067\u0067\u0021 "
							+ "\u004e\u006f\u0077 \u006c\u0065\u0074\u0073 "
							+ "\u0073\u006f\u0072\u0074 \u0074\u0068\u0061\u0074 "
							+ "\u0053\u0069\u006e\u0067\u006c\u0065\u004c\u0069\u006e\u006b\u0065\u0064\u004c\u0069\u0073\u0074");
						\u006d\u0079\u004c\u0069\u0073\u0074\u002e\u0065\u0061\u0073\u0074\u0065\u0072\u0045\u0067\u0067\u0028\u0029\u003b
						System.out.println(myList.toString());
					}
				break;
				
				default: //default case if input is invalid menu number
					
					System.out.println("Invalid input for menu");
				
				break; //End default
				
			} //End switch
		} //End while	
		
		
} //End main

	public static void menu()
	{
		System.out.print("------------------------------------------------------"
				+ "\n|" + " \t\tMenu\n"
				+ "|\n| Press 1: " + "Delete the first element in the list" 
				+ "\n| Press 2: " + "Delete the last element in the list" 
				+ "\n| Press 3: " + "Delete first chosen element from list" 
				+ "\n| Press 4: " + "Add element to the first place in the list" 
				+ "\n| Press 5: " + "Add element to the end of the list" 
				+ "\n| Press 6: " + "Add element behind chosen element" 
				+ "\n| Press 7: " + "Add element infront of chosen element" 
				+ "\n| Press 8: " + "Print the length of the list" 
				+ "\n| Press 9: " + "How many elements of the chosen element" 
				+ "\n| Press 10: " + "Print the list"
				+ "\n| Press 11: " + "Delete the list"
				+ "\n| Press 12: " + "Make a list (fast)"
				+ "\n| Press 13: " + "End program"
				+ "\n" + "------------------------------------------------------" + "\n");
	} //End menu

	public static String information()
	{
		return "\nThis program lets you make a linked list with integers, "
			+ "\nand the possibility to make changes to the list.\n";
	} //End information
} //End main class