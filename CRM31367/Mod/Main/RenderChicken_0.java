package CRM31367.Mod.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

@SideOnly(Side.CLIENT)
public class RenderChicken_0 extends RenderLiving {
	
	protected ModelChicken_0 model;
	
	public RenderChicken_0(ModelChicken_0 par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((ModelChicken_0)mainModel);
	}

	public void renderChicken_0(EntityChicken_0 par1EntityChicken_0, double par2, double par4,
			double par6, float par8, float par9) {
		super.doRenderLiving(par1EntityChicken_0, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2,
			double par4, double par6, float par8, float par9) {
		this.renderChicken_0((EntityChicken_0) par1EntityLiving, par2, par4, par6, par8,
				par9);
	}

	public void doRender(Entity par1Entity, double par2, double par4,
			double par6, float par8, float par9) {
		this.renderChicken_0((EntityChicken_0) par1Entity, par2, par4, par6, par8, par9);
	}
}
