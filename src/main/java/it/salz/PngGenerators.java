package it.salz;

import it.salz.calculator.BonusCalculator;
import it.salz.calculator.StatisticCalculator;
import it.salz.common.EnumPolicy;
import it.salz.common.Util;
import it.salz.enumeration.EnumRace;
import it.salz.provider.bonus.BonusDistance;
import it.salz.provider.bonus.BonusFigth;
import it.salz.provider.bonus.BonusHit;
import it.salz.provider.bonus.BonusRace;
import it.salz.provider.statistic.ArmorStatistic;
import it.salz.provider.statistic.LifeStatistic;

/**
 * Generatore personaggio non giocante.
 * @author luca
 *
 */
public class PngGenerators {

	private PngGenerators(){}
 
	public static void main( String[] args ){
		String name = "Wolf";
		Util.print(createPng(name));
    }

	public static Player createPng(String name) {
		Player pngPlayer = Player.init(name );
		//SETTING RACE
		Player.setRace(pngPlayer, getRandomRace());
		//SETTING CHARACTHERS
		pngPlayer.setStrength(Util.getRandormCharacter(EnumPolicy.BESTOFTHRE));
		pngPlayer.setDextery(Util.getRandormCharacter(EnumPolicy.PRIMARY));
		pngPlayer.setCostitution(Util.getRandormCharacter(EnumPolicy.FOURDICE));
		pngPlayer.setInteligence(Util.getRandormCharacter(EnumPolicy.SECONDARY));
		pngPlayer.setWisdom(Util.getRandormCharacter());
		pngPlayer.setCharisma(Util.getRandormCharacter());
		//SETTING CLASS
		pngPlayer.setClass(pngPlayer, calculatePlayerClass(pngPlayer));
		//ADD MODIFIERS
		addRaceModifier(pngPlayer);
		addClassModifier(pngPlayer);
		//SET ATTACK BONUS
		pngPlayer.setFigthBonus(BonusCalculator.get().calculate(pngPlayer, new BonusFigth()));
		pngPlayer.setHitBonus(BonusCalculator.get().calculate(pngPlayer, new BonusHit()));
		pngPlayer.setDistanceBonus(BonusCalculator.get().calculate(pngPlayer, new BonusDistance()));
		//SET ATTRIBUTE
		pngPlayer.setLifePoint(StatisticCalculator.get().calculate(pngPlayer, new LifeStatistic()));
		pngPlayer.setArmorClass(StatisticCalculator.get().calculate(pngPlayer, new ArmorStatistic()));
		return pngPlayer;
	}

	private static int calculatePlayerClass(Player pngPlayer) {
		int random= getRandomPlayerClass();
		//if(!validClass(pngPlayer,random)) return calculatePlayerClass(pngPlayer);
		return random;
	}

	private static boolean validClass(Player player, int random) {
		return ClassValidator.getInstance().isValid(player,random);
	}

	/**
	 * This method add class modifiers to player
	 * @param pngPlayer
	 */
	private static void addClassModifier(Player pngPlayer) {
	}

	/**
	 * This method add race modifiers to player
	 * @param pngPlayer
	 */
	private static void addRaceModifier(Player pngPlayer) {
		pngPlayer.addModifier("RACE." + EnumCharacter.STRENGTH.toString(),BonusCalculator.get().calculate(pngPlayer, new BonusRace(EnumCharacter.STRENGTH)));
	}

	private static int getRandomPlayerClass() {
		return Util.getRandomNumber(11);
	}

	private static int getRandomRace() {
		return Util.getRandomNumber(7);
	}
}
