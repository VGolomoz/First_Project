package Task2;

public class Client {

    public static void main(String[] args) {

        try {
            Movie.getMovie();

        } catch (UnknownMovieException me){System.err.println("This movie is not exist in our collection!");}
          catch (UnknownLanguageException le){System.err.println("This language is not supported!");}
    }
}

