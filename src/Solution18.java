import java.util.Scanner;

public class Solution18 {
    private static int LARGE_BAG_SIZE = 20;
    private static int MEDIUM_BAG_SIZE = 10;
    private static int SMALL_BAG_SIZE = 5;
    private static float COST_PER_LARGE_BAG = 1.80f;
    private static float COST_PER_MEDIUM_BAG = 1f;
    private static float COST_PER_SMALL_BAG = 0.60f;
    private static float COST_PER_UNIT = 5.50f;

    private static float costTotal;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of bags?\t");
        int bagSize = sc.nextInt();
        Solution18 solution29 = new Solution18();
        costTotal = solution29.calculateBasePrice(bagSize);
        System.out.println("Number of Bags Ordered:\t" + bagSize + "\t-\t$" + String.format("%.2f", costTotal));
        solution29.calculateDiscount(bagSize);


    }

    private float calculateDiscount(int bagSize) {
        int discount = 0;
        if (bagSize >= 25 && bagSize < 50) {
            discount = 5;
        } else if (bagSize >= 50 && bagSize < 100) {
            discount = 10;
        } else if (bagSize >= 100 && bagSize < 150) {
            discount = 15;
        } else if (bagSize >= 150 && bagSize < 200) {
            discount = 20;
        } else if (bagSize >= 200 && bagSize < 250) {
            discount = 25;
        } else if (bagSize >= 250 && bagSize < 300) {
            discount = 30;
        }

        float totalDiscount = (discount * costTotal) / 100;
        System.out.println("\t\t\tDiscount:\t" + discount + " %\t-\t$" + String.format("%.2f", totalDiscount));
        System.out.println("\t\t\tYour total charge is:\t$" + String.format("%.2f", costTotal - totalDiscount));
        return totalDiscount;
    }

    private float calculateBasePrice(int bagSize) {
        return bagSize * COST_PER_UNIT;
    }

}
