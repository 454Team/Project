package Items.WeaponArmor.headArmor;

import Items.WeaponArmor.ArmorItem;

public class HeadArmor extends ArmorItem{
	@Override
	public String toString(){
		return super.toString()+  "		in category : Head Armor"  + "		with Defence " + this.defenseScore;
	}
}
