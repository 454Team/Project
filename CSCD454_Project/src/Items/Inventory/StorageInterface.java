package Items.Inventory;

import Items.WeaponArmor.Item;

public abstract class StorageInterface {
	public abstract Item getItemfromStorage(Item neededItem);
	public abstract boolean sellItemfromStorage(Item removedItem);
	public abstract boolean SwapItem(Item selectedInListItem,Item fromSlotItem);
}
