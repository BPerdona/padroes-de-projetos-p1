package observerPattern;

public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notify(int numeroMaquina, String message);
    public void notifyAll(String message);
}
