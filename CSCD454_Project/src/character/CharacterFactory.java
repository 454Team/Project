package character;

import Items.Constants.Constants;
import Items.MoneyBalance.Balance;
import Items.MoneyBalance.BalanceAccess;
import Items.WeaponArmor.Item;

import com.sun.corba.se.impl.orbutil.closure.Constant;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class CharacterFactory implements BalanceAccess{

	private static CharacterFactory characterFactory = null;
	
	public static CharacterFactory create(){
		if(characterFactory == null)
			characterFactory = new CharacterFactory();
		return characterFactory;
	}
	
	private CharacterFactory(){}
	
	/*
	 * @param String includes the type of the chosen character.
	 * @return Character based on input type.
	 */
	public Character buyCharacter(String type) {
		
		Character character = null;
		
		switch(type) {
		case Constants.CHARACTER_ASSASSIN:
			character = new Assassin();
			break;
		case Constants.CHARACTER_ROGUE:
			character =  new Rogue();
			break;
		case Constants.CHARACTER_PRITEST:
			character =  new Priest();
			break;
		case Constants.CHARACTER_PALADIN:
			character =  new Paladin();
			break;
		case Constants.CHARACTER_SORCERER:
			character =  new Sorcerer();
			break;
		default:
			return new DefaultCharacter();
		}
		
		character = Charactervalidate(character);
		return character;
		
	} // End getCharacter
	

	private Character Charactervalidate(Character character){
		if(!paidTransaction(Accesscreate(),character) )
			return null;
		return character;
	}

	@Override
	public double access(Balance balance) {
		return balance.getBalance();
	}
	
	@Override
	public Balance Accesscreate() {
		return Balance.create();
	}

	@Override
	public boolean paidTransaction(Balance balance,Character character) {
		return balance.CompleteTransaction(character);
	}

	@Override
	public boolean paidTransaction(Balance balance, Item item) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
} // End CharacterFactory
