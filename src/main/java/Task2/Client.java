package Task2;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the movie which you want to see: ");
        String movieName = in.nextLine();

        System.out.println("Choose available language (original, ukrainian, russian): ");
        String language = in.nextLine().toLowerCase();
        in.close();

        Localization loc;

        try {
            loc = Localization.getLocalization(language);

            SubLocalization sl = loc.getSubtitles();
            sl.downloadSubs();
            sl.openSubs();

            AudioLocalization al = loc.getAudio();
            al.downloadAudio();
            al.openAudio();
            al.startAudio();

            System.out.println("Play " + "'" + movieName + "'");


        } catch (UnknownLanguageException e){System.err.println("This language is not supported!");}



    }
}
