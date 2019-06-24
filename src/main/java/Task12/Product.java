package Task12;

public class Product {

    private String name;
    private String weight;
    private double price;
    private String manufacturedDate;
    private String expirationDate;

    Product(String name, String weight, int price, String manufacturedDate, String expirationDate){
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.manufacturedDate = manufacturedDate;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getManufacturedDate() {
        return manufacturedDate;
    }

    public void getDescription(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price + " UAH");
        System.out.println("Manufactured Date: " + manufacturedDate);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("=======================");
    }
}
