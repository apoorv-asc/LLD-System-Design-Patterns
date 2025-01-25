package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{
	
	public SportsVehicle() {
		super(new SportDriveStrategy());
	}
}
