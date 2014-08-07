package Items.WeaponArmor.bodyArmor;

import Items.Constants.Constants;

public class AngelBodyArmor extends BodyArmor {

	public AngelBodyArmor() {
		this.name = Constants.ANGEL_BODY_ARMOR;
		this.defenseScore = 10;
		this.money = 300;
		this.paybackMoney = this.money /2 ;
	}

}
