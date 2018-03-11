package Chap2ObserverPattern;

/**
 * Interface for publisher.
 * @author huazhe
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
