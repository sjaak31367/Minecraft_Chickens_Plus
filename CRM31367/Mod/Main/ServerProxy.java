package CRM31367.Mod.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ServerProxy{
	public static ClientProxy client;
	
	public void registerRenderThings(){}
	
	public void init(){
//		EntityRegistry.registerGlobalEntityID(EntityChicken_0.class, "Chicken_0", EntityRegistry.findGlobalUniqueEntityId(), 3515848, 12102);
		RenderingRegistry.registerEntityRenderingHandler(EntityChicken_0.class, new RenderChicken_0(new ModelChicken_0(), 1.0F));
	}
}