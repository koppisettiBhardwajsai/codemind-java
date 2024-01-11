import java.util.Scanner;
public class Height
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int l=sc.nextInt();
        if(l<a)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(l);
        }
    }
}