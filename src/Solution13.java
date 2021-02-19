import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input sales:");
        double in = scanner.nextDouble();
        System.out.println("Please input hours:");
        double hr = scanner.nextDouble();
        double basic = 7.25;
        double commision=0.0;
        if(in>=1.00 && in<99.99)
        {
            commision = (5*in)/100;
        }
        else  if(in>=100.00 && in<299.99)
        {
            commision = (10*in)/100;
        }
        else  if(in>=300)
        {
            commision = (15*in)/100;
        }

        double total_wages = (hr*basic)+commision;
        System.out.println("Total Wages: "+total_wages);
    }
}
