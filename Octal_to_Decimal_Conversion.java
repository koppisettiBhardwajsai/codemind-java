import java.util.Scanner;
public class OctalToDecimal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int decimal=Integer.parseInt(num,8);
        System.out.println(decimal);
    }
}