import java.util.Scanner;
public class Exercise{
    public static void main(String[] args)
    {
        int i,n,sum=0,c=0;
        n = in.nextInt();
        //Write your logic here
        for(i=1;i<=100;i++)
        {
          if(i%2==1)
          {
              sum+=i;
              c++;
          }
          if(c==n)
          {
              break;
          }
        }
		System.out.println(sum);
    }
}