package Task6;

public class App {

    public static void main(String[] args) {
        LocalPostOffice localPostOffice = new LocalPostOffice();
        Father father = new Father();
        Mother mother = new Mother();
        Daughter daughter = new Daughter();
        localPostOffice.registerSubscriber(father, mother);

        new PublishingHouse("National Geographic 06' ", "Times 06' ").releaseEdition(localPostOffice);
        localPostOffice.whatSubscribersRead();

        new PublishingHouse("National Geographic 08' ", "Times 08' ").releaseEdition(localPostOffice);
        localPostOffice.whatSubscribersRead();
    }
}
