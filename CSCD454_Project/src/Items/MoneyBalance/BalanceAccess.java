package Items.MoneyBalance;

import Items.WeaponArmor.Item;

public interface BalanceAccess {
	public double access(Balance balance);
	public Balance Accesscreate();
	public boolean paidTransaction(Balance balance,Item item);
}
