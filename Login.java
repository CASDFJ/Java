package Lyft;

public class Login {

	public static void main(String[] args) {
		
		Login obj1 = new Login();

	}
	
	public void info()
	{
		String username1 = "Coder", password1 = "cast0";
		String username2 = "Highs", password2 = "BaT9w";
		String username3 = "Jamz1", password3 = "wq34y";
		String username4 = "Tier5", password4 = "zB5oP";
		String username5 = "Lih47", password5 = "fF4#7";
		
		String from_location = "P", to_location = "T", /*Day = "AM",*/ promoCode = "Kop",
				response = "n";
		
		float /*startTime = 12.00f, overallTime = 0.00f*/ distance = 0.0f,
			  price = 0.0f, newPrice = 0.0f, calculate = 0.0f;
		
		System.out.println("Screee 1");
		System.out.print("Username: ");
		System.out.println(username5);
		System.out.print("Password: ");
		System.out.println(password5);
		
		if(((!username1.equals("Coder")) || ((!password1.equals("cast0")))) && ((!(username1.length() == 5)) || (!(password1.length() == 5))))
		{

			System.out.println("");
			System.out.println("Invalid Username or Password");
			System.out.println("Lenght must be 5");
		}
		
		else if(((!username2.equals("Highs")) || ((!password2.equals("BaT9w")))) && ((!(username2.length() == 5)) || (!(password2.length() == 5))))
		{
			System.out.println("");
			System.out.println("Invalid Username or Password");
			System.out.println("Lenght must be 5");
		}
		
		else if(((!username3.equals("Jamz1")) || ((!password3.equals("wq34y")))) &&  ((!(username3.length() == 5)) || (!(password3.length() == 5))))
		{
			System.out.println("");
			System.out.println("Invalid Username or Password");
			System.out.println("Lenght must be 5");
		}
		
		else if(((!username4.equals("Tier5")) || ((!password4.equals("zB5oP")))) && ((!(username4.length() == 5)) || (!(password4.length() == 5))))
		{
			System.out.println("");
			System.out.println("Invalid Username or Password");
			System.out.println("Lenght must be 5");
		}
		
		else if(((!username5.equals("Lih47")) || ((!password5.equals("fF4#7")))) && ((!(username5.length() == 5)) || (!(password5.length() == 5))))
		{
			System.out.println("");
			System.out.println("Invalid Username or Password");
			System.out.println("Lenght must be 5");
		}
		
		else
		{
			System.out.println("");
			System.out.println("Screen 2");
			System.out.println("Select from locations: K, L, P, N, T");
			System.out.println(from_location);
			
			System.out.println("Select to locations: K, L, P, N, T");
			System.out.println(to_location);
			
			/*System.out.println("Enter Start Time");
			System.out.println(startTime);
			
			System.out.println("Enter AM or PM");
			System.out.println(Day);*/
			
			if( (from_location.equals("K")) && (to_location.equals("L")) )
			{
				distance = 2;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("K")) && (to_location.equals("P")) )
			{
				distance = 7;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("K")) && (to_location.equals("N")) )
			{
				distance = 14;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("K")) && (to_location.equals("T")) )
			{
				distance = 17;
				price= (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("L")) && (to_location.equals("P")) )
			{
				distance = 5;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("L")) && (to_location.equals("K")) )
			{
				distance = 2;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("L")) && (to_location.equals("T")) )
			{
				distance = 15;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("L")) && (to_location.equals("N")) )
			{
				distance = 12;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("P")) && (to_location.equals("N")) )
			{
				distance = 7;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("P")) && (to_location.equals("K")) )
			{
				distance = 7;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("P")) && (to_location.equals("L")) )
			{
				distance = 5;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("P")) && (to_location.equals("T")) )
			{
				distance = 10;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("N")) && (to_location.equals("T")) )
			{
				distance = 3;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("N")) && (to_location.equals("L")) )
			{
				distance = 12;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("N")) && (to_location.equals("P")) ) 
			{
				distance = 7;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("N")) && (to_location.equals("K")) )
			{
				distance = 14;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("T")) && (to_location.equals("P")) )
			{
				distance = 10;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("T")) && (to_location.equals("L")) )
			{
				distance = 15;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("T")) && (to_location.equals("K")) )
			{
				distance = 12;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else if( (from_location.equals("T")) && (to_location.equals("N")) )
			{
				distance = 3;
				price = (distance * 5);
				
				System.out.println("");
				System.out.println("Do you have promo code?");
				System.out.println(response);
				
				if(response.equalsIgnoreCase("Y"))
				{
					System.out.println("");
					System.out.println("Enter promo code");
					System.out.println(promoCode);
					
					if(promoCode.equalsIgnoreCase("Kop"))
					{
						System.out.println("");
						calculate = (price * 0.35f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else if(promoCode.equalsIgnoreCase("Lop"))
					{
						System.out.println("");
						calculate = (price * 0.40f);
						newPrice = (price - calculate);
						System.out.print("Reduce price is: $");
						System.out.println(newPrice);
						
						System.out.println("");
						System.out.print("The estimated distance for your trip is: ");
						System.out.print(distance);
						System.out.println("km");
					}
					
					else
					{
						System.out.println("");
						System.out.println("Invalid Promo Code");
					}
					
				}
				
				else
				{
					System.out.println("");
					System.out.print("Your price without promo code is $");
					System.out.println(price);
					
					System.out.print("The estimated distance for your trip is: ");
					System.out.print(distance);
					System.out.println("km");
					
				}
			}
			
			else
			{
				System.out.println("");
				System.out.println("From and To location must be K, L, N, T, P (Upper Case)");
			}
			
		}
	}

}
