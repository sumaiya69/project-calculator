package calc;
import java.util.Scanner;
import java.text.NumberFormat;

public class Java {

	public static void main(String[] args) {
		
		int choice;
		Scanner input=new Scanner(System.in);

		System.out.println("1. Addition  2. Substraction 3. Multiply  4. Division ");

		choice=input.nextInt();
		
		object cont=new object();
		
		if(choice==1)
		{
		cont.addition();	
		}
		else if(choice==2)
		{
		cont.substraction();	
		}
		else if(choice==3)
		{
		cont.multiply();	
		}
		else if(choice==4)
		{
			cont.division();
		}
		else
		{
		System.out.println("error");	
		}
		
	}
}
