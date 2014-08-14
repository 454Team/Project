package Items.characterSlots;

import Items.Constants.Constants;
import Items.WeaponArmor.ArmorItem;
import Items.WeaponArmor.Item;
import Items.WeaponArmor.bodyArmor.BodyArmor;
import Items.itemFactory.ItemFactory;

public class BodyArmorSlots implements Slots{

	private BodyArmor armorItem;
	
	public BodyArmorSlots() {
		this.armorItem = (BodyArmor) ItemFactory.create().buyItem(Constants.BASIC_BODY_ARMOR);
	}

	@Override
	public Item swap(Item newItem) {
		Item temp = null;
		try{
			temp = armorItem;
			armorItem = null;
			armorItem = (BodyArmor) newItem;
			return temp;
		}catch(Exception e){
			armorItem = (BodyArmor) temp;			// swap fail, return to original
			temp = null;
		}
		return temp;
	}

	@Override
	public void remove() {
		this.armorItem = (BodyArmor) ItemFactory.create().buyItem(Constants.BASIC_BODY_ARMOR);
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
