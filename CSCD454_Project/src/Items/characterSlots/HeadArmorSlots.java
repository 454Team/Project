package Items.characterSlots;

import Items.Constants.Constants;
import Items.WeaponArmor.ArmorItem;
import Items.WeaponArmor.Item;
import Items.itemFactory.ItemFactory;

public class HeadArmorSlots implements Slots {

	private ArmorItem armorItem;

	public HeadArmorSlots() {
		this.armorItem = (ArmorItem) ItemFactory.create().buyItem(Constants.BASIC_HEAD_ARMOR);
	}
	
	@Override
	public Item swap(Item newItem) {
		Item temp = armorItem;
		armorItem = null;
		armorItem = (ArmorItem) newItem;
		return temp;
	}

	@Override
	public void remove() {
		this.armorItem = (ArmorItem) ItemFactory.create().buyItem(Constants.BASIC_HEAD_ARMOR);
	}

	@Override
	public Item copyItem() {
		return armorItem;
	}

}
