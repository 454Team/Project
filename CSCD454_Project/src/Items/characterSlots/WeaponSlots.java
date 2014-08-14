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
	
	public double increaseDamage(double damage){
		double temp = damage - weaponItem.getAttackScore();
		return temp;
	}
	
	@Override
	public Item swap(Item newItem) {
		Item temp = null;
		try{
				temp = weaponItem;
				//weaponItem = null;
				weaponItem = (WeaponItem) newItem;
				return temp;
		}catch(Exception e){
			weaponItem = (WeaponItem) temp;
			temp= null;
			return newItem;
		}
		//return temp;	
	}

	@Override
	public String toString(){
		return "" + this.weaponItem.toString(); 
	}
	
	@Override
	public void remove() {
		this.weaponItem = (WeaponItem) ItemFactory.create().buyItem(Constants.BASIC_SWORD );			// free weapon here
	}

	@Override
	public Item copyItem() {
			return weaponItem;
		}



}
