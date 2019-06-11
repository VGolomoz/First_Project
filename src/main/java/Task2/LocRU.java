package Task2;

public class LocRU extends Localization {
    public AudioLocalization getAudio() {
        return new AudioRU();
    }

    public SubLocalization getSubtitles() {
        return new SubRU();
    }
}
