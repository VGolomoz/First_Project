package Task2;

public class LocUA extends Localization {
    public AudioLocalization getAudio() {
        return new AudioUA();
    }

    public SubLocalization getSubtitles() {
        return new SubUA();
    }
}
