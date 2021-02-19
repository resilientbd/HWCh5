import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input power of 10 :");
        int in = scanner.nextInt();
        if(in>=6 && in<9)
        {
            System.out.println("Million");
        }
        else if(in>=9 && in<12)
        {
            System.out.println("Billion");
        }
        else if(in>=12 && in<15)
        {
            System.out.println("Trillion");
        }
        else if(in>=15 && in<18)
        {
            System.out.println("Quadrillion");
        }
        else if(in>=18 && in<21)
        {
            System.out.println("Quintillion");
        }
        else if(in>=21 && in<30)
        {
            System.out.println("Sextillion");
        }
        else if(in>=30 && in<100)
        {
            System.out.println("Nonillion");
        }
        else if(in>=100)
        {
            System.out.println("Googol");
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
}
