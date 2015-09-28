package fr.ironcraft.drone.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import fr.ironcraft.drone.entity.EntityDrone;

public class ModelDrone extends ModelBase
{
	ModelRenderer body;
	ModelRenderer[]	arms;
	ModelRenderer[]	motors;
	ModelRenderer[]	elices;
	ModelRenderer[][] pales;

	public ModelDrone()
	{
		this(0.0f);
	}

	public ModelDrone(float par1)
	{
		body = new ModelRenderer(this, 10, 10);
		body.setTextureSize(64, 32);
		body.addBox(-3F, -1F, -3F, 6, 2, 6);
		body.setRotationPoint(0F, 23F, 0F);
		arms = new ModelRenderer[4];
		motors = new ModelRenderer[4];
		elices = new ModelRenderer[4];
		pales = new ModelRenderer[4][2];
		
		arms[0] = new ModelRenderer(this, 15, 15);
		arms[0].setTextureSize(64, 32);
		arms[0].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		arms[0].setRotationPoint(-4F, 23F, -4F);
		arms[1] = new ModelRenderer(this, 15, 15);
		arms[1].setTextureSize(64, 32);
		arms[1].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		arms[1].setRotationPoint(4F, 23F, -4F);
		arms[2] = new ModelRenderer(this, 15, 15);
		arms[2].setTextureSize(64, 32);
		arms[2].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		arms[2].setRotationPoint(4F, 23F, 4F);
		arms[3] = new ModelRenderer(this, 15, 15);
		arms[3].setTextureSize(64, 32);
		arms[3].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		arms[3].setRotationPoint(-4F, 23F, 4F);
		
		motors[0] = new ModelRenderer(this, 15, 15);
		motors[0].setTextureSize(64, 32);
		motors[0].addBox(-0.5F, -0.5F, -0.5F, 1, 2, 1);
		motors[0].setRotationPoint(-6.474874F, 22F, -6.474874F);
		motors[1] = new ModelRenderer(this, 15, 15);
		motors[1].setTextureSize(64, 32);
		motors[1].addBox(-0.5F, -0.5F, -0.5F, 1, 2, 1);
		motors[1].setRotationPoint(6.474874F, 22F, -6.474874F);
		motors[2] = new ModelRenderer(this, 15, 15);
		motors[2].setTextureSize(64, 32);
		motors[2].addBox(-0.5F, -0.5F, -0.5F, 1, 2, 1);
		motors[2].setRotationPoint(6.474874F, 22F, 6.474874F);
		motors[3] = new ModelRenderer(this, 15, 15);
		motors[3].setTextureSize(64, 32);
		motors[3].addBox(-0.5F, -0.5F, -0.5F, 1, 2, 1);
		motors[3].setRotationPoint(-6.474874F, 22F, 6.474874F);
		
		elices[0] = new ModelRenderer(this, 15, 15);
		elices[0].setTextureSize(64, 32);
		elices[0].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		elices[0].setRotationPoint(-6.474874F, 21.5F, -6.474874F);
		elices[1] = new ModelRenderer(this, 15, 15);
		elices[1].setTextureSize(64, 32);
		elices[1].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		elices[1].setRotationPoint(6.474874F, 21.5F, -6.474874F);
		elices[2] = new ModelRenderer(this, 15, 15);
		elices[2].setTextureSize(64, 32);
		elices[2].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		elices[2].setRotationPoint(6.474874F, 21.5F, 6.474874F);
		elices[3] = new ModelRenderer(this, 15, 15);
		elices[3].setTextureSize(64, 32);
		elices[3].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		elices[3].setRotationPoint(-6.474874F, 21.5F, 6.474874F);
		
		pales[0][0] = new ModelRenderer(this, 15, 15);
		pales[0][0].setTextureSize(64, 32);
		pales[0][0].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pales[0][0].setRotationPoint(-7.535533F, 21.5F, -7.535534F);
		pales[0][1] = new ModelRenderer(this, 15, 15);
		pales[0][1].setTextureSize(64, 32);
		pales[0][1].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pales[0][1].setRotationPoint(-5.414214F, 21.5F, -5.414214F);
		pales[1][0] = new ModelRenderer(this, 15, 15);
		pales[1][0].setTextureSize(64, 32);
		pales[1][0].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pales[1][0].setRotationPoint(5.414214F, 21.5F, -5.414214F);
		pales[1][1] = new ModelRenderer(this, 15, 15);
		pales[1][1].setTextureSize(64, 32);
		pales[1][1].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pales[1][1].setRotationPoint(7.535533F, 21.5F, -7.535534F);
		pales[2][0] = new ModelRenderer(this, 15, 15);
		pales[2][0].setTextureSize(64, 32);
		pales[2][0].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pales[2][0].setRotationPoint(5.414214F, 21.5F, 5.414214F);
		pales[2][1] = new ModelRenderer(this, 15, 15);
		pales[2][1].setTextureSize(64, 32);
		pales[2][1].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pales[2][1].setRotationPoint(7.535533F, 21.5F, 7.535534F);
		pales[3][0] = new ModelRenderer(this, 15, 15);
		pales[3][0].setTextureSize(64, 32);
		pales[3][0].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pales[3][0].setRotationPoint(-7.535533F, 21.5F, 7.535534F);
		pales[3][1] = new ModelRenderer(this, 15, 15);
		pales[3][1].setTextureSize(64, 32);
		pales[3][1].addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pales[3][1].setRotationPoint(-5.414214F, 21.5F, 5.414214F);
		
		body.rotateAngleX = 0F;
		body.rotateAngleY = 0F;
		body.rotateAngleZ = 0F;
		arms[0].rotateAngleX = 0F;
		arms[0].rotateAngleY = -0.7853982F;
		arms[0].rotateAngleZ = 0F;
		motors[0].rotateAngleX = 0F;
		motors[0].rotateAngleY = -0.7853982F;
		motors[0].rotateAngleZ = 0F;
		elices[0].rotateAngleX = 0F;
		elices[0].rotateAngleY = -0.7853982F;
		elices[0].rotateAngleZ = 0F;
		
		arms[1].rotateAngleX = 0F;
		arms[1].rotateAngleY = 0.7853982F;
		arms[1].rotateAngleZ = 0F;
		motors[1].rotateAngleX = 0F;
		motors[1].rotateAngleY = 0.7853982F;
		motors[1].rotateAngleZ = 0F;
		elices[1].rotateAngleX = 0F;
		elices[1].rotateAngleY = 0.7853982F;
		elices[1].rotateAngleZ = 0F;
		
		arms[2].rotateAngleX = 0F;
		arms[2].rotateAngleY = -0.7853982F;
		arms[2].rotateAngleZ = 0F;
		motors[2].rotateAngleX = 0F;
		motors[2].rotateAngleY = -0.7853982F;
		motors[2].rotateAngleZ = 0F;
		elices[2].rotateAngleX = 0F;
		elices[2].rotateAngleY = -0.7853982F;
		elices[2].rotateAngleZ = 0F;
		
		arms[3].rotateAngleX = 0F;
		arms[3].rotateAngleY = 0.7853982F;
		arms[3].rotateAngleZ = 0F;
		motors[3].rotateAngleX = 0F;
		motors[3].rotateAngleY = 0.7853982F;
		motors[3].rotateAngleZ = 0F;
		elices[3].rotateAngleX = 0F;
		elices[3].rotateAngleY = 0.7853982F;
		elices[3].rotateAngleZ = 0F;
        
		pales[0][0].rotateAngleX = 0.5235987F;
		pales[0][0].rotateAngleY = -0.7853982F;
		pales[0][0].rotateAngleZ = 4.341565E-09F;
		pales[0][1].rotateAngleX = -0.5235987F;
		pales[0][1].rotateAngleY = -0.7853982F;
		pales[0][1].rotateAngleZ = -4.341565E-09F;
		pales[1][0].rotateAngleX = 0.5235987F;
		pales[1][0].rotateAngleY = 0.7853982F;
		pales[1][0].rotateAngleZ = -4.341565E-09F;
		pales[1][1].rotateAngleX = -0.5235987F;
		pales[1][1].rotateAngleY = 0.7853982F;
		pales[1][1].rotateAngleZ = 4.341565E-09F;
		pales[2][0].rotateAngleX = 0.5235987F;
		pales[2][0].rotateAngleY = -0.7853982F;
		pales[2][0].rotateAngleZ = 4.341565E-09F;
		pales[2][1].rotateAngleX = -0.5235987F;
		pales[2][1].rotateAngleY = -0.7853982F;
		pales[2][1].rotateAngleZ = -4.341565E-09F;
		pales[3][0].rotateAngleX = 0.5235987F;
        pales[3][0].rotateAngleY = 0.7853982F;
        pales[3][0].rotateAngleZ = -4.341565E-09F;
		pales[3][1].rotateAngleX = -0.5235987F;
		pales[3][1].rotateAngleY = 0.7853982F;
		pales[3][1].rotateAngleZ = 4.341565E-09F;
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		
		GL11.glPushMatrix();
		GlStateManager.translate(body.rotationPointX * f5, body.rotationPointY * f5, body.rotationPointZ * f5);
		GL11.glScalef(0.6f, 0.6f, 0.6f);
        GlStateManager.translate(-body.rotationPointX * f5, -body.rotationPointY * f5, -body.rotationPointZ * f5);
		
		GL11.glColor3f(0, 0, 0);
		body.renderWithRotation(f5);
		
		for (int i = 0; i < 4; ++i)
		{
			GL11.glColor3f(1, 0, 1);
			GL11.glPushMatrix();
			GlStateManager.translate(arms[i].rotationPointX * f5, arms[i].rotationPointY * f5, arms[i].rotationPointZ * f5);
	        GL11.glScaled(1, 0.2f, 1);
	        GlStateManager.translate(-arms[i].rotationPointX * f5, -(arms[i].rotationPointY * f5), -arms[i].rotationPointZ * f5);
			arms[i].renderWithRotation(f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
	        GlStateManager.translate(motors[i].rotationPointX * f5, motors[i].rotationPointY * f5, motors[i].rotationPointZ * f5);
	        GL11.glScaled(0.2f, 1f, 0.2f);
	        GlStateManager.translate(-motors[i].rotationPointX * f5, -motors[i].rotationPointY * f5, -motors[i].rotationPointZ * f5);
	        GL11.glColor3f(0, 0, 0);
	        motors[i].renderWithRotation(f5);
	        GL11.glPopMatrix();
			GL11.glPushMatrix();
	        GlStateManager.translate(elices[i].rotationPointX * f5, elices[i].rotationPointY * f5, elices[i].rotationPointZ * f5);
	        GL11.glScaled(0.5f, 0.5f, 0.5f);
	        GlStateManager.translate(-elices[i].rotationPointX * f5, -elices[i].rotationPointY * f5, -elices[i].rotationPointZ * f5);
	        GL11.glColor3f(1, 0, 1);
	        elices[i].renderWithRotation(f5);
			GL11.glPopMatrix();
			for (int j = 0; j < 2; ++j)
			{
				float rx, ry, rz;
				rx = pales[i][j].rotateAngleX;
				ry = pales[i][j].rotateAngleY;
				rz = pales[i][j].rotateAngleZ;
				GL11.glPushMatrix();
				GlStateManager.translate(elices[i].rotationPointX * f5, elices[i].rotationPointY * f5, elices[i].rotationPointZ * f5);
	        	GL11.glRotatef(((EntityDrone)entity).getAngleMotor() * (180F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
	        	GlStateManager.translate(-elices[i].rotationPointX * f5, -elices[i].rotationPointY * f5, -elices[i].rotationPointZ * f5);
	        	GlStateManager.translate(pales[i][j].rotationPointX * f5, pales[i][j].rotationPointY * f5, pales[i][j].rotationPointZ * f5);
	        	if (pales[i][j].rotateAngleY != 0.0F)
	        		GlStateManager.rotate(pales[i][j].rotateAngleY * (180F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
	        	if (pales[i][j].rotateAngleX != 0.0F)
	        		GlStateManager.rotate(pales[i][j].rotateAngleX * (180F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
	        	if (pales[i][j].rotateAngleZ != 0.0F)
	        		GlStateManager.rotate(pales[i][j].rotateAngleZ * (180F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
	        	GL11.glScaled(0.3f, 0.1f, 0.6f);
	        	GlStateManager.translate(-pales[i][j].rotationPointX * f5, -pales[i][j].rotationPointY * f5, -pales[i][j].rotationPointZ * f5);
	        	pales[i][j].rotateAngleX = 0.0F;
				pales[i][j].rotateAngleY = 0.0F;
				pales[i][j].rotateAngleZ = 0.0F;
				GL11.glColor3f(1, 1, 1);
	        	pales[i][j].renderWithRotation(f5);
	        	pales[i][j].rotateAngleX = rx;
				pales[i][j].rotateAngleY = ry;
				pales[i][j].rotateAngleZ = rz;
	        	GL11.glPopMatrix();
			}
		}
		GL11.glPopMatrix();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		// topfin.rotateAngleZ = MathHelper.sin((f2/(180f/(float)Math.PI)*5))*0.1f;
		
		for (int i = 0; i < 4; ++i)
			elices[i].rotateAngleY = ((EntityDrone)entity).getAngleMotor();
		
		//test
		((EntityDrone)entity).speed = 2f * ((1.0f + (float)Math.sin(f2 * Math.PI / 180f)) / 2.0f);
//		((EntityDrone)entity).speed = 1f;
	}

}