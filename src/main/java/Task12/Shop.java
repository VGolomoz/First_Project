package Task12;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private static ArrayList<Product> cart = new ArrayList<>();
    private static double totalCost = 0;
    private static int orderNumber = 1325;
    private TradeAutoSystem tradeAutoSystem;

    public Shop() {
        tradeAutoSystem = new TradeAutoSystem();
    }

    public void startMenu() {
        System.out.println("Welcome!");
        System.out.println("1. Alcohol");
        System.out.println("2. Grocery");
        System.out.println("3. Sweets");
        System.out.println("4. Search product");

        showCart();

        System.out.println("Select the category: ");
        Scanner in = new Scanner(System.in);
        selectCategory(in.nextLine());
    }

    private void showCart() {
        System.out.println("");
        System.out.println("======Your cart======");
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty now");
        } else {
            for (Product x : cart) {
                System.out.println(x.getName());
            }
        }
        System.out.println("Total cost: " + totalCost);
        System.out.println("=======================");
    }

    private void backMenu() {
        System.out.println("");
        System.out.println("Options:");
        System.out.println("1. Add product to your cart");
        System.out.println("2. To return main page");
        System.out.println("3. Remove product from your cart");
        System.out.println("4. End shopping");

        showCart();

        System.out.println("Select the options: ");
        Scanner in = new Scanner(System.in);
        selectOptions(in.nextLine());
    }

    private void selectOptions(String input) {

        switch (input) {
            case ("1"):
                toCart();
                break;
            case ("2"):
                startMenu();
                break;
            case ("3"):
                fromCart();
                break;
            case ("4"):
                endShopping();
                break;
            default:
                System.out.println("Sorry, but i cant help you with this");
        }
    }

    private void toCart() {
        System.out.print("Enter the product's name: ");
        Scanner in = new Scanner(System.in);
        Product product = tradeAutoSystem.getAlcoholCategory().returnProduct(in.nextLine());
        if (product == null) System.err.println("Product not found");
        else {
            cart.add(product);
            totalCost += product.getPrice();
        }
        backMenu();
    }

    private void fromCart() {
        Product product = null;
        System.out.print("Enter the product's name: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        for (Product x: cart) {
            if (x.getName().equals(input)) {
                product = x;
            }
            else product = null;
        }
        if (product == null) System.err.println("Product not found");
        else {
            totalCost -= product.getPrice();
            cart.remove(product);
        }
        backMenu();
    }

    private void selectCategory(String input) {

        switch (input) {
            case ("1"):
                openCategory(tradeAutoSystem.getAlcoholCategory());
                break;
            case ("2"):
                openCategory(tradeAutoSystem.getGroceryCategory());
                break;
            case ("3"):
                openCategory(tradeAutoSystem.getSweetsCategory());
                break;
            case ("4"):
                searchProduct();
                break;
            default:
                System.out.println("Sorry, but i cant help you with this");
        }
    }

    private void openCategory(ProductCategory category) {

        for (int i = 0; i < category.getProducts().size(); i++) {
            category.getProducts().get(i).getDescription();
            System.out.println("=======================");
        }

        backMenu();
    }

    private void searchProduct() {
        System.out.print("Enter the product's name: ");
        Scanner in = new Scanner(System.in);

        Product product = tradeAutoSystem.getAlcoholCategory().searchProduct(in.nextLine());
        if (product == null) System.err.println("Product not found");
        else product.getDescription();

        backMenu();
    }

    private void endShopping() {

        Scanner in = new Scanner(System.in);
        String name;
        String address;
        long phoneNumber;

        if (totalCost == 0) System.out.println("Thank you for visit. Good luck!");
        else {
            System.out.println("Please enter your name: ");
            name = in.nextLine();
            System.out.println("Please enter your delivery address: ");
            address = in.nextLine();
            System.out.println("Please enter your mobile phone number: ");
            phoneNumber = in.nextLong();
            tradeAutoSystem.addOrder(new Order(orderNumber, name, address, phoneNumber, cart));
            orderNumber++;
            tradeAutoSystem.getLastOrder().getDescription();
        }
    }
}
