package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.SPAS12;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class SPAS12Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("SPAS-12")
//		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(8)
		.withMaxBulletsPerReload(8)
		.withFireRate(0.2f)
		.withRecoil(9f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withPumpTimeout(1100)
		.withShootSound("Spas12")
		.withSilencedShootSound("ShotgunSilenced")
		.withReloadSound("ShotgunReload")
		.withReloadingTime(15)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")	
		.withCrosshairZoomed("Sight")
		.withInaccuracy(10)
		.withPellets(10)
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.1f)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.SteelIngot)
		.withCreativeTab(ModernWarfareMod.ShotgunsTab)
		.withInformationProvider(stack -> Arrays.asList("Type: Combat shotgun", "Damage per Pellet: 5", "Pellets per Shot: 10", 
		"Ammo: 12 Gauge Shotgun Shell", "Fire Rate: Semi"))
		.withCompatibleBullet(CommonProxy.ShotgunShell, (model) -> {})
		.withCompatibleAttachment(CommonProxy.Silencer12Gauge, (model) -> {
			GL11.glTranslatef(0.107F, -1.34F, -5.9F);
			GL11.glScaled(1.2F, 1.2F, 1.2F);
		})
		.withCompatibleAttachment(CommonProxy.Amber, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Amber.getTextureVariantIndex("Amber"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(CommonProxy.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Arctic.getTextureVariantIndex("Arctic"));
                }, 
                (a, i) -> {
                }
        )
		.withTextureNames("SPAS12", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new SPAS12())
			//.withTextureName("Remington900")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(1, 0.8f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.8F, 0.5F, 1.5F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glTranslatef(0.6F, -0.4F, -0.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
				GL11.glTranslatef(0.55F, -0.42F, -0.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				GL11.glRotatef(-5F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glTranslatef(-0.2F, -0.313F, -0.4F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-1F, 1f, 0f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);

				// Zoom
				GL11.glTranslatef(0.055F, -0.95f, 1.4f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.37F, -1.4f, 3.4f);
				} 
				// Holo Zoom
				/*if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.1f, 3f);
				} */
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
					
			.withFirstPersonPositioningReloading(
					
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.1F, -0.2F, -0.3F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 250, 50),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.1F, -0.2F, -0.3F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 250, 50)
			)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glTranslatef(-0.2F, -0.313F, -0.4F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);

				// Zoom
				GL11.glTranslatef(0.055F, -0.95f, 1.4f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.37F, -1.4f, 3.4f);
				} 
				// Holo Zoom
				/*if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.1f, 3f);
				} */
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScaled(0.8F, 0.8F, 0.8F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(0.5F, -0.35F, -1F);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1F);
			 })
			.withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, -0.2f, 0.15f);
						 GL11.glRotatef(95f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
						 GL11.glScalef(2.2f, 2.2f, 2.2f);
						 GL11.glTranslatef(1f, 0.2f, 0.2f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 20f, 20f, -20f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.5f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.5f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 250, 50)
					)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50)
					)
					
			.withFirstPersonHandPositioningZooming(
					 (renderContext) -> {
						 GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.9f, 0f, 0.15f);
						 GL11.glRotatef(115f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(-5f, 0f, 1f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					
			.build())
		.withSpawnEntityDamage(5f)
		.withSpawnEntityGravityVelocity(0.8f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}