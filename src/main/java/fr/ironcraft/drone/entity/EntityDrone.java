package fr.ironcraft.drone.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityDrone extends EntityLiving
{
	public double speed;
	private float anglemotor;
	public EntityDrone(World par1World)
	{
		super(par1World);
		this.setSize(0.2F, 0.2F);
	}
	
	public static <T extends Comparable<T>> T clamp(T val, T min, T max)
	{
		if (val.compareTo(min) < 0)
			return min;
		if (val.compareTo(max) > 0)
			return max;
		return val;
	};
	
    public void onUpdate()
    {

    	speed = 2f * ((1.0f + (float)Math.sin(this.worldObj.getTotalWorldTime() * Math.PI / 180f)) / 2.0f);
    	speed = clamp(speed, 0.0, 1.67);
    	if (speed < 0.5)
    		super.onUpdate();
    	float conv = ((float)Math.exp(5f + speed) - 1.0f) / 22025.46484375f;
		anglemotor += 32f * (conv < 0.006693f ? 0.0f : (conv > 1.0f ? 1.0f : conv));
		if (this.speed > 1.5f)
        {
            this.motionX = this.motionY = this.motionZ = 0.0D;
            BlockPos pos = new BlockPos(this);
            pos = pos.down();
            if (worldObj.getBlockState(pos).getBlock().isNormalCube())
            {
            	this.posY += 0.005;
            	this.prevPosY += 0.005;
            }
        }
    }
    
    public float getAngleMotor()
    {
    	return anglemotor;
    }
}