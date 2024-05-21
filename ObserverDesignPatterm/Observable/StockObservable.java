package ObserverDesignPatterm.Observable;

import ObserverDesignPatterm.Observer.NotificationAlertObserver;

public interface StockObservable {
	public void add(NotificationAlertObserver obs);
	public void remove(NotificationAlertObserver obs);
	public void notifySubscribers();
	public void setStockCounts(int count);
	public int getStockCounts();
	
}
