package it.salz.enumeration;

/**
 * 1-Human
 * 2-Dwarf
 * 3-Elf
 * 4-HalfElf
 * 5-Gnome
 * 6-HalfOrc
 * 7-Halfling
**/
public enum EnumRace {
	HUMAN(1),DWARF(2),ELF(3),HALFELF(4),GNOME(5),HALFORC(6),HALFLING(7);
	private int value;
	
	EnumRace(int value){
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
}
