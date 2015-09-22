package fr.ironcraft.drone.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntityDrone extends EntityLiving
{
	public float speed;
	private float anglemotor = 0.0f;
	public EntityDrone(World par1World)
	{
		super(par1World);
		this.setSize(0.2F, 1F);
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
//    	super.onUpdate();
    	float conv = ((float)Math.exp(5f + clamp(speed, 0.0f, 2.0f)) - 1.0f) / 22025.46484375f;
		anglemotor += 8f * (conv < 0.01f ? 0.0f : (conv > 1.0f ? 1.0f : conv));
    	anglemotor += 8f * (speed / 10f);
    }
    
    public float getAngleMotor()
    {
    	return anglemotor;
    }
}