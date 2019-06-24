package Task12;

import java.util.ArrayList;

public class Sweets implements ProductCategory {

    String name = "Sweets";
    private ProductCategory next;

    private ArrayList<Product> sweetsProducts;


    public Sweets(){
        sweetsProducts = new ArrayList<>();
    }

    @Override
    public void setNext(ProductCategory next) {
        this.next = next;
    }

    @Override
    public void addProduct(Product product) {
        sweetsProducts.add(product);
    }

    @Override
    public Product returnProduct(String input) {
        Product product = null;
        for (Product x : sweetsProducts) {
            if (x.getName().equals(input)) {
                product = x;
                break;
            } else product = null;
        }
        return product;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Product> getProducts() {

        return sweetsProducts;
    }

    @Override
    public Product searchProduct(String input) {

        Product product = null;
        for (Product x: sweetsProducts) {
            if (x.getName().equals(input)) {
                product = x;
                break;
            }
            else product = null;
        }
        return product;
    }
}