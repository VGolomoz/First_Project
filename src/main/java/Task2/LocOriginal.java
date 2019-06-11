package Task2;

public class LocOriginal extends Localization {
    public AudioLocalization getAudio() {
        return new AudioOriginal();
    }

    public SubLocalization getSubtitles() {
        return new SubOriginal();
    }
}
