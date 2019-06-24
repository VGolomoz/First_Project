package Task12;

import java.util.ArrayList;

public class Order {

    private int orderNumber;
    private String customer;
    private String address;
    private long phoneNumber;
    ArrayList<Product> orderProducts;

    public Order(int orderNumber, String customer, String address, long phoneNumber, ArrayList<Product> products) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.orderProducts = products;
    }

    public void getDescription(){

        System.out.println("Your order details: ");
        System.out.println("Order number: " + orderNumber);
        System.out.println("Name: " + customer);
        System.out.println("Delivery address: " + address);
        System.out.println("Phone number:" + phoneNumber);
        System.out.println("");
        System.out.println("Product list:" );
        for (Product x:orderProducts) {
            System.out.println(x.getName());
        }
        System.out.println("=======================");
        System.out.println("Thank you for your order. We will call you");
    }
}
