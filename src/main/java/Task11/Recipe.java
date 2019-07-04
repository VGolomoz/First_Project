package Task11;

public class Recipe implements Document {

    private final String doctorName;
    private final String appointment;
    private String expirationDate;

    public Recipe(String doctorName, String appointment, String expirationDate){
        this.doctorName = doctorName;
        this.appointment = appointment;
        this.expirationDate = expirationDate;
    }

    @Override
    public void setDate(String date) {
        this.expirationDate = date;
    }

    @Override
    public void getDesription() {
        System.out.println("Recipe name: " + doctorName);
        System.out.println("Doctor's appointment: " + appointment);
        System.out.println("Expiration date: " + expirationDate);

    }
}
