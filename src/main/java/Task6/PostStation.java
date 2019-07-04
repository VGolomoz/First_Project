package Task6;

public interface PostStation {
    public void registerSubscriber(Subscriber... s);
    public void removeSubscriber(Subscriber... s);
    public void notifySubscribers();
}
