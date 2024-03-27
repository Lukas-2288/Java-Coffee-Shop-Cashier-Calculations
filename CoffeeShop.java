//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.lang.Math;

public class CoffeeShop {
    public static void main(String[] args) {
        order s1 = new order();
        s1.print();
    }
}
 class order{
     double small;
     double  medium;
     double  large;
     double  total;
     int totalOunces;
     int smallOunce;
     int  mediumOunce;
     int  largeOunce;
     int countSmall;
     int  countMedium;
     int  countLarge;
     double grandTotal;

    public order(){
        this.small=0;
        this.medium=0;
        this.large=0;
        this.total=0;
        this.totalOunces=0;
        this.smallOunce=0;
        this.mediumOunce=0;
        this.largeOunce=0;
        this.countSmall=0;
        this.countMedium=0;
        this.countLarge=0;
        this.grandTotal=0;

    }


     public order(double s, double m, double l, double t,int o,int os, int om, int ol,int cs, int cm, int cl,double gt){
         this.small=s;
         this.medium=m;
         this.large=l;
         this.total=t;
         this.totalOunces=o;
         this.smallOunce=os;
         this.mediumOunce=om;
         this.largeOunce=ol;
         this.countSmall=cs;
         this.countMedium=cm;
         this.countLarge=cl;
         this.grandTotal=gt;
     }

    public  void print() {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Enter 1 to order coffee.");
        System.out.println("2: Enter 2 to check the total money made up to this time.");
        System.out.println("3: Enter 3 to check the total amount of coffee sold up to this time.");
        System.out.println("4: Enter 4 to check the number of cups of coffee of each size sold.");
        System.out.println("5: Enter 5 to print the data.");
        System.out.println("9: Enter 9 to exit the program.");

        System.out.print("Enter choice: ");
        String in;
        in=input.nextLine();
        if (in.equals("1")) {
            ordering(in);
        }
        else if(in.equals("2")){
            System.out.print("Total money made: $");
            grandTotal();
            System.out.println();
        }
        else if(in.equals("3")){
            System.out.printf("Total amount of coffee sold: "  + Math.round(ounces())+ "oz");
            System.out.println();
            print();
        }
        else if(in.equals("4")){
            countCups();
        }
        else if(in.equals("5")){
            allInfo();
        }
        else if(in.equals("9")){
            System.exit(0);
        }
        else{
            System.out.println("Please enter valid choice.");
            print();
        }
}
    public  double ordering(String choice2) {
        Scanner input = new Scanner(System.in);
        double total1=0;
        double small1=0;
        double medium1=0;
        double large1=0;
        while (true){
            System.out.println("1: Enter 1 to buy coffee in a small cup size (9oz)");
            System.out.println("2: Enter 2 to buy coffee in a medium cup size (12oz)");
            System.out.println("3: Enter 3 to buy coffee in a large cup size (15oz)");
            System.out.println("9: Enter 9 exit.");
            choice2 = input.nextLine();

            if (choice2.equals("1")) {
                System.out.print("Enter the number of small cups: ");
                int cups = input.nextInt();
                countSmall=countSmall+cups;
                small = small+ (double)cups * 1.75;
                small1 = small1+ (double)cups * 1.75;
                smallOunce= smallOunce+ (cups * 9);
                choice2 = input.nextLine();
              //  System.out.printf("%s%1.2f","Please pay $", small);
                System.out.println();
            }

            else if (choice2.equals("2")) {
                System.out.print("Enter the number of medium cups: ");
                int cups = input.nextInt();
                medium = medium+ (double)cups * 1.90;
                medium1 = medium1+ (double)cups * 1.90;
                countMedium=countMedium+cups;
                mediumOunce=mediumOunce+ (cups * 12);
                choice2 = input.nextLine();
                //System.out.printf("%s%1.2f","Please pay $" ,medium);
                System.out.println();
            }
            else if (choice2.equals("3")) {
                System.out.print("Enter the number of large cups: ");
                int cups = input.nextInt();
                countLarge=countLarge+cups;
                large = large+ (double)cups * 2.00;
                large1 = large1+ (double)cups * 2.00;
                largeOunce=largeOunce+(cups * 15);
                choice2 = input.nextLine();
               // System.out.printf("%s%1.2f", "Please pay $" ,(large));
                System.out.println();
            }
            else if (choice2.equals("9")) {
                total =  small1 + medium1 + large1;
                grandTotal= small + medium + large;
                totalOunces = smallOunce+mediumOunce+largeOunce;
                System.out.printf("%s%1.2f","Please pay $" , total);
                System.out.println();
                print();
                break;
            }
            else{
                System.out.println("Please enter valid choice!");
                print();
            }

        }
         return grandTotal;
    }

     double getTotal(){
        return grandTotal;
    }
     double ounces(){
         return totalOunces;
     }
     double countSmall(){
         return countSmall;
     }
     double countMedium(){
         return countMedium;
     }
     double countLarge(){
         return countLarge;
     }

     public void grandTotal() {
         System.out.printf("%1.2f",(getTotal()));
         System.out.println();
         print();
    }

     public  void ouncesOfCoffee() {
         System.out.println(Math.round(ounces()));
     }

     public  void countCups() {
         System.out.println("Small cup count: "+ Math.round(countSmall()));
         System.out.println("Medium cup count: "+ Math.round(countMedium()));
         System.out.println("Large cup count: "+ Math.round(countLarge()));
         print();
     }
     public  void allInfo() {
         System.out.println("Small cup count: "+ Math.round(countSmall()));
         System.out.println("Medium cup count: "+ Math.round(countMedium()));
         System.out.println("Large cup count: "+ Math.round(countLarge()));
         System.out.printf("Total amount of coffee sold: "  + Math.round(ounces()) + "oz");
         System.out.println();
         System.out.print("Total money made: $");
         grandTotal();
         print();
     }

}