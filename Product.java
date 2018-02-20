
public class Product {

	public static void main(String[] args) {
		String department = "electronics";
		String subdepart = "tablets";
		String product = "ipad";
		
		if(department.equalsIgnoreCase("Electronics")) 
		{
			if(subdepart.equalsIgnoreCase("Tablets"))
		    {
				if(product.equalsIgnoreCase("iPad")) 
				{
					System.out.println("$399.99");
				}
				
				else if(product.equalsIgnoreCase("iPad Pro"))
				{
					System.out.println("$599.99");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else if(subdepart.equalsIgnoreCase("Computers"))
			{
				if(product.equalsIgnoreCase("Laptops"))
				{
					System.out.println("$229.00");
				}
				
				else if(product.equalsIgnoreCase("Desktop"))
				{
					System.out.println("$800.00");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else
			{
				System.out.println("Subdepart is wrong");
			}
		}
		
		else if(department.equalsIgnoreCase("Movies"))
		{
			if(subdepart.equalsIgnoreCase("Movies & TV"))
			{
				if(product.equalsIgnoreCase("DVD"))
				{
					System.out.println("$5.99");
				}
				
				else if(product.equalsIgnoreCase("Blu-Rays"))
				{
					System.out.println("$7.99");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else if(subdepart.equalsIgnoreCase("Books"))
			{
				if(product.equalsIgnoreCase("Biographies"))
				{
					System.out.println("$3.99");
				}
				
				else if(product.equalsIgnoreCase("Humour"))
				{
					System.out.println("$4.99");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else
			{
				System.out.println("Subdepart is wrong!");
			}
		}
		
		else if(department.equalsIgnoreCase("Clothing"))
		{
			if(subdepart.equalsIgnoreCase("Womens"))
			{
				if(product.equalsIgnoreCase("Pink Shoes"))
				{
					System.out.println("$10.99");
				}
				
				else if(product.equalsIgnoreCase("Pink Top"))
				{
					System.out.println("$12.99");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else if(subdepart.equalsIgnoreCase("Mens"))
			{
				if(product.equalsIgnoreCase("Blue Shoes"))
				{
					System.out.println("$10.99");
				}
				
				else if(product.equalsIgnoreCase("Blue Top"))
				{
					System.out.println("$12.99");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else
			{
				System.out.println("subdepart is wrong");
			}
		}
		
		else if(department.equalsIgnoreCase("Toys"))
		{
			if(subdepart.equalsIgnoreCase("Video Games"))
			{
				if(product.equalsIgnoreCase("Xbox 1"))
				{
					System.out.println("$699.99");
				}
				
				else if(product.equalsIgnoreCase("PS4"))
				{
					System.out.println("$599.99");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else if(subdepart.equalsIgnoreCase("Music"))
			{
				if(product.equalsIgnoreCase("Guitar"))
				{
					System.out.println("$900.00");
				}
				
				else if(product.equalsIgnoreCase("Flute"))
				{
					System.out.println("$300.00");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else
			{
				System.out.println("subdepart is wrong");
			}
		}
		
		else if(department.equalsIgnoreCase("Sports"))
		{
			if(subdepart.equalsIgnoreCase("Soccer"))
			{
				if(product.equalsIgnoreCase("Soccer ball"))
				{
					System.out.println("$20.00");
				}
				
				else if(product.equalsIgnoreCase("Shoes"))
				{
					System.out.println("$13.99");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else if(subdepart.equalsIgnoreCase("Baseball"))
			{
				if(product.equalsIgnoreCase("Bat"))
				{
					System.out.println("$12.99");
				}
				
				else if(product.equalsIgnoreCase("Helmet"))
				{
					System.out.println("$15.00");
				}
				
				else 
				{
					System.out.println("product wrong");
				}
			}
			
			else
			{
				System.out.println("subdepart is wrong");
			}
		}
		
		else if(department.equalsIgnoreCase("Food"))
		{
			if(subdepart.equalsIgnoreCase("Vegetables"))
			{
				if(product.equalsIgnoreCase("Carrots"))
				{
					System.out.println("$1.10");
				}
				
				else if(product.equalsIgnoreCase("Potatoes"))
				{
					System.out.println("$1.20");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else if(subdepart.equalsIgnoreCase("Fruits"))
			{
				if(product.equalsIgnoreCase("Apples"))
				{
					System.out.println("$2.20");
				}
				
				else if(product.equalsIgnoreCase("Bananas"))
				{
					System.out.println("$3.50");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else
			{
				System.out.println("subdepart is wrong");
			}
		}
		
		else if(department.equalsIgnoreCase("Auto"))
		{
			if(subdepart.equalsIgnoreCase("Tires"))
			{
				if(product.equalsIgnoreCase("Car tire"))
				{
					System.out.println("$100.00");
				}
				
				else if(product.equalsIgnoreCase("Truck tire"))
				{
					System.out.println("$200.00");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else if(subdepart.equalsIgnoreCase("Batteries"))
			{
				if(product.equalsIgnoreCase("Car batteries"))
				{
					System.out.println("$90.00");
				}
				
				else if(product.equalsIgnoreCase("Charger"))
				{
					System.out.println("$95.00");
				}
				
				else
				{
					System.out.println("product wrong");
				}
			}
			
			else
			{
				System.out.println("subdepart is wrong");
			}
		}
		
		else
		{
			System.out.println("Department is wrong");
			
		}
		
	}

}
