package Task11;

public class App {

    public static void main(String[] args) {

        Document proxyRecipe = new ProxyRecipe("Doctor", "More sleep", "01.12.15");
        proxyRecipe.getDesription();

        proxyRecipe.setDate("02.25.16");
        System.out.println("======================");
        proxyRecipe.getDesription();
    }
}
