package fr.ironcraft.drone.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDrone extends ModelBase
{
	ModelRenderer	body;
	ModelRenderer	arm0;
	ModelRenderer	motor0;
	ModelRenderer	elice0;
	ModelRenderer	pale0;
	ModelRenderer	pale0_1;
	ModelRenderer	arm1;
	ModelRenderer	motor1;
	ModelRenderer	elice1;
	ModelRenderer	pale01;
	ModelRenderer	pale0_11;
	ModelRenderer	arm2;
	ModelRenderer	motor2;
	ModelRenderer	elice2;
	ModelRenderer	pale02;
	ModelRenderer	pale0_12;
	ModelRenderer	arm3;
	ModelRenderer	motor3;
	ModelRenderer	elice3;
	ModelRenderer	pale03;
	ModelRenderer	pale0_13;

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
		arm0 = new ModelRenderer(this, 15, 15);
		arm0.setTextureSize(64, 32);
		arm0.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		arm0.setRotationPoint(-4F, 23F, -4F);
		motor0 = new ModelRenderer(this, 15, 15);
		motor0.setTextureSize(64, 32);
		motor0.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		motor0.setRotationPoint(-6.474874F, 22F, -6.474874F);
		elice0 = new ModelRenderer(this, 15, 15);
		elice0.setTextureSize(64, 32);
		elice0.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		elice0.setRotationPoint(-6.474874F, 21.5F, -6.474874F);
		pale0 = new ModelRenderer(this, 15, 15);
		pale0.setTextureSize(64, 32);
		pale0.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pale0.setRotationPoint(-7.535533F, 21.5F, -7.535534F);
		pale0_1 = new ModelRenderer(this, 15, 15);
		pale0_1.setTextureSize(64, 32);
		pale0_1.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pale0_1.setRotationPoint(-5.414214F, 21.5F, -5.414214F);
		arm1 = new ModelRenderer(this, 15, 15);
		arm1.setTextureSize(64, 32);
		arm1.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		arm1.setRotationPoint(4F, 23F, -4F);
		motor1 = new ModelRenderer(this, 15, 15);
		motor1.setTextureSize(64, 32);
		motor1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		motor1.setRotationPoint(6.474874F, 22F, -6.474874F);
		elice1 = new ModelRenderer(this, 15, 15);
		elice1.setTextureSize(64, 32);
		elice1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		elice1.setRotationPoint(6.474874F, 21.5F, -6.474874F);
		pale01 = new ModelRenderer(this, 15, 15);
		pale01.setTextureSize(64, 32);
		pale01.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pale01.setRotationPoint(5.414214F, 21.5F, -5.414214F);
		pale0_11 = new ModelRenderer(this, 15, 15);
		pale0_11.setTextureSize(64, 32);
		pale0_11.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pale0_11.setRotationPoint(7.535533F, 21.5F, -7.535534F);
		arm2 = new ModelRenderer(this, 15, 15);
		arm2.setTextureSize(64, 32);
		arm2.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		arm2.setRotationPoint(4F, 23F, 4F);
		motor2 = new ModelRenderer(this, 15, 15);
		motor2.setTextureSize(64, 32);
		motor2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		motor2.setRotationPoint(6.474874F, 22F, 6.474874F);
		elice2 = new ModelRenderer(this, 15, 15);
		elice2.setTextureSize(64, 32);
		elice2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		elice2.setRotationPoint(6.474874F, 21.5F, 6.474874F);
		pale02 = new ModelRenderer(this, 15, 15);
		pale02.setTextureSize(64, 32);
		pale02.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pale02.setRotationPoint(5.414214F, 21.5F, 5.414214F);
		pale0_12 = new ModelRenderer(this, 15, 15);
		pale0_12.setTextureSize(64, 32);
		pale0_12.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pale0_12.setRotationPoint(7.535533F, 21.5F, 7.535534F);
		arm3 = new ModelRenderer(this, 15, 15);
		arm3.setTextureSize(64, 32);
		arm3.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		arm3.setRotationPoint(-4F, 23F, 4F);
		motor3 = new ModelRenderer(this, 15, 15);
		motor3.setTextureSize(64, 32);
		motor3.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		motor3.setRotationPoint(-6.474874F, 22F, 6.474874F);
		elice3 = new ModelRenderer(this, 15, 15);
		elice3.setTextureSize(64, 32);
		elice3.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		elice3.setRotationPoint(-6.474874F, 21.5F, 6.474874F);
		pale03 = new ModelRenderer(this, 15, 15);
		pale03.setTextureSize(64, 32);
		pale03.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pale03.setRotationPoint(-7.535533F, 21.5F, 7.535534F);
		pale0_13 = new ModelRenderer(this, 15, 15);
		pale0_13.setTextureSize(64, 32);
		pale0_13.addBox(-4F, -0.5F, -0.5F, 8, 1, 1);
		pale0_13.setRotationPoint(-5.414214F, 21.5F, 5.414214F);
		
		body.rotateAngleX = 0F;
		body.rotateAngleY = 0F;
		body.rotateAngleZ = 0F;

		arm0.rotateAngleX = 0F;
		arm0.rotateAngleY = -0.7853982F;
		arm0.rotateAngleZ = 0F;

		motor0.rotateAngleX = 0F;
		motor0.rotateAngleY = -0.7853982F;
		motor0.rotateAngleZ = 0F;

		elice0.rotateAngleX = 0F;
		elice0.rotateAngleY = -0.7853982F;
		elice0.rotateAngleZ = 0F;

		pale0.rotateAngleX = 0.5235987F;
		pale0.rotateAngleY = -0.7853982F;
		pale0.rotateAngleZ = 4.341565E-09F;

		pale0_1.rotateAngleX = -0.5235987F;
		pale0_1.rotateAngleY = -0.7853982F;
		pale0_1.rotateAngleZ = -4.341565E-09F;

		arm1.rotateAngleX = 0F;
		arm1.rotateAngleY = 0.7853982F;
		arm1.rotateAngleZ = 0F;

		motor1.rotateAngleX = 0F;
		motor1.rotateAngleY = 0.7853982F;
		motor1.rotateAngleZ = 0F;

		elice1.rotateAngleX = 0F;
		elice1.rotateAngleY = 0.7853982F;
		elice1.rotateAngleZ = 0F;

		pale01.rotateAngleX = 0.5235987F;
		pale01.rotateAngleY = 0.7853982F;
		pale01.rotateAngleZ = -4.341565E-09F;

		pale0_11.rotateAngleX = -0.5235987F;
		pale0_11.rotateAngleY = 0.7853982F;
		pale0_11.rotateAngleZ = 4.341565E-09F;

		arm2.rotateAngleX = 0F;
		arm2.rotateAngleY = -0.7853982F;
		arm2.rotateAngleZ = 0F;

		motor2.rotateAngleX = 0F;
		motor2.rotateAngleY = -0.7853982F;
		motor2.rotateAngleZ = 0F;

		elice2.rotateAngleX = 0F;
		elice2.rotateAngleY = -0.7853982F;
		elice2.rotateAngleZ = 0F;

		pale02.rotateAngleX = 0.5235987F;
		pale02.rotateAngleY = -0.7853982F;
		pale02.rotateAngleZ = 4.341565E-09F;

		pale0_12.rotateAngleX = -0.5235987F;
		pale0_12.rotateAngleY = -0.7853982F;
		pale0_12.rotateAngleZ = -4.341565E-09F;

		arm3.rotateAngleX = 0F;
		arm3.rotateAngleY = 0.7853982F;
		arm3.rotateAngleZ = 0F;

		motor3.rotateAngleX = 0F;
		motor3.rotateAngleY = 0.7853982F;
		motor3.rotateAngleZ = 0F;

		elice3.rotateAngleX = 0F;
		elice3.rotateAngleY = 0.7853982F;
		elice3.rotateAngleZ = 0F;

//		pale03.rotateAngleX = 0.5235987F;
//		pale03.rotateAngleY = 0.7853982F;
//		pale03.rotateAngleZ = -4.341565E-09F;
//
//		pale0_13.rotateAngleX = -0.5235987F;
//		pale0_13.rotateAngleY = 0.7853982F;
//		pale0_13.rotateAngleZ = 4.341565E-09F;
		
		
		//test
		elice3.addChild(pale03);
		elice3.addChild(pale0_13);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.renderWithRotation(f5);
		arm0.renderWithRotation(f5);
		motor0.renderWithRotation(f5);
		elice0.renderWithRotation(f5);
		pale0.renderWithRotation(f5);
		pale0_1.renderWithRotation(f5);
		arm1.renderWithRotation(f5);
		motor1.renderWithRotation(f5);
		elice1.renderWithRotation(f5);
		pale01.renderWithRotation(f5);
		pale0_11.renderWithRotation(f5);
		arm2.renderWithRotation(f5);
		motor2.renderWithRotation(f5);
		elice2.renderWithRotation(f5);
		pale02.renderWithRotation(f5);
		pale0_12.renderWithRotation(f5);
		arm3.renderWithRotation(f5);
		motor3.renderWithRotation(f5);
		elice3.renderWithRotation(f5);
		pale03.renderWithRotation(f5);
		pale0_13.renderWithRotation(f5);
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
		
		//test
		elice3.rotateAngleY += 0.5f;
	}

}