package Items.itemFactory;

import character.Character;
import Items.Constants.Constants;
import Items.MoneyBalance.Balance;
import Items.MoneyBalance.BalanceAccess;
import Items.WeaponArmor.Item;
import Items.WeaponArmor.axes.AncientNordWarAxe;
import Items.WeaponArmor.axes.AncientNordicPickaxe;
import Items.WeaponArmor.axes.BasicAxes;
import Items.WeaponArmor.axes.CeremonialAxe;
import Items.WeaponArmor.axes.DaedricWarAxe;
import Items.WeaponArmor.axes.DawnguardRuneAxe;
import Items.WeaponArmor.axes.DawnguardWarAxe;
import Items.WeaponArmor.axes.DragonBoneWarAxe;
import Items.WeaponArmor.axes.DwarvenWarAxe;
import Items.WeaponArmor.axes.EbonyWarAxe;
import Items.WeaponArmor.axes.ElvenWarAxe;
import Items.WeaponArmor.axes.ForswornAxe;
import Items.WeaponArmor.bodyArmor.AngelBodyArmor;
import Items.WeaponArmor.bodyArmor.BasicBodyArmor;
import Items.WeaponArmor.bodyArmor.ChainVestBodyArmor;
import Items.WeaponArmor.bodyArmor.ClothBodyArmor;
import Items.WeaponArmor.bodyArmor.FireBodyArmor;
import Items.WeaponArmor.bodyArmor.FrozenBodyArmor;
import Items.WeaponArmor.bodyArmor.LightingBodyArmor;
import Items.WeaponArmor.headArmor.AngelHeadArmor;
import Items.WeaponArmor.headArmor.BasicHeadArmor;
import Items.WeaponArmor.headArmor.ChainVestHeadArmor;
import Items.WeaponArmor.headArmor.ClothHeadArmor;
import Items.WeaponArmor.headArmor.FireHeadArmor;
import Items.WeaponArmor.headArmor.FrozenHeadArmor;
import Items.WeaponArmor.headArmor.LightingHeadArmor;
import Items.WeaponArmor.sword.AkaviriSword;
import Items.WeaponArmor.sword.BasicSword;
import Items.WeaponArmor.sword.BladesSword;
import Items.WeaponArmor.sword.CeremonialSword;
import Items.WeaponArmor.sword.DragonBaneSword;
import Items.WeaponArmor.sword.DragonBoneSword;
import Items.WeaponArmor.sword.EbonySword;
import Items.WeaponArmor.sword.FireSword;
import Items.WeaponArmor.sword.GlassSword;
import Items.WeaponArmor.sword.ImperialSword;
import Items.WeaponArmor.sword.IronSword;
import Items.WeaponArmor.sword.LightingSword;

public class ItemFactory implements BalanceAccess{
	
	private static ItemFactory itemFactory= null;
	
	private ItemFactory(){
		
	}
	
	public static ItemFactory create(){
		if(itemFactory == null){
			itemFactory = new ItemFactory();
		}
		
		return itemFactory;
	}
	
