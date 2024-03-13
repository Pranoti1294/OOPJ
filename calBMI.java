import java.util.Scanner;
public class  calBMI
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float w = sc.nextFloat();
		float h = sc.nextFloat();
		float cal,hh=(h*h);
		
		cal=(float)w/hh;
		System.out.println(cal);
		if(cal>=40.0)
		{
			System.out.println("Obese..........");
		}
		else if(cal>=39.9 && cal<=25.0)
		{
			System.out.println("Over weight....");
		}
		else if(cal>=24.9 && cal<=18.5)
		{
			System.out.println("Normal....");
		}
		else
		{
			System.out.println("Under weight....");
		}

        sc.close();

    }

}
