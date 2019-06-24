package Task12;

import java.util.ArrayList;

public interface ProductCategory {

    void setNext(ProductCategory next);

    void addProduct(Product product);
    Product returnProduct(String input);
    String getName();

    ArrayList<Product> getProducts();
    ArrayList<Product> searchProduct(String input);
}
