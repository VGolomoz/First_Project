package Task6;

public class PublishingHouse {

    String magazine;
    String newspaper;

    public PublishingHouse(String magazine, String newspaper){
        this.magazine = magazine;
        this.newspaper = newspaper;
    }

    public void releaseEdition(LocalPostOffice localPostOffice){
        localPostOffice.getEdition(magazine, newspaper);
    }
}
