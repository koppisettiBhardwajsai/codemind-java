import java.util.Scanner;
public class AsciiValue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int x=(int)a;
        System.out.println(x);
    }
}