package MainMenu;

import character.SkillsMain;
import character.AssassinSkills.*;
import character.PaladinSkills.*;
import character.PriestSkills.*;
import character.RogueSkills.*;
import character.SorcererSkills.*;

public class Constants {
	
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
}	
