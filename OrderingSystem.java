package orderingsystem;

import java.util.Scanner;

public class OrderingSystem {

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay, change;
    public static void menu() {
    System.out.println("\t\t\t\t +=====================================+");
    System.out.println("\t\t\t\t             SS Shaverma MENU           ");
    System.out.println("\t\t\t\t      1. Shaverma                       ");
    System.out.println("\t\t\t\t      2. Burger                         ");
    System.out.println("\t\t\t\t      3. Hot dog                        ");
    System.out.println("\t\t\t\t      4. Coke                           ");
    System.out.println("\t\t\t\t +=====================================+");

    }
    public static void order() {
    System.out.println("Press 1 to Shaverma , " +
            "Press 2 to Burger, " +
            "Press 3 to Hot dog, " +
            "Press 4 to Coke ");
    System.out.println("Press you want to buy? :");
    choose = input.nextInt();

    if(choose==1) {
        System.out.println("You choose Shaverma");
        System.out.println("How many Shavermas you want to buy?");
        quantity = input.nextInt();
        total = total + (quantity*150);

        System.out.println("You want to buy again?");
        System.out.println("Press Y for Yes and N for No: ");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order();

        }else {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <= total) {
                System.out.println("Not enough payment");
            }else{
            change = pay - total;
            System.out.println("Your total is " + total + " soms");
            System.out.println("Your change is " + change + " soms");

            }

        }




    }else if(choose==2){
        System.out.println("You choose Burger");
        System.out.println("How many Burgers you want to buy?");
        quantity = input.nextInt();
        total = total + (quantity*150);

        System.out.println("You want to buy again?");
        System.out.println("Press Y for Yes and N for No: ");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order();

        }else {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <= total) {
                System.out.println("Not enough payment");
            }else{
                change = pay - total;
                System.out.println("Your total is " + total + " soms");
                System.out.println("Your change is " + change + " soms");
            }

        }
    }else if(choose==3) {
        System.out.println("You choose Hot dog");
        System.out.println("How many Hot dogs you want to buy?");
        quantity = input.nextInt();
        total = total + (quantity*120);

        System.out.println("You want to buy again?");
        System.out.println("Press Y for Yes and N for No: ");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order();

        }else {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <= total) {
                System.out.println("Not enough payment");
            }else{
                change = pay - total;
                System.out.println("Your total is " + total + " soms");
                System.out.println("Your change is " + change + " soms");
            }

        }
    }else if(choose==4) {
        System.out.println("You choose Coke");
        System.out.println("How many Cokes you want to buy?");
        quantity = input.nextInt();
        total = total + (quantity*120);

        System.out.println("You want to buy again?");
        System.out.println("Press Y for Yes and N for No: ");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order();

        }else {
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <= total) {
                System.out.println("Not enough payment");
            }else{
                change = pay - total;
                System.out.println("Your total is " + total + " soms");
                System.out.println("Your change is " + change + " soms");
            }

        }
    }

    }

    public static void main(String[] args) {
      menu();
      order();
    }

}
