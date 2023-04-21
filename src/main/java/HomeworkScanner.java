import java.util.Scanner;

public class HomeworkScanner {
 /*  Distance 	  = Fee
        0 -  4 miles  = $2
        5 - 15 miles  = $5
        16 - 25 miles = $10
        26 - 50	miles = $15
        More than 50 miles = $20*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the distance you ran?  : ");
        int n = scan.nextInt();
        System.out.println("What's the Product you want? We have: Rice, Beans it's $2 per lb");
        String product = scan.next();
        System.out.println("How many pounds?");
        int x = 1;
        int Qty = scan.nextInt();
        System.out.println();
        int Price = Qty * 2;
        int Total = Price;

            if (n <= 4) {
                 System.out.println("You will be charged $2");
            } else if (n <= 15) {
                System.out.println("You will be charged $5");
            } else if (n <= 25) {
                System.out.println("You will be Charged $10");
            } else if (n <= 50) {
                System.out.println("You will be Charged $15");
            } else {
                System.out.println("You will be Charged $20");
            }
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Product", "Qty", "Price", "Miles", "Total");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",product,Qty,Price,n,Total);


    }
    
}

