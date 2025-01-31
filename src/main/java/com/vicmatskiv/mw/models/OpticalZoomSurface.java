//package com.vicmatskiv.mw.models;
//
//import com.vicmatskiv.weaponlib.FlatSurfaceModelBox;
//
//import net.minecraft.client.model.ModelBase;
//import net.minecraft.client.model.ModelRenderer;
//import net.minecraft.entity.Entity;
//
//public class OpticalZoomSurface extends ModelBase {
//
//	ModelRenderer surfaceRenderer;
//
//	@SuppressWarnings("unchecked")
//	public OpticalZoomSurface() {
//		textureWidth = 128;
//		textureHeight = 64;
//
//		surfaceRenderer = new ModelRenderer(this, 0, 0);
//		surfaceRenderer.cubeList.add(new FlatSurfaceModelBox(surfaceRenderer, 0, 0, 0f, 0f, 0f, 3, 3, 0, 0.0F));
//		surfaceRenderer.mirror = true;
//		surfaceRenderer.setRotationPoint(0F, -10F, 0F);
//		surfaceRenderer.setTextureSize(100, 100);
//		
//		setRotation(surfaceRenderer, 0F, 0F, 0F);
//	}
//
//	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		super.render(entity, f, f1, f2, f3, f4, f5);
//		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//		surfaceRenderer.render(f5);
//	}
//
//	private void setRotation(ModelRenderer model, float x, float y, float z) {
//		model.rotateAngleX = x;
//		model.rotateAngleY = y;
//		model.rotateAngleZ = z;
//	}
//
//}
