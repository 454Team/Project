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
	public boolean swap(Item newItem) {
		if(newItem.getClass().equals(armorItem.getClass())){
			armorItem = null;
			armorItem = (ArmorItem) newItem;
			return true;			// swap successed
		}
		return false;			// fail to swap
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
