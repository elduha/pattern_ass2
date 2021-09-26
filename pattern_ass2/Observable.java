package pattern_ass2;

public interface Observable {
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void nofifyObdervers();
}
