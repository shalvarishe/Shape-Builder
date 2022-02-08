///Shalva Rishe

import java.util.Scanner;
public class ShapeBuilder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Press 1 for a hollow square and 2 for a checkerboard pattern: ");
		String shape=input.next();
		while (!(shape.equals("1")) && !(shape.equals("2"))) //checks that user inputted a 1 or a 2, loops until 1 or 2 is entered
		{
			System.out.println("INVALID INPUT!");
			System.out.print("Press 1 for a hollow square and 2 for a checkerboard pattern: ");
			shape=input.next();
		}
		System.out.print("What size would you like your shape to be? (Enter a single number) ");
		int size=input.nextInt();
		System.out.print("What character would you like your shape to be made out of? ");
		String userChar=input.next();
	
		
		if (shape.equals("1")) //to print out hollow square
		{
			for (int i=0; i<size; i++) 
			{
				System.out.print(userChar); //first prints out one line of the char
			}
			System.out.println();
			for (int j=1; j<size-1; j++) 
			{
				System.out.print(userChar); //prints one char, then enters for loop to print a space for the middle characters
				for (int k=0; k<size-2; k++)
				{
					System.out.print(" ");
				}
				System.out.print(userChar); //prints the last character at the end of the line
				System.out.println();
			}
			for (int l=0; l<size; l++)  //after middle lines have been printed, adds one line of characters
			{
				System.out.print(userChar);
			}
			
		} //end if (shape.equals("1"))
		
		else if (shape.equals("2"))
		{
			if (size%2==0) //for an even number, needs to start the loop at 1, otherwise will print out 2 extra lines
			{
				for (int i=1; i<=size; i+=2) //iterate the loops by 2 because each iteration prints out 2 lines of output
				{
					for (int j=0; j<size; j++) //for loop to print out one line starting with userChar and then space
					{
						System.out.print(userChar);
						System.out.print(" ");
					}
					System.out.println();
					
					for(int k=0; k<size; k++) //for loop to print out the next line starting with a space then userChar
					{
						System.out.print(" ");
						System.out.print(userChar);
					}
					System.out.println();
				}
			} //end of if(size%2==0)
			else //the for loop can only print out an even number of lines because each iteration outputs 2 lines, 
				//so before entering the for loop, it print out one line of the pattern 
				//and then completes the remaining lines inside the for loop
			{
				for (int i=0; i<size; i++)
				{
					System.out.print(userChar);
					System.out.print(" ");
				}
				System.out.println();
				for (int i=1; i<size; i+=2)
				{
					for (int j=0; j<size; j++)
					{
						System.out.print(" ");
						System.out.print(userChar);
					}
					System.out.println();
					for(int k=0; k<size; k++)
					{
						System.out.print(userChar);
						System.out.print(" ");
					}
					System.out.println();
					}
					
				}
			} //end of else		
			
		} //end of else if (shape.equals("2"))

	} //end of main method



