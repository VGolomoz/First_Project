package Task11;

public class ProxyRecipe implements Document{

    private Document recipe;

    public ProxyRecipe(String doctorName, String appointment, String date){
        recipe = new Recipe(doctorName, appointment, date);
    }


    @Override
    public void setDate(String date) {
        recipe.setDate(date);
    }

    @Override
    public void getDesription() {
        recipe.getDesription();
    }
}
