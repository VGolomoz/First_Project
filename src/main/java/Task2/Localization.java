package Task2;

public abstract class Localization {

    private static Localization originalLoc = null;
    private static Localization uaLoc = null;
    private static Localization ruLoc = null;

    public abstract AudioLocalization getAudio();
    public abstract SubLocalization getSubtitles();

    public static Localization getLocalization(String language)
            throws UnknownLanguageException {

        if (language == null) {
            return null;
        }

        Localization localization = null;
        switch (language) {
            case "original":
                if (originalLoc == null)
                    originalLoc = new LocOriginal();
                localization = originalLoc;
                break;
            case "ukrainian":
                if (uaLoc == null)
                    uaLoc = new LocUA();
                localization = uaLoc;
                break;
            case  "russian":
                if (ruLoc == null)
                    ruLoc = new LocRU();
                localization = ruLoc;
                break;
            default:
                throw new UnknownLanguageException();
        }

        return localization;
    }
}