	public Item buyItem(String typeName){
		
		Item item = null;
		/*    Create swords     */
		if(typeName.equals(Constants.LIGHTING_SWORD)){
			item = new LightingSword();
		}else if(typeName.equals(Constants.AKAVIRI_SWORD)){
			item = new AkaviriSword();
		}else if(typeName.equals(Constants.BLADES_SWORD)){
			item = new BladesSword();
		}else if(typeName.equals(Constants.CEREMONIAL_SWORD)){
			item = new CeremonialSword();
		}else if(typeName.equals(Constants.DRAGONBANE_SWORD)){
			item = new DragonBaneSword();
		}else if(typeName.equals(Constants.DRAGONBONE_SWORD)){
			item = new DragonBoneSword();
		}else if(typeName.equals(Constants.EBONY_SWORD)){
			item = new EbonySword();
		}else if(typeName.equals(Constants.FIRE_SWORD)){
			item = new FireSword();
		}else if(typeName.equals(Constants.GLASS_SWORD)){
			item = new GlassSword();
		}else if(typeName.equals(Constants.IMPERIAL_SWORD)){
			item = new ImperialSword();
		}else if(typeName.equals(Constants.IRON_SWORD)){
			item = new IronSword();
		}
		/*    Create axes     */
		else if(typeName.equals(Constants.ANCIENT_NORD_WAR_AXE)){
			item = new AncientNordWarAxe();
		}else if(typeName.equals(Constants.ANCIENT_NORDIC_PICKAXE)){
			item = new AncientNordicPickaxe();
		}else if(typeName.equals(Constants.FORSWORN_AXE)){
			item = new ForswornAxe();
		}else if(typeName.equals(Constants.CEREMONIAL_AXE)){
			item = new CeremonialAxe();
		}else if(typeName.equals(Constants.DAEDRIC_WAR_AXE)){
			item = new DaedricWarAxe();
		}else if(typeName.equals(Constants.DAWNGUARD_RUNE_AXE)){
			item = new DawnguardRuneAxe();
		}else if(typeName.equals(Constants.DAWNGUARD_WAR_AXE)){
			item = new DawnguardWarAxe();
		}else if(typeName.equals(Constants.DRAGONBONE_WAR_AXE)){
			item = new DragonBoneWarAxe();
		}else if(typeName.equals(Constants.DWARVEN_WAR_AXE)){
			item = new DwarvenWarAxe();
		}else if(typeName.equals(Constants.EBONY_WAR_AXE)){
			item = new EbonyWarAxe();
		}else if(typeName.equals(Constants.ELVEN_WAR_AXE)){
			item = new ElvenWarAxe();
		}
		/*    Create basic     */
		else if(typeName.equals(Constants.BASIC_SWORD)){
			item = new BasicSword();
		}else if(typeName.equals(Constants.BASIC_AXES)){
			item = new BasicAxes();
		}else if(typeName.equals(Constants.BASIC_HEAD_ARMOR)){
			item = new BasicHeadArmor();
		}else if(typeName.equals(Constants.BASIC_BODY_ARMOR)){
			item = new BasicBodyArmor();
		}
		
		/*
		 * body armor
		 */
	
		else if(typeName.equals(Constants.CHAIN_VEST_BODY_ARMOR)){
			item = new ChainVestBodyArmor();
		}else if(typeName.equals(Constants.CLOTH_BODY_ARMOR)){
			item = new ClothBodyArmor();
		}else if(typeName.equals(Constants.FROZEN_BODY_ARMOR)){
			item = new FrozenBodyArmor();
		}else if(typeName.equals(Constants.ANGEL_BODY_ARMOR)){
			item = new AngelBodyArmor();
		}else if(typeName.equals(Constants.FIRE_BODY_ARMOR)){
			item = new FireBodyArmor();
		}else if(typeName.equals(Constants.LIGHING_BODY_ARMOR)){
			item = new LightingBodyArmor();
		}
		

		/*
		 * head armor names
		 */
		/*public static final String CHAIN_VEST_HEAD_ARMOR = " [H] Chain Vest";
		public static final String CLOTH_HEAD_ARMOR = " [H] Cloth armor";
		public static final String FROZEN_HEAD_ARMOR = " [H] Frozen armor";	
		public static final String ANGEL_HEAD_ARMOR = " [H] Guardian Angel armor";
		public static final String FIRE_HEAD_ARMOR = " [H] fire armor";
		public static final String LIGHING_HEAD_ARMOR = " [H] lighting armor";
		*/
		
		else if(typeName.equals(Constants.CHAIN_VEST_HEAD_ARMOR)){
			item = new ChainVestHeadArmor();
		}else if(typeName.equals(Constants.CLOTH_HEAD_ARMOR)){
			item = new ClothHeadArmor();
		}else if(typeName.equals(Constants.FROZEN_HEAD_ARMOR)){
			item = new FrozenHeadArmor();
		}else if(typeName.equals(Constants.ANGEL_HEAD_ARMOR)){
			item = new AngelHeadArmor();
		}else if(typeName.equals(Constants.FIRE_HEAD_ARMOR)){
			item = new FireHeadArmor();
		}else if(typeName.equals(Constants.LIGHING_HEAD_ARMOR)){
			item = new LightingHeadArmor();
	
		}
		item = Itemvalidate(item);
		return item;
	}
	
	private Item Itemvalidate(Item item){
		if(!paidTransaction(Accesscreate(),item) )
			return null;
		return item;
	}

	@Override
	public double access(Balance balance) {
		return balance.getBalance();
	}
	
	@Override
	public Balance Accesscreate() {
		return Balance.create();
	}

	@Override
	public boolean paidTransaction(Balance balance,Item item) {
		return balance.CompleteTransaction(item);
	}

	@Override
	public boolean paidTransaction(Balance balance, Character character) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
