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

	public double reduceDamage(double damage){
		double temp = damage - armorItem.getDefenseScore();
		if(temp <0)
			temp = 0;
		return temp;
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
