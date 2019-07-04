package Task12;

import java.util.ArrayList;

public class Alcohol implements ProductCategory {

    private String name = "Alcohol";
    private ProductCategory next;

    private ArrayList<Product> alcoholProducts;

    public Alcohol(){
        alcoholProducts = new ArrayList<>();
    }

    @Override
    public void setNext(ProductCategory next) {
        this.next = next;
    }

    @Override
    public void addProduct(Product product) {
        alcoholProducts.add(product);
    }

    @Override
    public Product returnProduct(String input) {
        Product product = null;
        for (Product x : alcoholProducts) {
            if (x.getName().equals(input)) {
                product = x;
                break;
            } else product = this.next.returnProduct(input);
        }
        return product;
    }

    @Override
    public ArrayList<Product> getProducts() {

        return alcoholProducts;
    }

    @Override
    public ArrayList<Product> searchProduct(String input) {

        ArrayList<Product> products = new ArrayList<>();

        for (Product x: alcoholProducts) {
            if (x.getName().contains(input)) {
                products.add(x);
            }
        }
        products.addAll(this.next.searchProduct(input));

        return products;
    }

    public String getName() {
        return name;
    }
}
