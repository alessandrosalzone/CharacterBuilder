package it.salz.calculator;

import it.salz.Player;
import it.salz.provider.bonus.Bonus;

public class BonusCalculator implements Calculate<Bonus> {

	private BonusCalculator(){}
	
	public static BonusCalculator get(){
		return new BonusCalculator();
	}
	
	@Override
	public int calculate(Player player, Bonus provider) {
		return provider.getBonus(player);
	}

}
