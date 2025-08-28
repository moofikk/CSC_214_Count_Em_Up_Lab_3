package org.example;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
                GroceryCounter counter = new GroceryCounter();
                Scanner scanner = new Scanner(System.in);
                int choice;
                System.out.println();
                System.out.println(
                                "Welcome to the Grocery Counter! Please follow the prompts below to add to your counter!");
                System.out.println(
                                "NOTE: If your total is above 99.99$, it will cause the counter to reset to the remainder amount.");
                System.out.println(
                                "For Example: If your total is $55.01, and you add $45.00 (4 tenths, and 5 ones), your total will reset to $0.01.");
                System.out.println();

                do {
                        System.out.println("1: Add $10.00");
                        System.out.println("2: Add $1.00");
                        System.out.println("3: Add $0.10");
                        System.out.println("4: Add $0.01");
                        System.out.println("5: Show Total (In $)");
                        System.out.println("6: Show Total (In a Raw Integer)");
                        System.out.println("7: Overflow (How many times you've exceeded $99.99) Counter");
                        System.out.println("8: All Stats");
                        System.out.println("9: Clear Counter and Overflows");
                        System.out.println("0: Quit");
                        choice = scanner.nextInt();

                        switch (choice) {
                                case 1:
                                        counter.tens();
                                        System.out.println();
                                        System.out.println("+$10.00");
                                        System.out.println();
                                        break;
                                case 2:
                                        counter.ones();
                                        System.out.println();
                                        System.out.println("+$1.00");
                                        System.out.println();
                                        break;
                                case 3:
                                        counter.tenths();
                                        System.out.println();
                                        System.out.println("+$0.10");
                                        System.out.println();
                                        break;
                                case 4:
                                        counter.hundreths();
                                        System.out.println();
                                        System.out.println("+$0.01");
                                        System.out.println();
                                        break;
                                case 5:
                                        System.out.println();
                                        System.out.println("Total (In $): " + counter.total());
                                        System.out.println();
                                        break;
                                case 6:
                                        System.out.println();
                                        System.out.println("Raw Total: " + counter.rawCounter());
                                        System.out.println();
                                        break;
                                case 7:
                                        System.out.println();
                                        System.out.println("Total Overflows: " + counter.overflows());
                                        System.out.println();
                                        break;
                                case 8:
                                        System.out.println();
                                        System.out.println("Total (In $): " + counter.total());
                                        System.out.println("Total Overflows: " + counter.overflows());
                                        System.out.println("Raw Total: " + counter.rawCounter());
                                        System.out.println();
                                        break;
                                case 9:
                                        counter.clear();
                                        System.out.println();
                                        System.out.println("Counter cleared! Total is now" + counter.total());
                                        System.out.println();
                                        break;
                        }
                } while (choice != 0);
        }
}