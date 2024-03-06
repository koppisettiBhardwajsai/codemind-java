import java.util.Scanner;
public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=Math.max(r,rev);
            n/=10;
        }
        System.out.println(rev);
        
    }
}