package Items.MoneyBalance;

import Items.WeaponArmor.Item;
import character.Character;
public interface BalanceAccess {
	public double access(Balance balance);
	public Balance Accesscreate();
	public boolean paidTransaction(Balance balance,Item item);
	public boolean paidTransaction(Balance balance,Character character);
}
