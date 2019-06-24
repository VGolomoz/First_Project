package Task12;

import java.util.ArrayList;

public class Grocery implements ProductCategory {

    private String name = "Grocery";
    private ProductCategory next;

    private ArrayList<Product> groceryProducts;

    public Grocery(){
        groceryProducts = new ArrayList<>();
    }

    @Override
    public void setNext(ProductCategory next) {
        this.next = next;
    }

    @Override
    public void addProduct(Product product) {
        groceryProducts.add(product);
    }

    @Override
    public Product returnProduct(String input) {
        Product product = null;
        for (Product x : groceryProducts) {
            if (x.getName().equals(input)) {
                product = x;
                break;
            } else product = this.next.returnProduct(input);
        }
        return product;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Product> getProducts() {

        return groceryProducts;
    }

    @Override
    public Product searchProduct(String input) {

        Product product = null;
        for (Product x: groceryProducts) {
            if (x.getName().equals(input)) {
                product = x;
                break;
            }
            else product = this.next.searchProduct(input);
        }
        return product;
    }
}