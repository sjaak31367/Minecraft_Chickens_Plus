package CRM31367.Mod.Main;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

//hij heeft net.minecraft.src.* ipv

public class EntityChicken_0 extends EntityMob {

	public EntityChicken_0(World par1World) {
		super(par1World);
		this.texture = "/mob/chicken_0.png";
		this.moveSpeed = 0.25F;
		// float f = 0.25F;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.35F));
		this.tasks.addTask(3, new EntityAIWatchClosest(this,
				EntityPlayer.class, 6.0F));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.tasks.addTask(2, new EntityAIWander(this, this.moveSpeed));
		this.setSize(0.5F, 0.9375F);
		// hij heeft 07F, 0.4F
		this.getNavigator().setAvoidsWater(true);
		// kan ook nog .setCanSwim(true)

	}

	protected boolean isAIEnabled() {
		return true;
	}

	public int getMaxHealth() {
		return 8;
	}

	// @Override error @ p3 02:08
	public int getAttackStrenght(Entity par1Entity) {
		return 0;
	}

	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	// public EntityAgeable createChild(EntityAgeable entityageable) {
	// return null;
	// }
	//
	protected String getLivingSound() {
		return "mob.chicken.say";
	}

	protected String getHurtSound() {
		return "mob.chicken.say";
	}

	protected String getDeathSound() {
		return "mob.chicken.hurt";
	}

	protected void playStepSound(int par1, int par2, int par3, int par4) {
		this.worldObj.playSoundAtEntity(this, "mob.chicken.step", 0.15F, 1.0F);
	}

	protected int getDropItemId() {
		return Item.gunpowder.itemID;
	}
	
	protected void dropRareDrop(int par1){
		switch(this.rand.nextInt(2)){
		case 0:
			this.dropItem(Item.melon.itemID, 1);
		case 1:
			this.dropItem(Item.bed.itemID, 2);
		}
	}
	
	protected void dropFewItems(boolean par1, int par2){
		if(this.rand.nextInt(4) == 0){
			this.dropItem(Item.coal.itemID, this.rand.nextInt(50) + 1);
		}
	}
	// return Item.swordDiamond.shiftedIndex;

}