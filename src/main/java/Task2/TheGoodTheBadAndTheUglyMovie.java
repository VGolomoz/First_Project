package Task2;

public class TheGoodTheBadAndTheUglyMovie extends Movie {

    private int index = 3;
    private String name = "The Good, the Bad and the Ugly";
    private String genre = "western";
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
