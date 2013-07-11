package CRM31367.Mod.Main;

//import CRM31367.Mod.UnUsedCode.ItemIncubatorRenderer;
//import CRM31367.Mod.UnUsedCode.TileEntityIncubatorRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {

	public void registerRenderInformation(){
		RenderingRegistry.registerEntityRenderingHandler(EntityChicken_0.class, new RenderChicken_0(new ModelChicken_0(), 1.0F));
/*		ClientRegistry.bindTileEntitySpecialRenderer(CRM31367.Mod.UnUsedCode.tileEntityIncubator.class, new TileEntityIncubatorRenderer());
		MinecraftForgeClient.registerItemRenderer(CRM31367.Mod.Main.Main.Incubator.blockID, new ItemIncubatorRenderer()); */
	}
}