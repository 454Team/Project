package Items.characterSlots;

import Items.Constants.Constants;
import Items.WeaponArmor.Item;
import Items.WeaponArmor.WeaponItem;
import Items.itemFactory.ItemFactory;

public class WeaponSlots implements Slots {
	
	private WeaponItem weaponItem = null;
	public WeaponSlots() {
		this.weaponItem = (WeaponItem) ItemFactory.create().buyItem(Constants.BASIC_SWORD );			// free weapon here
	}
	
	@Override
	public boolean swap(Item newItem) {
		if(newItem.getClass().equals(weaponItem.getClass())){
			weaponItem = null;
			weaponItem = (WeaponItem) newItem;
			return true;			// swap successed
		}
		return false;			// fail to swap
		
	}

	public String toString(){
		return "Character is holding " + this.weaponItem.toString()  + "\n"; 
	}
	
	@Override
	public void remove() {
		
	}



}
