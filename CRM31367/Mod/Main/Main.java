package CRM31367.Mod.Main;

import CRM31367.Mod.CreativeTab.Tab0;
import CRM31367.Mod.CreativeTab.Tab1;
import CRM31367.Mod.Items.Items;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "CRM31367s Mod", name = "CRM31367s Mod", version = "MCv1.5.2 , Modv 0.1.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Main {

	public static Item Small_Plank;
	public static Item Stone_Bow;
	// public static Block TestBlock;
	// public static Block Iron_Chest;
	public static Block Ore_Black_Gem;
//	public static Block Incubator;
	static int startEntityId = 300;

	@SidedProxy(clientSide = "CRM31367.Mod.Main.ClientProxy", serverSide = "CRM31367.Mod.Main.ServerProxy")
	public static ServerProxy proxy;

	@PreInit
	public void preLoad(FMLPreInitializationEvent preEvent) {
		proxy.init();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		addBlock();
		addItemAndTexture();
		addName();
		addRecipe();
		// addContainer();
		addEntity();
		CRM31367.Mod.CreativeTab.Tab0.CRMMatTab = new Tab1(
				CreativeTabs.getNextID(), "CRM31367s Materials Tab",
				CRM31367.Mod.Main.Main.Small_Plank.itemID);
		CRM31367.Mod.CreativeTab.Tab0.CRMCombatTab = new Tab1(
				CreativeTabs.getNextID(), "CRM31367s Combat Tab",
				CRM31367.Mod.Main.Main.Stone_Bow.itemID);
		// proxy.registerRenderThings();
		// Small_Plank = CRM31367.Mod.Items.Items.Small_Plank;
		// TestBlock = new
		// CRM31367.Mod.Blocks.Blocks$1(450).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("Test Block");
		//
		// GameRegistry.registerBlock(TestBlock, "Test Block");
		//
		// LanguageRegistry.addName(TestBlock, "Test Block");
	}

	@PostInit
	public void postLoad(FMLPostInitializationEvent postEvent) {

	}

	public void addBlock() {
		// Iron_Chest = new CRM31367.Mod.Blocks.Iron_Chest(3050,
		// "stone").setUnlocalizedName("stone_chest");
		Ore_Black_Gem = new CRM31367.Mod.Blocks.Ore_Black_Gem(3051)
				.setUnlocalizedName("ore_black_gem");
//		Incubator = new CRM31367.Mod.UnUsedCode.Incubator(3051)
//				.setUnlocalizedName("Incubator").setHardness(0.25F)
//				.setStepSound(Block.soundGravelFootstep).setLightValue(5).setCreativeTab(Tab0.CRMBlocksTab);
		// GameRegistry.registerBlock(Iron_Chest);
		GameRegistry.registerBlock(Ore_Black_Gem);
//		GameRegistry.registerBlock(Incubator);
	}

	public void addItemAndTexture() {
		Small_Plank = new CRM31367.Mod.Items.Items$1(3001, 64)
				.setUnlocalizedName("small_plank");
		Stone_Bow = new CRM31367.Mod.Items.StoneBow(3002, 1, 500)
				.setUnlocalizedName("stone_bow");
	}

	public void addName() {
		LanguageRegistry.addName(Small_Plank, "Small Plank");
		LanguageRegistry.addName(Stone_Bow, "Stone Bow");
		// LanguageRegistry.addName(Iron_Chest, "Iron Chest");
		LanguageRegistry.addName(Ore_Black_Gem, "Black Gem Ore");
//		LanguageRegistry.addName(Incubator, "Incubator");
	}

	public void addRecipe() {
		GameRegistry.addRecipe(new ItemStack(Main.Small_Plank), "www", "   ",
				"   ", 'w', Block.woodSingleSlab);
		GameRegistry.addRecipe(new ItemStack(Main.Stone_Bow), " cs", "c s",
				" cs", 's', Item.silk, 'c', Block.cobblestone);
		// GameRegistry.addRecipe(new ItemStack(Main.Iron_Chest),"iii", "ici",
		// "iii", 'i', Item.ingotIron, 'c', Block.chest);
	}

	public void addEntity(){
		EntityRegistry.registerModEntity(EntityChicken_0.class, "Chicken_0", 1, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityChicken_0.class, 10, 2, 4, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.plains);
		LanguageRegistry.instance().addStringLocalization("entity.CRM31367s Mod.Chicken_0.name", "Chicken_0");
		registerEntityEgg(EntityChicken_0.class, 0xF5DFDF, 0xFFA3A3);
	}
	
	public static int getUniqueEntityId(){
		do{
			startEntityId++;
		}
		while(EntityList.getStringFromID(startEntityId) != null);
		return startEntityId;
	}
	
	public static void registerEntityEgg(Class <? extends Entity> entity, int primaryColor, int secondaryColor){
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
	
	// public void addContainer(){
	// cpw.mods.fml.common.modloader.registerContainerID(this, 0);
	// }

}