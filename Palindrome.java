import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(rev==t) System.out.println("True");
        else System.out.println("False");
    }
}