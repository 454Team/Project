package Items.itemFactory;

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
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.AKAVIRI_SWORD)){
			item = new AkaviriSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.BLADES_SWORD)){
			item = new BladesSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.CEREMONIAL_SWORD)){
			item = new CeremonialSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.DRAGONBANE_SWORD)){
			item = new DragonBaneSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.DRAGONBONE_SWORD)){
			item = new DragonBoneSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.EBONY_SWORD)){
			item = new EbonySword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.FIRE_SWORD)){
			item = new FireSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.GLASS_SWORD)){
			item = new GlassSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.IMPERIAL_SWORD)){
			item = new ImperialSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.IRON_SWORD)){
			item = new IronSword();
			item = Itemvalidate(item);
		}
		/*    Create axes     */
		else if(typeName.equals(Constants.ANCIENT_NORD_WAR_AXE)){
			item = new AncientNordWarAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.ANCIENT_NORDIC_PICKAXE)){
			item = new AncientNordicPickaxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.FORSWORN_AXE)){
			item = new ForswornAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.CEREMONIAL_AXE)){
			item = new CeremonialAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.DAEDRIC_WAR_AXE)){
			item = new DaedricWarAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.DAWNGUARD_RUNE_AXE)){
			item = new DawnguardRuneAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.DAWNGUARD_WAR_AXE)){
			item = new DawnguardWarAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.DRAGONBONE_WAR_AXE)){
			item = new DragonBoneWarAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.DWARVEN_WAR_AXE)){
			item = new DwarvenWarAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.EBONY_WAR_AXE)){
			item = new EbonyWarAxe();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.ELVEN_WAR_AXE)){
			item = new ElvenWarAxe();
			item = Itemvalidate(item);
		}
		/*    Create basic     */
		else if(typeName.equals(Constants.BASIC_SWORD)){
			item = new BasicSword();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.BASIC_AXES)){
			item = new BasicAxes();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.BASIC_HEAD_ARMOR)){
			item = new BasicHeadArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.BASIC_BODY_ARMOR)){
			item = new BasicBodyArmor();
			item = Itemvalidate(item);
		}
		
		/*
		 * body armor
		 */
	
		else if(typeName.equals(Constants.CHAIN_VEST_BODY_ARMOR)){
			item = new ChainVestBodyArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.CLOTH_BODY_ARMOR)){
			item = new ClothBodyArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.FROZEN_BODY_ARMOR)){
			item = new FrozenBodyArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.ANGEL_BODY_ARMOR)){
			item = new AngelBodyArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.FIRE_BODY_ARMOR)){
			item = new FireBodyArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.LIGHING_BODY_ARMOR)){
			item = new LightingBodyArmor();
			item = Itemvalidate(item);
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
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.CLOTH_HEAD_ARMOR)){
			item = new ClothHeadArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.FROZEN_HEAD_ARMOR)){
			item = new FrozenHeadArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.ANGEL_HEAD_ARMOR)){
			item = new AngelHeadArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.FIRE_HEAD_ARMOR)){
			item = new FireHeadArmor();
			item = Itemvalidate(item);
		}else if(typeName.equals(Constants.LIGHING_HEAD_ARMOR)){
			item = new LightingHeadArmor();
			item = Itemvalidate(item);
		}
		
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
	
}
