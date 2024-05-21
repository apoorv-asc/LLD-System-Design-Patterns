package ObserverDesignPatterm.Observer;

import ObserverDesignPatterm.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

	String mobileNo;
	StockObservable observable;
	
	
	
	public MobileAlertObserver(String mobileNo, StockObservable observable) {
		super();
		this.mobileNo = mobileNo;
		this.observable = observable;
	}



	@Override
	public void update() {
		sendMsg(this.mobileNo,"Product is back in the stock");
	}



	private void sendMsg(String mobileNo, String msg) {
		System.out.println("Message triggered to "+mobileNo+":"+msg);
		
	}

}
