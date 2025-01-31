// Date: 2/20/2017 4:40:24 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FNP90Sight extends ModelBase
{
  //fields
    ModelRenderer Sight1;
    ModelRenderer Sight2;
    ModelRenderer Sight3;
    ModelRenderer Sight4;
    ModelRenderer Sight5;
    ModelRenderer Sight6;
    ModelRenderer Sight7;
    ModelRenderer Sight8;
    ModelRenderer Sight9;
    ModelRenderer Sight10;
    ModelRenderer Sight11;
  
  public FNP90Sight()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Sight1 = new ModelRenderer(this, 0, 0);
      Sight1.addBox(0F, 0F, 0F, 5, 1, 14);
      Sight1.setRotationPoint(0F, 0F, 0F);
      Sight1.setTextureSize(128, 32);
      Sight1.mirror = true;
      setRotation(Sight1, 0F, 0F, 0F);
      Sight2 = new ModelRenderer(this, 0, 0);
      Sight2.addBox(0F, 0F, 0F, 1, 2, 14);
      Sight2.setRotationPoint(0F, -2F, 0F);
      Sight2.setTextureSize(128, 32);
      Sight2.mirror = true;
      setRotation(Sight2, 0F, 0F, 0F);
      Sight3 = new ModelRenderer(this, 0, 0);
      Sight3.addBox(0F, 0F, 0F, 1, 2, 14);
      Sight3.setRotationPoint(4F, -2F, 0F);
      Sight3.setTextureSize(128, 32);
      Sight3.mirror = true;
      setRotation(Sight3, 0F, 0F, 0F);
      Sight4 = new ModelRenderer(this, 0, 0);
      Sight4.addBox(0F, 0F, 0F, 1, 3, 8);
      Sight4.setRotationPoint(4F, -4.5F, 3F);
      Sight4.setTextureSize(128, 32);
      Sight4.mirror = true;
      setRotation(Sight4, 0F, 0F, 0F);
      Sight5 = new ModelRenderer(this, 0, 0);
      Sight5.addBox(0F, 0F, 0F, 1, 3, 8);
      Sight5.setRotationPoint(0F, -4.5F, 3F);
      Sight5.setTextureSize(128, 32);
      Sight5.mirror = true;
      setRotation(Sight5, 0F, 0F, 0F);
      Sight6 = new ModelRenderer(this, 0, 0);
      Sight6.addBox(0F, 0F, 0F, 4, 1, 8);
      Sight6.setRotationPoint(0.5F, -5F, 3F);
      Sight6.setTextureSize(128, 32);
      Sight6.mirror = true;
      setRotation(Sight6, 0F, 0F, 0F);
      Sight7 = new ModelRenderer(this, 0, 0);
      Sight7.addBox(0F, 0F, 0F, 1, 3, 2);
      Sight7.setRotationPoint(0F, -4.5F, 3F);
      Sight7.setTextureSize(128, 32);
      Sight7.mirror = true;
      setRotation(Sight7, -0.4089647F, 0F, 0F);
      Sight8 = new ModelRenderer(this, 0, 0);
      Sight8.addBox(0F, 0F, 0F, 1, 3, 2);
      Sight8.setRotationPoint(4F, -4.5F, 3F);
      Sight8.setTextureSize(128, 32);
      Sight8.mirror = true;
      setRotation(Sight8, -0.4089647F, 0F, 0F);
      Sight9 = new ModelRenderer(this, 0, 0);
      Sight9.addBox(0F, 0F, 0F, 1, 2, 2);
      Sight9.setRotationPoint(4F, -3F, 11F);
      Sight9.setTextureSize(128, 32);
      Sight9.mirror = true;
      setRotation(Sight9, -0.669215F, 0F, 0F);
      Sight10 = new ModelRenderer(this, 0, 0);
      Sight10.addBox(0F, 0F, 0F, 1, 2, 2);
      Sight10.setRotationPoint(0F, -3F, 11F);
      Sight10.setTextureSize(128, 32);
      Sight10.mirror = true;
      setRotation(Sight10, -0.669215F, 0F, 0F);
      Sight11 = new ModelRenderer(this, 0, 0);
      Sight11.addBox(0F, 0F, 0F, 3, 2, 11);
      Sight11.setRotationPoint(1F, -1.8F, 2F);
      Sight11.setTextureSize(128, 32);
      Sight11.mirror = true;
      setRotation(Sight11, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Sight1.render(f5);
    Sight2.render(f5);
    Sight3.render(f5);
    Sight4.render(f5);
    Sight5.render(f5);
    Sight6.render(f5);
    Sight7.render(f5);
    Sight8.render(f5);
    Sight9.render(f5);
    Sight10.render(f5);
    Sight11.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
