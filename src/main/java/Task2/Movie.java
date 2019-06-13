package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Movie {

    private static Movie inception = new InceptionMovie();
    private static Movie peterPan = new PeterPanMovie();
    private static Movie theGoodtheBadtheUgly = new TheGoodTheBadAndTheUglyMovie();

    private static AudioLocalization audioOriginal = null;
    private static AudioLocalization audioRussian = null;
    private static AudioLocalization audioUkrainian = null;

    private static SubLocalization subOriginal = null;
    private static SubLocalization subRussian = null;
    private static SubLocalization subUkrainian = null;

    public abstract void playMovie();
    public abstract void getDescription();
    public abstract void setLanguage();

    public static void getMovie()
            throws UnknownMovieException, UnknownLanguageException {
        Movie movie = null;

        System.out.println("Which movie do you want to see: ");
        Movie.createMoviesCollection();
        Scanner in = new Scanner(System.in);
        String index = in.nextLine();

        switch (index) {
            case "1":
                if (inception == null)
                    inception = new InceptionMovie();
                movie = inception;
                break;
            case "2":
                if (peterPan == null)
                    peterPan = new PeterPanMovie();
                movie = peterPan;
                break;
            case  "3":
                if (theGoodtheBadtheUgly == null)
                    theGoodtheBadtheUgly = new TheGoodTheBadAndTheUglyMovie();
                movie = theGoodtheBadtheUgly;
                break;
            default:
                throw new UnknownMovieException();
        }
        movie.setLanguage();
        String language = in.nextLine();
        movie.getSubLocalization(language);
        movie.getAudioLocalization(language);
        movie.playMovie();

        in.close();

    }

    public void getAudioLocalization(String language)
            throws UnknownLanguageException {

        if (language == null) {
            throw new UnknownLanguageException();
        }

        AudioLocalization localization = null;
        switch (language) {
            case "original":
                if (audioOriginal == null)
                    audioOriginal = new AudioOriginal();
                localization = audioOriginal;
                break;
            case "ukrainian":
                if (audioUkrainian == null)
                    audioUkrainian = new AudioUA();
                localization = audioUkrainian;
                break;
            case  "russian":
                if (audioRussian == null)
                    audioRussian = new AudioRU();
                localization = audioRussian;
                break;
            default:
                throw new UnknownLanguageException();
        }
        localization.downloadAudio();
        localization.openAudio();
        localization.startAudio();
    }

    public void getSubLocalization(String language)
            throws UnknownLanguageException {

        if (language == null) {
            throw new UnknownLanguageException();
        }

       SubLocalization localization = null;
        switch (language) {
            case "original":
                if (subOriginal == null)
                    subOriginal = new SubOriginal();
                localization = subOriginal;
                break;
            case "ukrainian":
                if (subUkrainian == null)
                    subUkrainian = new SubUA();
                localization = subUkrainian;
                break;
            case  "russian":
                if (subRussian == null)
                    subRussian = new SubRU();
                localization = subRussian;
                break;
            default:
                throw new UnknownLanguageException();
        }
        localization.downloadSubs();
        localization.openSubs();
    }

    private static void createMoviesCollection(){
        ArrayList<Movie> moviesCollection = new ArrayList<>();
        moviesCollection.add(inception);
        moviesCollection.add(peterPan);
        moviesCollection.add(theGoodtheBadtheUgly);

        for (Movie a:moviesCollection) {
            a.getDescription();
        }
    }
}



