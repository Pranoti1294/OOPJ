import java.util.Scanner;
public class Exercise{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String c = in.next().toLowerCase();
        //Write your logic here
        int i=c.length();
		System.out.println(i);
        if(i<=1)
        {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
        }
        else
        {
            System.out.println("Error");
        }
        

        sc.close();
    }
}
