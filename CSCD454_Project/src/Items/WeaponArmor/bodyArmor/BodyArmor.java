package Items.WeaponArmor.bodyArmor;

import Items.WeaponArmor.ArmorItem;

public class BodyArmor extends ArmorItem {
	@Override
	public String toString(){
		return super.toString()+  "		in category : Body Armor"  + "		with Defence " + this.defenseScore;
	}
}
