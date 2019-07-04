package Task12;

import java.util.ArrayList;

public class TradeAutoSystem {

    private ArrayList<ProductCategory> productCategories;
    private ArrayList<Order> orderList;

    private ProductCategory alcohol;
    private ProductCategory grocery;
    private ProductCategory sweets;


    public TradeAutoSystem(){

        productCategories = new ArrayList<>();
        orderList = new ArrayList<>();
        addProducts();
    }

    private void addProducts() {

        sweets = new Sweets();
        grocery = new Grocery();
        alcohol = new Alcohol();

        alcohol.setNext(grocery);
        grocery.setNext(sweets);


        alcohol.addProduct(new Product("Champagne", "750 ml", 300, "02.12.2018", "02.12.2019"));
        alcohol.addProduct(new Product("Chardonnay Wine", "750 ml", 250, "18.02.2018", "15.11.2020"));
        alcohol.addProduct(new Product("Cabernet Wine", "750 ml", 230, "05.01.2019", "10.09.2021"));

        grocery.addProduct(new Product("Ambassador Black Tea", "200 gr", 100, "05.05.2019", "08.09.2021"));
        grocery.addProduct(new Product("Lord Sausep Green Tea", "100 gr", 65, "05.05.2019", "08.09.2021"));
        grocery.addProduct(new Product("Neskafe Coffee", "100 gr", 85, "05.05.2019", "08.09.2021"));

        sweets.addProduct(new Product("7days croissant", "120 gr", 13, "06.05.2019", "08.09.2020"));
        sweets.addProduct(new Product("Bonjour cake", "200 gr", 35, "05.11.2019", "12.09.2020"));
        sweets.addProduct(new Product("Jaco Marshmallow", "300 gr", 30, "11.10.2018", "18.06.2020"));

        productCategories.add(alcohol);
        productCategories.add(grocery);
        productCategories.add(sweets);
    }

    public ProductCategory getAlcoholCategory(){
        return productCategories.get(0);
    }

    public ProductCategory getGroceryCategory(){
        return productCategories.get(1);
    }

    public ProductCategory getSweetsCategory(){
        return productCategories.get(2);
    }

    public void addOrder(Order order){
        orderList.add(order);
    }
}
