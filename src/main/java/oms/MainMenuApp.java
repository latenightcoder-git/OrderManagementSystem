package oms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        int choice;

        do {
            IO.println("\n==== Order Management Menu ====");
            IO.println("1. Add Item");
            IO.println("2. View All Items");
            IO.println("3. Update Item");
            IO.println("4. Delete Item");
            IO.println("5. Search Item by Name");
            IO.println("6. Sort Items by Name by Comparator");
            IO.println("7. Sort Items by Price by Comparator");
            IO.println("8. Sort Items by Name by Loop");
            IO.println("9. Sort Items by Price by Loop ");
            IO.println("0. Exit");
            IO.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch(choice) {
                    case 1:
                        IO.print("Enter Item ID: ");
                        int id = sc.nextInt(); sc.nextLine();
                        IO.print("Enter Item Name: ");
                        String name = sc.nextLine();
                        IO.print("Enter Price: ");
                        double price = sc.nextDouble();
                        order.addItem(new Item(id, name, price));
                        IO.println("Item added successfully.");
                        break;

                    case 2:
                        IO.println("--- All Items ---");
                        order.viewItems();
                        break;

                    case 3:
                        IO.print("Enter Item ID to update: ");
                        int uid = sc.nextInt(); sc.nextLine();
                        IO.print("Enter new Name: ");
                        String newName = sc.nextLine();
                        IO.print("Enter new Price: ");
                        double newPrice = sc.nextDouble();
                        order.updateItem(uid, newName, newPrice);
                        IO.println("Item updated.");
                        break;

                    case 4:
                        IO.print("Enter Item ID to delete: ");
                        int did = sc.nextInt();
                        order.deleteItem(did);
                        IO.println("Item deleted.");
                        break;

                    case 5:
                        IO.print("Enter Item Name to search: ");
                        String sname = sc.nextLine();
                        Item found = order.searchItem(sname);
                        IO.println("Found: " + found);
                        break;

                    case 6:
                        IO.println("--- Items Sorted by Name (Comparator) ---");
                        List<Item> listName = new ArrayList<>(order.getAllItems());
                        listName.sort(new SortByName());
                        for (Item i : listName) IO.println(i.toString());
                        break;

                    case 7:
                        IO.println("--- Items Sorted by Price (Comparator) ---");
                        List<Item> listPrice = new ArrayList<>(order.getAllItems());
                        listPrice.sort(new SortByPrice());
                        for (Item i : listPrice) IO.println(i.toString());
                        break;

                    case 8:
                        IO.println("--- Items Sorted by Name (Loop) ---");
                        Item[] byName = SortUtils.sortByName(order.getAllItemsbyList());
                        for (Item i : byName) IO.println(i.toString());
                        break;

                    case 9:
                        IO.println("--- Items Sorted by Price (Loop) ---");
                        Item[] byPrice = SortUtils.sortByPrice(order.getAllItemsbyList());
                        for (Item i : byPrice) IO.println(i.toString());
                        break;


                    case 0:
                        IO.println("Exiting...");
                        break;

                    default:
                        IO.println("Invalid choice!");
                }
            } catch (Exception e) {
                IO.println("Error: " + e.getMessage());
            }

        } while(choice != 0);

        sc.close();
    }
}
