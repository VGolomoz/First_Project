package Task2;

public class InceptionMovie extends Movie {


    private int index = 1;
    private String name = "Inception";
    private String genre = "action";
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


