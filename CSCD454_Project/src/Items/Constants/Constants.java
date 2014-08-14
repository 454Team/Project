package Items.Constants;

import character.SkillsMain;
import character.AssassinSkills.DoubleAttack;
import character.AssassinSkills.SonicBlow;
import character.AssassinSkills.ThrowVenomKnife;
import character.PaladinSkills.Gospel;
import character.PaladinSkills.HolyCrossAttack;
import character.PaladinSkills.Sacrifice;
import character.PriestSkills.Compel;
import character.PriestSkills.EternalFlame;
import character.PriestSkills.HolyHit;
import character.RogueSkills.BackStab;
import character.RogueSkills.DeadlyInfect;
import character.RogueSkills.Intimidate;
import character.SorcererSkills.EarthSpike;
import character.SorcererSkills.MagicCrasher;
import character.SorcererSkills.SoulBurn;

public class Constants {
	
	public static final double initialBalance = 100000;
	
	public static final String [] heroNames =           {"Assassin","Paladin","Priest","Rogue","Sorcerer"};
	public static final String [] paladinSkillNames =   {"Gospel","HolyCrossAttack","Sacrifice"};
	public static final String [] assassinSkillNames  = {"DoubleAttack","SonicBlow","ThrowVenomKnife"};
	public static final String [] priestSkillNames =    {"Heal","Resurrection","Sanctuary"};
	public static final String [] rogueSkillNames =     {"BackStab","DeadlyInfect","Intimidate"};
	public static final String [] sorcererSkillNames =  {"EarthSpike","MagicCrasher","SoulBurn"};

	public static final SkillsMain [] paladinSkillSkills =   {new Gospel(),new HolyCrossAttack(),new Sacrifice()};
	public static final SkillsMain [] assassinSkillSkills =  {new DoubleAttack(),new SonicBlow(),new ThrowVenomKnife()};
	public static final SkillsMain [] priestSkillSkills =    {new HolyHit(),new Compel(),new EternalFlame()};
	public static final SkillsMain [] rogueSkillSkills =     {new BackStab(),new DeadlyInfect(),new Intimidate()};
	public static final SkillsMain [] sorcererSkillSkills =  {new EarthSpike(),new MagicCrasher(),new SoulBurn()};
	
	public static final String [] storeItemNames = {"Lighting Sword","Akaviri Sword","Blades Sword","Ceremonial Sword","Dragon Bane Sword"
		,"Dragon Bone Sword","Ebony Sword","Glass Sword","Iron Sword","Fire Sword","Imperial Sword","Ancient Nord War Axe","Ancient Nordic Pickaxe"
		,"Forsworn Axe","Ceremonial Axe","Daedric War Axe","Dawnguard Rune Axe","Dawnguard War Axe","Dragonbone War Axe","Dwarven War Axe"
		,"Ebony War Axe","Elven War Axe","[B] Chain Vest","[B] Cloth armor","[B] Frozen armor","[B] Guardian Angel armor","[B] fire armor"
		,"[B] lighting armor","[H] Chain Vest","[H] Cloth armor","[H] Frozen armor","[H] Guardian Angel armor","[H] fire armor"
		,"[H] lighting armor"};
	
	/*
	 * basic names
	 */
	public static final String BASIC_SWORD = "Basic sword";
	public static final String BASIC_AXES = "Basic axes";
	public static final String BASIC_HEAD_ARMOR = "Basic head armor";
	public static final String BASIC_BODY_ARMOR = "Basic body armor";
	/*
	 * sword names
	 */
	public static final String LIGHTING_SWORD = "Lighting Sword";
	public static final String AKAVIRI_SWORD = "Akaviri Sword";
	public static final String BLADES_SWORD = "Blades Sword";
	public static final String CEREMONIAL_SWORD = "Ceremonial Sword";
	public static final String DRAGONBANE_SWORD = "Dragon Bane Sword";
	public static final String DRAGONBONE_SWORD = "Dragon Bone Sword";
	public static final String EBONY_SWORD = "Ebony Sword";
	public static final String GLASS_SWORD = "Glass Sword";
	public static final String IRON_SWORD = "Iron Sword";
	public static final String FIRE_SWORD = "Fire Sword";
	public static final String IMPERIAL_SWORD = "Imperial Sword";
	/*
	 * Axes names
	 */
	public static final String ANCIENT_NORD_WAR_AXE = "Ancient Nord War Axe";
	public static final String ANCIENT_NORDIC_PICKAXE = "Ancient Nordic Pickaxe";
	public static final String FORSWORN_AXE = "Forsworn Axe";	
	public static final String CEREMONIAL_AXE = "Ceremonial Axe";
	public static final String DAEDRIC_WAR_AXE = "Daedric War Axe";
	public static final String DAWNGUARD_RUNE_AXE = "Dawnguard Rune Axe";
	public static final String DAWNGUARD_WAR_AXE = "Dawnguard War Axe";	
	public static final String DRAGONBONE_WAR_AXE = "Dragonbone War Axe";
	public static final String DWARVEN_WAR_AXE = "Dwarven War Axe";
	public static final String EBONY_WAR_AXE = "Ebony War Axe";
	public static final String ELVEN_WAR_AXE = "Elven War Axe";
	/*
	 * body armor names
	 */
	public static final String CHAIN_VEST_BODY_ARMOR = "[B] Chain Vest";
	public static final String CLOTH_BODY_ARMOR = "[B] Cloth armor";
	public static final String FROZEN_BODY_ARMOR = "[B] Frozen armor";	
	public static final String ANGEL_BODY_ARMOR = "[B] Guardian Angel armor";
	public static final String FIRE_BODY_ARMOR = "[B] fire armor";
	public static final String LIGHING_BODY_ARMOR = "[B] lighting armor";
	/*
	 * head armor names
	 */
	public static final String CHAIN_VEST_HEAD_ARMOR = "[H] Chain Vest";
	public static final String CLOTH_HEAD_ARMOR = "[H] Cloth armor";
	public static final String FROZEN_HEAD_ARMOR = "[H] Frozen armor";	
	public static final String ANGEL_HEAD_ARMOR = "[H] Guardian Angel armor";
	public static final String FIRE_HEAD_ARMOR = "[H] fire armor";
	public static final String LIGHING_HEAD_ARMOR = "[H] lighting armor";
	
	/*
	 * Character names
	 */
	public static final String CHARACTER_ASSASSIN = "Assassin";
	public static final String CHARACTER_ROGUE = "Rogue";
	public static final String CHARACTER_PRITEST = "Priest";
	public static final String CHARACTER_PALADIN = "Paladin";
	public static final String CHARACTER_SORCERER = "Sorcerer";
	public static final String CHARACTER_DEFAULT = "random";
		
	public static final int HERO_TEAM_NUMBER = 3;
	public static final int MONSTER_TEAM_NUMBER = 3;
	public static final int MONSTER_RANDOM = 100;
	
	public static final String CHARACTER_RANDOM = "random";
}	
