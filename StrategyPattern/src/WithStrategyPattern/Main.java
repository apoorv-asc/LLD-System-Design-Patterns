package WithStrategyPattern;

public class Main {
	public static void main(String arp[]) {
		
		Vehicle vh = new GoodsVehicle();
		vh.drive();
		
		Vehicle vh2 = new SportsVehicle();
		vh2.drive();
		
	}
}
