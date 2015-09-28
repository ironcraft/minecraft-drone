package fr.ironcraft.drone.proxy;

import fr.ironcraft.drone.entity.EntityDrone;
import fr.ironcraft.drone.entity.render.RenderEntityDrone;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	public void init()
	{
		System.out.println("Init ClientProxy");
		RenderingRegistry.registerEntityRenderingHandler(EntityDrone.class, new RenderEntityDrone());
	}
}