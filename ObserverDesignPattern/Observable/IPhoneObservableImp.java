package ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IPhoneObservableImp implements StockObservable {
	
	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver obs) {
		observerList.add(obs);
		
	}

	@Override
	public void remove(NotificationAlertObserver obs) {
		 observerList.remove(obs);
		
	}

	@Override
	public void notifySubscribers() {
		 for(NotificationAlertObserver x : observerList) {
			 x.update();
		 }
		
	}

	@Override
	public void setStockCounts(int count) {
		 if(stockCount == 0) {
			 notifySubscribers();
		 }
		 this.stockCount += count;
		
	}

	@Override
	public int getStockCounts() {
		 return this.stockCount;
	}

}
