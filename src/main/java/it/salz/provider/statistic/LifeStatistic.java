package it.salz.provider.statistic;

import it.salz.Player;
import it.salz.common.Util;

public class LifeStatistic implements Statistic{

	@Override
	public int getStatistic(Player player) {
		int result=0;
		switch (player.getPlayerClass()) {
		case BARBARIAN:
			result= 12;
			break;
		case BARD:
			result= 6;
			break;
		case CLERIC:
			result= 8;
			break;
		case DRUID:
			result= 8;
			break;
		case MONK:
			result= 8;
			break;
		case FIGHTER:
			result= 10;
			break;
		case PALADIN:
			result= 10;
			break;
		case RANGER:
			result= 8;
			break;
		case ROGUE:
			result= 6;
			break;
		case SORCERER:
			result= 4;
			break;
		case WIZARD:
			result= 4;
			break;
		}
		result+=Util.getBonus(player.getCostitution());
		return result;
	}

}
