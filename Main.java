package com.alfiaali;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quite = false;
        int choice = 0;
        printInstructions();
        while (!quite) {
            System.out.println("ENTER YOUR CHOICE: ");
            choice = scanner.nextInt();
            scanner.nextInt();
            switch (choice) {
                case 0:
                    printInstructions();
                    scanner = new Scanner(System.in);
                    System.out.println();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    scanner = new Scanner(System.in);
                    System.out.println();
                    break;
                case 2:
                    addItem();
                    scanner = new Scanner(System.in);
                    System.out.println();
                    break;
                case 3:
                    modifyItem();
                    scanner = new Scanner(System.in);
                    System.out.println();
                    break;
                case 4:
                    removeItem();
                    scanner = new Scanner(System.in);
                    System.out.println();
                    break;
                case 5:
                    searchForItem();
                    scanner = new Scanner(System.in);
                    System.out.println();
                    break;
                case 6:
                    quite = true;
                    scanner = new Scanner(System.in);
                    System.out.println();
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of grocery items. ");
        System.out.println("\t 2 - To add an item to the list. ");
        System.out.println("\t 3 - To modify an item in the list. ");
        System.out.println("\t 4 - To remove an item from the list. ");
        System.out.println("\t 5 - To search for an item in the list. ");
        System.out.println("\t 6 - To Quite the application. ");
    }

    public static void addItem() {
        System.out.println("Please enter the Grocery item: ");
        scanner = new Scanner(System.in);
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        //scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
        System.out.println();
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
//        scanner.nextLine();
        GroceryList groceryList = new GroceryList();
        groceryList.removeGroceryItem(itemNo);
        System.out.println("your item is successfully remove");
        scanner.nextInt();
        System.out.println();
    }

    public static GroceryList searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        int searchForItem = scanner.nextInt();
        String groceryListItem = groceryList.findItem(searchForItem);
        System.out.println("found" + searchForItem + "In our grocery List");
        int i = scanner.nextInt();

//        public static String searchFotItem();
//        return groceryList;
    }
}
