import FightingBattle.HeroSlots.Battlefield;
import FightingBattle.HeroSlots.CharacterBattleSlot1;
import FightingBattle.HeroSlots.HeroSlots;
import PaladinSkills.Gospel;
import character.Character;
import character.CharacterFactory;
import character.Paladin;

/**
 * 
 */

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Paladin pally = new Paladin();
		//pally.setSkill1(new Gospel());
		//pally.specialAttack();
		/*Character character = CharacterFactory.getCharacter("warrior");
		
		character = CharacterFactory.getCharacter("mage");
		
		character = CharacterFactory.getCharacter("paladin");
		
		character = CharacterFactory.getCharacter("priest");
		
		character = CharacterFactory.getCharacter("rogue");*/
		
		int roomLevel = 1;
		
		HeroSlots hero1 = new CharacterBattleSlot1("warrior") ;
		HeroSlots hero2 = new CharacterBattleSlot1("mage") ;
		HeroSlots hero3 = new CharacterBattleSlot1("priest") ;
		
		Battlefield.create().loadHero(hero1, hero2, hero3)
							.loadMonster(roomLevel)
							.fight();
		
	}

}
