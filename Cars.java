import java.util.Scanner;
public class Cars 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        if (a > b) 
        {
            System.out.println("-1");
        } 
        else 
        {
            int c = 1;
            while (x + a >= b) {
                c++;
                a = a + a;
                b = b + b;
            }
            System.out.println(c);
        }
    }
}