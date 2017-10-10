
public class Object {
	   double a;
		double b;
		double c;
		double addition()
		{
			 Scanner math1 = new Scanner(System.in);
			 System.out.println("First Num");
			 a = math1.nextInt();
			 System.out.print("Second Num");
	         b = math1.nextInt();
		     c = a + b;
		     System.out.println ("The total value is " + c);
			 return;
			
		}
		double substraction()
		{
			Scanner math1=new Scanner(System.in);
			System.out.println("First Num");
			a = math1.nextInt();
			System.out.print("Second Num");
	        b = math1.nextInt();
		     c = a - b;
		     System.out.println ("The total value is " + c);
			 return;
			
		}
		double multiply()
		{
			Scanner math1=new Scanner(System.in);
			System.out.println("First Num");
			a = math1.nextInt();
			System.out.print("Second Num");
	        b = math1.nextInt();
		     c = a * b;
		     System.out.println ("The total value is " + c);
			 return;
			
		}
		
		double division()
		{
			Scanner math1=new Scanner(System.in);
			System.out.println("First Num");
			a = math1.nextInt();
			System.out.print("Second Num");
	        b = math1.nextInt();
		     c = a / b;
		     System.out.println ("The total value is " + c);
			 return;
			
		}
}
