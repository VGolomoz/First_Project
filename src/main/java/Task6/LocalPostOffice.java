package Task6;

import java.util.ArrayList;

public class LocalPostOffice implements PostStation {
    private ArrayList<Subscriber> subscribers;
    private String magazine;
    private String newspaper;

    public LocalPostOffice(){
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber... s) {
        for (Subscriber x: s) {
            subscribers.add(x);
        }
    }

    @Override
    public void removeSubscriber(Subscriber... s) {
       for (Subscriber x: s) {
            int i = subscribers.indexOf(x);
            if (i >= 0) subscribers.remove(i);
        }
    }

    @Override
    public void notifySubscribers() {
        for (int i = 0; i < subscribers.size(); i++) {
            Subscriber subscriber = subscribers.get(i);
            subscriber.receiveEdition(magazine, newspaper);
        }
    }

    public void getEdition(String magazine, String newspaper){
        this.magazine = magazine;
        this.newspaper = newspaper;
        notifySubscribers();
    }

    public void whatSubscribersRead(){
        for (int i = 0; i < subscribers.size(); i++) {
            Subscriber subscriber = subscribers.get(i);
            subscriber.read();
        }
    }
}

