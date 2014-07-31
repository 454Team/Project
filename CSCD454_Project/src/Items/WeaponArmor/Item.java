package Items.WeaponArmor;

public class Item {
	protected String name;					/* name of weapon*/
	protected double criticalPoint;			/* critical damage or defense*/
	protected double criticalPercent;		/* percent to perform critical attack [0,100]*/	
	protected double endurance ;			/* percent of armor before reparing , NOT SURE WE'RE NEED THIS*/
	protected double money; 				/*Money to buy this item*/
	protected double abitiy;
	protected double strength;
	protected double intelligent;
	protected double paybackMoney;
	
	public Item(){
		name = "Unknown ITEM name";
		this.criticalPoint = 1;
		this.criticalPercent = 1;
		this.endurance = 1;
		this.money = 1;
		this.abitiy = 1;
		this.strength = 1;
		this.intelligent = 1;
		this.paybackMoney = 1;
	}
	
	public boolean validate(double balance){
		return balance >= this.money ; 
	}
	
	public boolean compareName(Item item){
		return this.name.equals(item.getName());
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getPaybackMoney(){
		return this.paybackMoney;
	}
	
	public double getMoney(){
		return this.money;
	}
	
	@Override
	public String toString(){
		return "item name : "+ this.name;
	}
	
}
