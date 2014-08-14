package character;

import java.util.Random;

import Items.WeaponArmor.Item;
import character.DefaultSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public abstract class Character {
	
	private double strength;
	private double agility;
	private double intelligence;
	private double vitality;
	private double luck;
	private double health;
	private double dexterity;
	private long experience;
	private long cap;
	private boolean isDefendingNow;
	private double money;
	private double buyBackMoney;
	private int level;
	
	private String desc;
	
	private final int maxDmg = (int) this.strength;
	private final int minDmg = (int) (this.strength*.975);
	
	private SkillsMain skill1;
	private SkillsMain skill2;
	private SkillsMain skill3;
	
	private final Random random = new Random();
	
	public Character() {
		/* Set Skills */
		this.setSkill1(new Default());
		this.setSkill2(new Default());
		this.setSkill3(new Default());
		/* Set Attributes */
		this.setAgility(50.0);
		this.setDexterity(50.0);
		this.setExperience(0);
		this.setIntelligence(50.0);
		this.setLuck(50.0);
		this.setStrength(50.0);
		this.setVitality(50.0);
		this.setDesc("Default");
		this.setCap(10);
		this.setDefendingNow(false);
		this.setMoney(0);
		this.setBuyBackMoney(0);
		this.setLevel(1);
		this.setHealth(this.vitality);
	} // End DVC

	public Character(SkillsMain skill1, SkillsMain skill2, SkillsMain skill3, double agility, double dexterity, double intelligence, double luck, double strength, double vitality, String desc) {
		/* Set Skills */
		this.setSkill1(skill1);
		this.setSkill2(skill2);
		this.setSkill3(skill3);
		/* Set Attributes */
		this.setAgility(agility);
		this.setDexterity(dexterity);
		this.setExperience(0);
		this.setIntelligence(intelligence);
		this.setLuck(luck);
		this.setStrength(strength);
		this.setVitality(vitality);
		this.setDesc(desc);
		this.setCap(10);
		this.setDefendingNow(false);
		this.setMoney(0);
		this.setBuyBackMoney(0);
		this.setLevel(1);
		this.setHealth(this.vitality);
	} // End EVC
	
	public Character(SkillsMain skill1, SkillsMain skill2, SkillsMain skill3, double agility, double dexterity, double intelligence, double luck, double strength, double vitality, String desc,double sellMoney,double backMoney) {
		/* Set Skills */
		this.setSkill1(skill1);
		this.setSkill2(skill2);
		this.setSkill3(skill3);
		/* Set Attributes */
		this.setAgility(agility);
		this.setDexterity(dexterity);
		this.setExperience(0);
		this.setIntelligence(intelligence);
		this.setLuck(luck);
		this.setStrength(strength);
		this.setVitality(vitality);
		this.setDesc(desc);
		this.setCap(10);
		this.setDefendingNow(false);
		this.setMoney(sellMoney);
		this.setBuyBackMoney(backMoney);
		this.setLevel(1);
		this.setHealth(this.vitality);
	} // End EVC
	
	public int fight() {
		/*int damage = random.nextInt(maxDmg - (minDmg + 1)) + minDmg;
		if(random.nextInt(100) < this.luck)
		{
			System.out.println("Critical Attack!");
			return (int) damage * 2;
		}*/
		return (int) this.strength;
	}
	
	public void specialAttack() {
		skill1.attack(this.getAgility(), this.getLuck());
	}
	
	public void specialAttack2() {
		skill2.attack(this.getAgility(), this.getLuck());
	}
	
	public void specialAttack3() {
		skill3.attack(this.getAgility(), this.getLuck());
	}
	
	public void defend() {
		if(random.nextInt(100) < this.dexterity)
			this.setDefendingNow(true);
	} // End defend  
	
	public void defend(double damage) {
		if(random.nextInt(100) < this.dexterity)
			this.setDefendingNow(true);
		this.health -=damage;
		if(this.health <0)
			this.health = 0;
	} // End defend
	
	//TODO: check cap multiplication
	public boolean levelUp() {
		if(this.experience >= this.cap)
		{
			this.setCap(this.cap * 2);
			this.setLevel(this.level++);
			addStats();
			return true;
		}
		return false;
	}
	
	private void addStats() {
		this.setAgility(this.agility + 5);
		this.setDexterity(this.dexterity + 5);
		this.setIntelligence(this.intelligence + 5);
		this.setStrength(this.strength + 5);
		this.setVitality(this.vitality + 5);
		this.setLuck(this.luck + 1);	
	}

	public boolean isAlive() {
		return this.health <= 0;
	}
	
	//Status Setters and Getters
	
	public void setSkill2(SkillsMain skill2) {
		this.skill2 = skill2;
	}
	
	public void setSkill1(SkillsMain skill1) {
		this.skill1 = skill1;
	}
	
	public void setSkill3(SkillsMain skill3) {
		this.skill3 = skill3;
	}
	public boolean setSkill1(String skill1) {
		try{
			for(int p = 0; p < this.getSkillNames().length; p++){
				
				if(this.getSkillNames()[p].getDesc().equalsIgnoreCase(skill1)){
					this.skill1 = this.getSkillNames()[p];
					return true;
				}
			}
		}catch(Exception e){
			System.out.println("Failed to pick that skill, please try again.");
			return false;
		}
		System.out.println("Failed to pick that skill, please try again.");
		return false;
	}
	
	public boolean setSkill2(String skill2) {
		try{
			for(int p = 0; p < this.getSkillNames().length; p++){
				
				if(this.getSkillNames()[p].getDesc().equalsIgnoreCase(skill2))
					this.skill1 = this.getSkillNames()[p];
					
			}
		}catch(Exception e){
			System.out.println("Failed to pick that skill, please try again.");
			return false;
		}
		return true;
	}
	
	public boolean setSkill3(String skill3) {
		try{
			for(int p = 0; p < this.getSkillNames().length; p++){
				
				if(this.getSkillNames()[p].getDesc().equalsIgnoreCase(skill3))
					this.skill1 = this.getSkillNames()[p];
					
			}
		}catch(Exception e){
			System.out.println("Failed to pick that skill, please try again.");
			return false;
		}
		return true;
	}
		
	public boolean isDefendingNow() {
		return isDefendingNow;
	}

	public void setDefendingNow(boolean isDefendingNow) {
		this.isDefendingNow = isDefendingNow;
	}

	public boolean isDefending() {
		return this.isDefendingNow;
	}
	
	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public double getAgility() {
		return agility;
	}

	public void setAgility(double agility) {
		this.agility = agility;
	}

	public double getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;
	}

	public double getVitality() {
		return vitality;
	}

	public void setVitality(double vitality) {
		this.vitality = vitality;
	}

	public double getDexterity() {
		return dexterity;
	}

	public void setDexterity(double dexterity) {
		this.dexterity = dexterity;
	}

	public double getLuck() {
		return luck;
	}

	public void setLuck(double luck) {
		this.luck = luck;
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		if(health < 0)
			this.health = 0;
		else
			this.health = health;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public long getCap() {
		return cap;
	}

	public void setCap(long cap) {
		this.cap = cap;
	}

	public boolean validate(double balance){
		return balance >= this.money ; 
	}
	
	public double getPaybackMoney(){
		return this.buyBackMoney;
	}
	
	public double getMoney(){
		return this.money;
	}
	
	public void setMoney(double money){
		this.money = money;
	}
	
	public void setBuyBackMoney(double buyBackMoney){
		this.buyBackMoney = buyBackMoney;
	}
	
	public abstract SkillsMain [] getSkillNames();

	public String toString() {
		return "Level " + this.getLevel() + " " + this.getDesc() + " with " + this.getHealth() + "hp" + " and " + this.maxDmg + "dmg/nExperience: " + this.getExperience() + "/" + this.getCap();
	}

	public boolean compareName(Character character){
		return this.getDesc().equals(character.getDesc());
	}
	
	public boolean compareName(String character){
		return this.getDesc().equals(character);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
} // End Character
