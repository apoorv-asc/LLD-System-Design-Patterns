package ObserverDesignPatterm;

import ObserverDesignPatterm.Observable.IPhoneObservableImp;
import ObserverDesignPatterm.Observable.StockObservable;
import ObserverDesignPatterm.Observer.EmailAlertObserver;
import ObserverDesignPatterm.Observer.MobileAlertObserver;
import ObserverDesignPatterm.Observer.NotificationAlertObserver;

public class observerTrigger {

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
