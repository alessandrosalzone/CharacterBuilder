package it.salz.calculator;

import it.salz.Player;

public interface Calculate<TYPE> {
	public int calculate(Player player, TYPE provider);
}
