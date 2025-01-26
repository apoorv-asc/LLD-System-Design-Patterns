package ObserverDesignPattern;

import ObserverDesignPattern.src.Observable.IPhoneObservableImp;
import ObserverDesignPattern.src.Observable.StockObservable;
import ObserverDesignPattern.src.Observer.EmailAlertObserver;
import ObserverDesignPattern.src.Observer.MobileAlertObserver;
import ObserverDesignPattern.src.Observer.NotificationAlertObserver;

public class Main {

	public static void main(String ar[]) {
		StockObservable iPhone = new IPhoneObservableImp();
		
		NotificationAlertObserver obsEm1 = new EmailAlertObserver("apoorv@gmail.com", iPhone);
		NotificationAlertObserver obsEm2 = new EmailAlertObserver("apoorv@gmail.com", iPhone);
		
		NotificationAlertObserver obsMob1 = new MobileAlertObserver("8115566990", iPhone);
		
		iPhone.add(obsEm1);
		iPhone.add(obsEm2);
		
		iPhone.add(obsMob1);
		
		iPhone.setStockCounts(10);
		
	}
	
}
