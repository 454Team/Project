package Items.WeaponArmor;

public class ArmorItem extends Item {
	protected double defenseScore;			/* weapon damage*/
	
	
	public ArmorItem(){
		super();
		this.defenseScore = 1;
		this.name = "Unknown ARMOR name";
	}
	
	public double getDefenseScore(){
		return defenseScore;
	}
}
