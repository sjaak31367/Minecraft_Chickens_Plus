package CRM31367.Mod.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChicken_0 extends ModelBiped {
	ModelRenderer Body;
	ModelRenderer LegLeft;
	ModelRenderer LegRight;
	ModelRenderer HeadMain;
	ModelRenderer Chin;
	ModelRenderer MouthBot;
	ModelRenderer MouthTop;
	ModelRenderer WingLeft;
	ModelRenderer WingRight;

	public ModelChicken_0() {
		textureWidth = 64;
		textureHeight = 32;

		Body = new ModelRenderer(this, 0, 9);
		Body.addBox(-3F, 0F, 0F, 6, 6, 8);
		Body.setRotationPoint(0F, 13F, -4F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		LegLeft = new ModelRenderer(this, 26, 0);
		LegLeft.addBox(-1.466667F, 0F, -3F, 3, 5, 3);
		LegLeft.setRotationPoint(1.533333F, 19F, 1F);
		LegLeft.setTextureSize(64, 32);
		LegLeft.mirror = true;
		setRotation(LegLeft, 0F, 0F, 0F);
		LegRight.mirror = true;
		LegRight = new ModelRenderer(this, 26, 0);
		LegRight.addBox(-1.466667F, 0F, -3F, 3, 5, 3);
		LegRight.setRotationPoint(-1.5F, 19F, 1F);
		LegRight.setTextureSize(64, 32);
		LegRight.mirror = true;
		setRotation(LegRight, 0F, 0F, 0F);
		LegRight.mirror = false;
		HeadMain = new ModelRenderer(this, 0, 0);
		HeadMain.addBox(-2F, -5F, -3F, 4, 6, 3);
		HeadMain.setRotationPoint(0F, 14F, -3F);
		HeadMain.setTextureSize(64, 32);
		HeadMain.mirror = true;
		setRotation(HeadMain, 0F, 0F, 0F);
		Chin = new ModelRenderer(this, 14, 5);
		Chin.addBox(-1F, 0F, -1F, 2, 2, 1);
		Chin.setRotationPoint(0F, 13F, -6F);
		Chin.setTextureSize(64, 32);
		Chin.mirror = true;
		setRotation(Chin, 0F, 0F, 0F);
		MouthBot = new ModelRenderer(this, 14, 0);
		MouthBot.addBox(-2F, 0F, -2F, 4, 1, 2);
		MouthBot.setRotationPoint(0F, 12F, -6F);
		MouthBot.setTextureSize(64, 32);
		MouthBot.mirror = true;
		setRotation(MouthBot, 0F, 0F, 0F);
		MouthTop = new ModelRenderer(this, 14, 0);
		MouthTop.addBox(-2F, -1F, -2F, 4, 1, 2);
		MouthTop.setRotationPoint(0F, 12F, -6F);
		MouthTop.setTextureSize(64, 32);
		MouthTop.mirror = true;
		setRotation(MouthTop, 0F, 0F, 0F);
		WingLeft = new ModelRenderer(this, 28, 13);
		WingLeft.addBox(0F, 0F, -3F, 1, 4, 6);
		WingLeft.setRotationPoint(3F, 13F, 0F);
		WingLeft.setTextureSize(64, 32);
		WingLeft.mirror = true;
		setRotation(WingLeft, 0F, 0F, 0F);
		WingRight.mirror = true;
		WingRight = new ModelRenderer(this, 28, 13);
		WingRight.addBox(-1F, 0F, -3F, 1, 4, 6);
		WingRight.setRotationPoint(-3F, 13F, 0F);
		WingRight.setTextureSize(64, 32);
		WingRight.mirror = true;
		setRotation(WingRight, 0F, 0F, 0F);
		WingRight.mirror = false;
	}

	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Body.render(par7);
		LegLeft.render(par7);
		LegRight.render(par7);
		HeadMain.render(par7);
		Chin.render(par7);
		MouthBot.render(par7);
		MouthTop.render(par7);
		WingLeft.render(par7);
		WingRight.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	}

}
