package src.Toppings;

import src.BasePizza;

public class ExtraChesse extends ToppingDecorator{
	
	BasePizza bp;
	
	public ExtraChesse(BasePizza bp) {
		this.bp = bp;
	}
	
	@Override
	public int cost() {
		return this.bp.cost() + 10;
	}
}
