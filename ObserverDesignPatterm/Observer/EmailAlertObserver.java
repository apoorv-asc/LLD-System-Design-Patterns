package ObserverDesignPatterm.Observer;

import ObserverDesignPatterm.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
	
	String email;
	StockObservable observable;
	
	public EmailAlertObserver(String email, StockObservable observable) {
		super();
		this.email = email;
		this.observable = observable;
	}



	@Override
	public void update() {
		sendMail(email,"Product is back in the stock");		
	}



	private void sendMail(String email, String msg) {
		 System.out.println("Email triggered to "+email+":"+msg);
		
	}

}
