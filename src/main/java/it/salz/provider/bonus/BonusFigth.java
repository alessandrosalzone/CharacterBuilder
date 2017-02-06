package it.salz.provider.bonus;

import it.salz.Player;
import it.salz.common.Util;

public class BonusFigth implements Bonus{

	@Override
	public int getBonus(Player player) {
		
		return 0 + Util.getBonus(player.getStrength());
	}

}
