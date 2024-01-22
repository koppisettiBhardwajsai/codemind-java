import java.util.Scanner;
public class UppercaseOrLowercase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char x1= sc.next().charAt(0);
        if(Character.isUpperCase(x1)) System.out.println("uppercase alphabet");
        else if(Character.isLowerCase(x1)) System.out.println("lowercase alphabet");
        else System.out.println("not an alphabet");
    }
}