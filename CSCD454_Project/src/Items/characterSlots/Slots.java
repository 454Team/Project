package Items.characterSlots;

import Items.WeaponArmor.Item;

public interface Slots {
	public boolean swap(Item newItem);			// swap new item
	public void remove();						// remove new item, default return to basic Item
}
