package Task2;

public class PeterPanMovie extends Movie {


    private int index = 2;
    private String name = "Peter Pan";
    private String genre = "animation";
    private String[] language = {"original", "russian", "ukrainian"};


    @Override
    public void playMovie() {
        System.out.println("Play: " + name);
    }

    @Override
    public void getDescription() {
        System.out.println(index + ". " + name + " (" + genre + ")");
    }

    @Override
    public void setLanguage() {
        System.out.println("Select the language of audio track and subtitles: ");
        for (String a: language) {
            System.out.println(a);
        }
    }
}
