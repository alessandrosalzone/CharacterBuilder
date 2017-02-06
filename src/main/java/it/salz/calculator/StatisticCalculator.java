package it.salz.calculator;

import it.salz.Player;
import it.salz.provider.statistic.Statistic;

public class StatisticCalculator implements Calculate<Statistic> {

	private StatisticCalculator(){}
	
	public static StatisticCalculator get(){
		return new StatisticCalculator();
	}
	
	@Override
	public int calculate(Player player, Statistic provider) {
		return provider.getStatistic(player);
	}

}
