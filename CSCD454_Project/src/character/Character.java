package character;

import java.util.Random;

import character.PaladinSkills.Default;
import character.PaladinSkills.paladinSkills;

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
	private double dexterity;
	private long experience;
	
	private int maxDmg, minDmg;
	
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
	} // End DVC
	
	public Character(SkillsMain skill1, SkillsMain skill2, SkillsMain skill3, double agility, double dexterity, double intelligence, double luck, double strength, double vitality) {
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
	} // End EVC
	
	public int fight() {
		return random.nextInt(maxDmg - minDmg) + minDmg;
	}
	
	public void specialAttack() {
		skill1.attack();
	}
	
	public void specialAttack2() {
		skill2.attack();
	}
	
	public void specialAttack3() {
		skill3.attack();
	}

	public void setSkill2(SkillsMain skill2) {
		this.skill2 = skill2;
	}
	
	public void setSkill1(SkillsMain skill1) {
		this.skill1 = skill1;
	}
	
	public void setSkill3(SkillsMain skill3) {
		this.skill3 = skill3;
	}
	
	public abstract void defend();
	public abstract void retreat();
	public abstract void equip();
	public abstract void useItem();
	public abstract boolean isAlive();
	
	//Status Setters and Getters
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

} // End Character
