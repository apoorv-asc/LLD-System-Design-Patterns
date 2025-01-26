package src;

import src.Toppings.ExtraChesse;
import src.Toppings.Mushroom;

public class Main {
	public static void main(String ar[]) {
		
		BasePizza bp = new ExtraChesse(new Mushroom(new VegDelight()));
		System.out.println(bp.cost());
				
		
	}
}
