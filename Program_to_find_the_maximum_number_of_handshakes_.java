import java.util.Scanner;
public class MaxHandShakes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n*(n-1);
        System.out.println(c/2);
    }
}