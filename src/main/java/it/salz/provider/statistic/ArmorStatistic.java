package it.salz.provider.statistic;

import it.salz.Player;
import it.salz.common.Util;

public class ArmorStatistic implements Statistic {

	@Override
	public int getStatistic(Player player) {
		return Util.getBonus(player.getDextery())+10;
	}

}
