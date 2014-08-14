package Items.WeaponArmor;

public abstract class WeaponItem extends Item{
	protected double attackScore;			/* weapon damage*/
	protected double attackSpeed;			/* attack speed vaires from 0 - 100*/
	
	public WeaponItem(){
		super();
		this.attackScore = 1;
		this.name = "Unknown WEAPON name";
		this.attackSpeed = 10;
	}
	
	public double getAttackScore(){
		return attackScore * (this.attackSpeed/100);
	}
	
}
