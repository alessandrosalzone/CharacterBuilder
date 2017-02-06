package it.salz.provider.bonus;

import it.salz.EnumCharacter;
import it.salz.Player;

public class BonusRace implements Bonus {

	private EnumCharacter characther;

	public BonusRace(EnumCharacter strength) {
		this.characther = strength;
	}

	@Override
	public int getBonus(Player player) {

		switch (characther) {
		case STRENGTH:
			switch (player.getRace()) {
				case HALFORC: return 4;
			}
			break;
		case COSTITUTION:
			switch (player.getRace()) {
				case DWARF:return 2;
				case ELF: return -2;
			}
			break;
		case WISDOM:
			switch (player.getRace()) {
				case DWARF:return 2;
			}
			break;
		case DEXTERY:
			switch (player.getRace()) {
				case ELF: return 2;
			}
			break;
		case INTELIGENCE:
			switch (player.getRace()) {
				case ELF: return 2;
				case HALFORC: return -2;
			}
			break;
		case CHARISM:
			switch (player.getRace()) {
				case DWARF:return -2;
				case HALFORC: return -2;
			}
			break;
		}
		return 0;
	}

}
