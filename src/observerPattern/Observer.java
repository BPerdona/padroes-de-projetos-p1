package observerPattern;

public interface Observer {
    public void notify(Observable observable, String message);
}
