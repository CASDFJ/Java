package TargetWebsiteQuiz;

import java.util.Scanner;

public class Next {

	public void Login()
	{
		Next obj1 = new Next();
		
		Scanner in;
		in = new Scanner(System.in);
		
		String user, pass;
		
		String login [] = new String [2];
		
		System.out.println("Target Website");
		
		System.out.println("\nEnter in Username: ");
		user = in.next();
		login[0] = user;
		
		System.out.println("Enter in Password");
		pass = in.next();
		login[1] = pass;
		
		if( (login[0].equals("target123")) && (login[1].equals("TarGet1234")) )
		{
			obj1.Store();
		}
		
		else
		{
			System.out.println("Incorrect Username and or Password");
		}
	}
	
	public void Store()
	{
		Next obj1 = new Next();
		
		Scanner in;
		in = new Scanner(System.in);
		
		String depart, sub, product;
		
		String A [] = new String [3];
		
		char choice = 'Y';
		
		char C [] = new char [1];
		
		int X [] = new int [1];
				
		do
		{
			System.out.println("\nEnter in a Department");
			depart = in.next();
			A[0] = depart;
			
			if(A[0].equals("Clothing"))
			{
				System.out.println("\nEnter in a Sub-department");
				sub = in.next();
				A[1] = sub;
				
				if(A[1].equals("Mens"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("Jacket"))
					{
						X[0] = 40;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]); 
							
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else if(A[1].equals("Womens"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("Dress"))
					{
						X[0] = 30;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else
				{
					System.out.println("\nError");
					System.out.println("Sub-department was misspelled or");
					System.out.println("doesn't exist.");
				}
			}
			
			else if(A[0].equals("VideoGames"))
			{
				System.out.println("\nEnter in a Sub-department");
				sub = in.next();
				A[1] = sub;
				
				if(A[1].equals("XboxOne"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("NFA"))
					{
						X[0] = 60;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else if(A[1].equals("PS4"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("Sniper"))
					{
						X[0] = 65;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else
				{
					System.out.println("\nError");
					System.out.println("Sub-department was misspelled or");
					System.out.println("doesn't exist.");
				}
			}
			
			else if(A[0].equals("Electronics"))
			{
				System.out.println("\nEnter in a Sub-department");
				sub = in.next();
				A[1] = sub;
				
				if(A[1].equals("CellPhones"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("iPhone"))
					{
						X[0] = 80;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else if(A[1].equals("Drones"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("X500"))
					{
						X[0] = 100;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else
				{
					System.out.println("\nError");
					System.out.println("Sub-department was misspelled or");
					System.out.println("doesn't exist.");
				}
			}
			
			else if(A[0].equals("Health"))
			{
				System.out.println("\nEnter in a Sub-department");
				sub = in.next();
				A[1] = sub;
				
				if(A[1].equals("Vitamins"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("JuicePlus"))
					{
						X[0] = 75;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else if(A[1].equals("Syrup"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("CoughSyrup"))
					{
						X[0] = 25;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else
				{
					System.out.println("\nError");
					System.out.println("Sub-department was misspelled or");
					System.out.println("doesn't exist.");
				}
			}
			
			else if(A[0].equals("Home"))
			{
				System.out.println("\nEnter in a Sub-department");
				sub = in.next();
				A[1] = sub;
				
				if(A[1].equals("Bedroom"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("Pillows"))
					{
						X[0] = 10;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else if(A[1].equals("Bathroom"))
				{
					System.out.println("\nEnter in a product");
					product = in.next();
					A[2] = product;
					
					if(A[2].equals("Soap"))
					{
						X[0] = 5;
						System.out.print("$");
						System.out.println(X[0]);
						
						obj1.promocode(X[0]);
					}
					
					else
					{
						System.out.println("\nError");
						System.out.println("Product was misspelled or");
						System.out.println("doesn't exist.");
					}
				}
				
				else
				{
					System.out.println("\nError");
					System.out.println("Sub-department was misspelled or");
					System.out.println("doesn't exist.");
				}
			}
			
			else
			{
				System.out.println("\nError");
				System.out.println("Department was misspelled or");
				System.out.println("doesn't exist.");
			}
			
			System.out.println("\nRe-run program? Y or N");
			choice = in.next().charAt(0);
			C[0] = choice;
			
		} while(C[0] == 'Y');
	}
	
	public void promocode(int x)
	{
		/**Next obj1 = new Next();**/
		
		Scanner in;
		in = new Scanner(System.in);
		
		String Z [] = new String [2];
		
		String PromoCode, response;
		
		float code = 0.0f, calculate = 0.0f, price = 0.0f;
		
		System.out.println("\nDo you have a Promo Code (Yes or No)");
		response = in.next();
		Z[0] = response;
		
		if(Z[0].equalsIgnoreCase("Yes"))
		{
			System.out.println("\nEnter in Promo Code");
			PromoCode = in.next();
			Z[1] = PromoCode;
			
			if(Z[1].equals("T123"))
			{
				code = 0.25f;
				calculate = (x * code);
				price = (x - calculate);
				System.out.println("$" + price);
				
			}
			
			else if(Z[1].equals("T456"))
			{
				code = 0.40f;
				calculate = (x * code);
				price = (x - calculate);
				System.out.println("$" + price);
			}
			
			else
			{
				System.out.print("Error, ");
				System.out.println("Promo code misspelled or is doesn't exist");
			}
			
		}
		
		else
		{
			System.out.println("\nThank you for shopping and");
			System.out.println("have a nice day.");
		}
	}
	
	public void promocode ()
	{
		System.out.println("No promo code found");
	}
}
