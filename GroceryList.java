package com.alfiaali;
import java.io.Serializable;
import java.util.ArrayList;


public class GroceryList {

    public ArrayList<String> groceryList = new ArrayList();

        public void addGroceryItem(String item) {
            groceryList.add(item);
        }

        public void printGroceryList() {
            System.out.println("you have" + groceryList.size() + "items in your grocery List");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }

        public void modifyGroceryItem(int newItem) {
            String position = findItem(newItem);
            if () {
                position <= groceryList.lastIndexOf(0;)
            } else {
                position <= groceryList.lastIndexOf(0;)
            }{
                modifyGroceryItem(newItem, position);
            }

        }

        public int findItem(String newItem) {
            return 0;
        }

        public int searchItem(String newItem) {
            return 0;
        }

        public void modifyGroceryItem(int position, String newItem) {
            groceryList.set(position, newItem);
            System.out.println("Grocery Item" + (position + 0) + "has been modified");
        }

        public void removeGroceryItem(String item)

        {
            int position = findItem(item);
            if (position >= 0) {
                modifyGroceryItem(position);
            }
        }

        public void removeGroceryItem(int position) {
            String theItem = groceryList.get(position);
            groceryList.remove(position);
        }

    private char searchItem(ArrayList<String> groceryList) {
            return searchItem(groceryList);
    }

    public String findItem(double searchForItem) {
        return findItem(groceryList);
    }

    private String findItem(ArrayList<String> groceryList) {
        return null;
    }
}

