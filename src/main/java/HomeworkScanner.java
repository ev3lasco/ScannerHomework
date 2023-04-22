import java.util.Scanner;

public class HomeworkScanner {
 /*  Distance 	  = Fee
        0 -  4 miles  = $2
        5 - 15 miles  = $5
        16 - 25 miles = $10
        26 - 50	miles = $15
        More than 50 miles = $20*/

    public static void main(String[] args) {
        int price1 = 2;
        int price2 = 5;
        int price3 = 10;
        int price4 = 15;
        int price5 = 20;
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the distance you ran?  : ");
        double n = scan.nextInt();
        System.out.println("What's the Product you want? We have: Rice, Beans it's $2 per lb");
        String product = scan.next();
        System.out.println("How many pounds?");
        double Qty = scan.nextInt();
        System.out.println();
        double Price = Qty * 2;
        double Total = Price + n;

            if (n <= 4) {
                 System.out.println("You will be charged $" + price1);
                 Total += price1;
            } else if (n <= 15) {
                System.out.println("You will be charged $" + price2);
                Total += price2;
            } else if (n <= 25) {
                System.out.println("You will be Charged $" + price3);
                Total += price3;
            } else if (n <= 50) {
                System.out.println("You will be Charged $" + price4);
                Total += price4;
            } else {
                System.out.println("You will be Charged $" + price5);
                Total += price5;
            }
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Product", "Qty", "Price", "Miles", "Total");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","-------","-------","-------","-------","-------" );
        System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f\n",product,Qty,Price,n,Total);


    }
    
}

