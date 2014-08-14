package Items.characterSlots;

import Items.Constants.Constants;
import Items.WeaponArmor.ArmorItem;
import Items.WeaponArmor.Item;
import Items.WeaponArmor.headArmor.HeadArmor;
import Items.itemFactory.ItemFactory;

public class HeadArmorSlots implements Slots {

	private HeadArmor armorItem;

	public HeadArmorSlots() {
		this.armorItem = (HeadArmor) ItemFactory.create().buyItem(Constants.BASIC_HEAD_ARMOR);
	}
	
	@Override
	public Item swap(Item newItem) {
		Item temp = null;
		try{
			temp = armorItem;
			armorItem = null;
			armorItem = (HeadArmor) newItem;
			return temp;
		}catch(Exception e){
			armorItem = (HeadArmor) temp;
			temp = null;
		}
		return temp;
	}

	@Override
	public void remove() {
		this.armorItem = (HeadArmor) ItemFactory.create().buyItem(Constants.BASIC_HEAD_ARMOR);
	}

	@Override
	public Item copyItem() {
		return armorItem;
	}

	@Override
	public String toString(){
		return "" + this.armorItem.toString(); 
	}
	
}
