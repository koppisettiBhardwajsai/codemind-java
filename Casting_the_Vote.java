import java.util.Scanner;
public class CastingVote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t>=18) System.out.println("YES");
        else System.out.println("NO");
    }
}