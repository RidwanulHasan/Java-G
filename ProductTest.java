
public class ProductTest 

{

	public static void main(String[] args) 
	
	{
		Product P1= new Product(" AXBDGKL", " User friendly", 5500.00);
		
		System.out.println(" -----------------------------  ");
		
		Product P2= new Product(" HGFJWHEF", "  NOT User friendly", 4500.00);
		
		Product P3= new Product();
		P3.Code = " UHEFH ";
		P3.Description = "  very GOOD  ";  // defaut constructor er joono emon kore set diye korte holo
		P3.Price = 550.00;
		
		System.out.println(P1);
		System.out.println(" -----------------------------  ");
		System.out.println(P2);
		System.out.println(" -----------------------------  ");
		System.out.println(P3);
		
		
		
		

	}

}
