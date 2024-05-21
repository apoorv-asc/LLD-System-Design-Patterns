package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
	public void add(NotificationAlertObserver obs);
	public void remove(NotificationAlertObserver obs);
	public void notifySubscribers();
	public void setStockCounts(int count);
	public int getStockCounts();
	
}
