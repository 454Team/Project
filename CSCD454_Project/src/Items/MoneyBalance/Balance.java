package Items.MoneyBalance;

import Items.Constants.Constants;
import Items.WeaponArmor.Item;
import character.Character;
public class Balance {
	private static Balance balanceClass = null;
	private double balance;
	
	private Balance() {
		this.balance = Constants.initialBalance;
	}
	
	public static Balance create(){
		if(balanceClass == null)
			 balanceClass =  new Balance();
		return balanceClass;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public boolean CompleteTransaction(Item item){
		if(!item.validate(balance))
			return false;
		this.balance = this.balance - item.getMoney();
		return true;
	}
	
	public boolean CompleteTransaction(Character character){
		if(!character.validate(balance))
			return false;
		this.balance = this.balance - character.getMoney();
		return true;
	}
	
	public boolean CompleteAddedTransaction(Item item){
		if(!item.validate(balance))
			return false;
		if(item.getPaybackMoney() == 0)			// basic item
			return false;
		this.balance = this.balance + item.getPaybackMoney();
		return true;
	}

	public boolean CompleteAddedTransaction(Character character) {
		if(!character.validate(balance))
			return false;
		if(character.getPaybackMoney() == 0)			// basic item
			return false;
		this.balance = this.balance + character.getPaybackMoney();
		return true;
	}

}
