package it.salz;

public enum EnumCharacter{
	STRENGTH(1), DEXTERY(2), COSTITUTION(3), INTELIGENCE(4), WISDOM(5), CHARISM(6);
	private int value;
	private EnumCharacter(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}
