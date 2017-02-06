package it.salz.common;

import java.util.Random;

import it.salz.Player;

public class Util {
	private static final String borderLine = "==============================================";
	private static final String lineSeparator = "----------------------------------------------";
	public static int getBonus(int strength) {
		return (strength - 10) /2;
	}

	public static int getRandormCharacter(EnumPolicy policy) {
		int result=0;
		switch (policy) {
		case FOURDICE:
			int d1=0,d2=0,d3=0;
			for (int i = 0; i < 4; i++) {
				int dice=getRandomNumber(6);
				System.out.println("fordice:" + dice);
				if(dice> d3){
					d1=d2;
					d2=d3;
					d3=dice;
				}else if(dice > d2){
					d1=d2;
					d2=dice;
				}else if(dice > d1){
					d1=dice;
				}
			}
			result=d1+d2+d3;
			break;
		case BESTOFTHRE:
			for (int i = 0; i < 3; i++) {
				int dice=getRandormCharacter();
				System.out.println("bestofthre:" + dice);
				if(result< dice){
					result=dice;
				}
			}
			break;
		case PRIMARY:
			int dice=getRandormCharacter();
			if(dice<14){
				dice=getRandormCharacter(EnumPolicy.PRIMARY);
			}
			result=dice;
			System.out.println("PRIMARY:" + result);
			break;
		case SECONDARY:
			int dice1=getRandormCharacter();
			if(dice1<12){
				dice1=getRandormCharacter(EnumPolicy.SECONDARY);
			}
			result=dice1;
			System.out.println("PRIMARY:" + result);
			break;
		default:
			result=getRandormCharacter();
			break;
		}
		return result;
	}
	
	public static int getRandormCharacter() {
		return getRandomNumber(6) + getRandomNumber(6) +getRandomNumber(6);
	}

	public static int getRandomNumber(int max) {
		return new Random().nextInt(max) + 1;
	}

	public static void print(Player pngPlayer) {
		System.out.println(borderLine);
		System.out.println("PLAYER: " + pngPlayer.getName());
		System.out.println(String.format("%1$-10s %2$10s", "Race:" + pngPlayer.getRace(),"Class:" + pngPlayer.getPlayerClass()));
		System.out.println(lineSeparator);
		System.out.println(String.format("%1$-15s %2$3s %3$4s %4$15s %5$5s", "Strength: " , pngPlayer.getStrength(),"("+Util.getBonus(pngPlayer.getStrength()) +")" ,"Inteligence: ", pngPlayer.getInteligence()+ "("+Util.getBonus(pngPlayer.getInteligence()) +")"));
		System.out.println(String.format("%1$-15s %2$3s %3$4s %4$15s %5$5s", "Dextery: " , pngPlayer.getDextery(),"("+Util.getBonus(pngPlayer.getDextery()) +")","Wisdom: " , pngPlayer.getWisdom()+ "("+Util.getBonus(pngPlayer.getWisdom()) +")"));
		System.out.println(String.format("%1$-15s %2$3s %3$4s %4$15s %5$5s", "Costitution: " , pngPlayer.getCostitution(),"("+Util.getBonus(pngPlayer.getCostitution()) +")","Charisma: " , pngPlayer.getCharisma()+ "("+Util.getBonus(pngPlayer.getCharisma()) +")"));
		System.out.println(lineSeparator);
		System.out.println("Life Point:" + pngPlayer.getLifePoint());
		System.out.println("Armor Class:" + pngPlayer.getArmorClass());
		System.out.println(lineSeparator);
		System.out.println(String.format("%1$-7s %2$-12s %3$-12s %4$-12s ","Bonus","Figth","Hit","Distance"));
		System.out.println(String.format("%1$-7s %2$-12s %3$-12s %4$-12s "," ",pngPlayer.getAttackBonus(),pngPlayer.getHitBonus(),pngPlayer.getDistanceBonus()));
		System.out.println(borderLine);
	}
}
