import java.util.Scanner;
public class Adam
{
    static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=reverse(n);
        int b=(int)Math.pow(n,2);
        int c=(int)Math.pow(a,2);
        int d=reverse(c);
        if(b==d) System.out.println("True");
        else System.out.println("False");
        
    }
}