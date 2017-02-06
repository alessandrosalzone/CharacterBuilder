package it.salz.enumeration;

/**
	 * 1-Barbarian: pg.24
	 * 2-Bard: pg.26
	 * 3-Cleric: pg.30
	 * 4-Druid: pg.33
	 * 5-Monk: pg.39
	 * 6-Fighter: pg.37
	 * 7-Paladin: pg.42
	 * 8-Ranger: pg.46
	 * 9-Rogue: pg.49
	 * 10-Sorcerer: pg.51
	 * 11-Wizard: pg.55
**/
public enum EnumClass {
	BARBARIAN(1),BARD(2),CLERIC(3),DRUID(4),MONK(5),FIGHTER(6),PALADIN(7),
	RANGER(8),ROGUE(9),SORCERER(10),WIZARD(11);
	private int value;
	
	EnumClass(int value){
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
}
