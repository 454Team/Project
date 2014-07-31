package Items.WeaponArmor.axes;

import Items.WeaponArmor.WeaponItem;

public class Axes extends WeaponItem {
	
	// some special skills for axes here
	
	@Override
	public String toString(){
		return super.toString()+  " 	in category : Axes"  + " 		with attack " + this.attackScore;
	}
}
