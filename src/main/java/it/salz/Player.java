package it.salz;

import java.util.HashMap;

import it.salz.enumeration.EnumClass;
import it.salz.enumeration.EnumRace;

public class Player {
	private String name;
	private int dextery;
	private int costitution;
	private int inteligence;
	private int wisdom;
	private int charisma;
	private int strength;
	private int playerClass;
	private int race;
	private int lifePoint;
	private int figthBonus;
	private int hitBonus;
	private int distanceBonus;
	private int armorClass;
	private HashMap<String,Integer> modifier= new HashMap<>();

	private Player(String name) {
		this.name=name;
	}

	public static Player setRace(Player pngPlayer, int randomRace) {
		pngPlayer.race=randomRace;
		return pngPlayer;
	}

	public static Player setClass(Player pngPlayer, int randomClass) {
		pngPlayer.playerClass= randomClass;
		return pngPlayer;
	}

	public static Player init(String name) {
		return new Player(name);
	}

	public void setStrength(int randormCharacter) {
		this.strength+= randormCharacter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDextery() {
		return dextery;
	}

	public void setDextery(int dextery) {
		this.dextery += dextery;
	}

	public int getInteligence() {
		return inteligence;
	}

	public void setInteligence(int inteligence) {
		this.inteligence += inteligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom += wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma += charisma;
	}

	public EnumClass getPlayerClass() {
		for (EnumClass classPlayer: EnumClass.values()) {
			if(classPlayer.getValue() == this.playerClass){
				return classPlayer;
			}
			
		}
		return null;
	}

	public void setPlayerClass(int playerClass) {
		this.playerClass = playerClass;
	}

	public EnumRace getRace() {
		for (EnumRace race: EnumRace.values()) {
			if(race.getValue() == this.race){
				return race;
			}
			
		}
		return null;
	}

	public void setRace(int race) {
		this.race = race;
	}

	public int getCostitution() {
		return costitution;
	}

	
	public void setCostitution(int costitution) {
		this.costitution += costitution;
	}

	public int getStrength() {
		return strength;
	}

	public int getLifePoint() {
		return lifePoint;
	}

	public void setLifePoint(int lifePoint) {
		this.lifePoint += lifePoint;
	}

	public void setFigthBonus(int figthBonus) {
		this.figthBonus+=figthBonus;
	}

	public int getAttackBonus() {
		return figthBonus;
	}

	public void setHitBonus(int calculate) {
		this.hitBonus+=calculate;
	}

	public void setDistanceBonus(int calculate) {
		this.distanceBonus+=calculate;
	}

	public int getFigthBonus() {
		return figthBonus;
	}

	public int getHitBonus() {
		return hitBonus;
	}

	public int getDistanceBonus() {
		return distanceBonus;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public void addModifier(String key, int calculate) {
		int actualValue= getModifier(key);
		if(actualValue !=0){
			this.modifier.put(key, new Integer((calculate+actualValue)));
		}else{
			this.modifier.put(key, new Integer(calculate));
		}
		
	}

	private int getModifier(String key) {
		if(this.modifier.get(key)!=null){
			return this.modifier.get(key);
		}
		return 0;
	}
}
