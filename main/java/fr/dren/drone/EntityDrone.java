package fr.dren.drone;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntityDrone extends EntityLiving
{
	public EntityDrone(World par1World)
	{
		super(par1World);
		this.setSize(0.9F, 1.3F);
		System.out.println("instance");
	}
}