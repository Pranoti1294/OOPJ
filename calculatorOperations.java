import java.util.Scanner;
class calculatorOperations
{
	
	public static void main(String str[])
	{
		
		Scanner s = new Scanner(System.in);
		int c,ch;
		System.out.print("Enetr numbers: ");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("1.Addition   2.Substraction   3.Multiplication   4.Division \n");
		do
		{
		
		System.out.print("Enetr choice: ");
		 ch=s.nextInt();
		
		switch(ch)
		{
			case 1:
			c=a+b;
			System.out.println("Addition : "+c);
			break;
			
			case 2:
			c=a-b;
			System.out.println("Substraction : "+c);			
			break;
			
			case 3:
			c=a*b;
			System.out.println("Multiplication = "+c);
			break;
			
			case 4:
			c=a/b;
			System.out.println("Division = "+c);
			break;
						
			default :
			System.out.println("Invalid operation");
			break;
			
		}	
		}while(ch!=5);
		
	}
}