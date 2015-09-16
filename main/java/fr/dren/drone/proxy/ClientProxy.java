package fr.dren.drone.proxy;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import fr.dren.drone.EntityDrone;
import fr.dren.drone.RenderEntityDrone;

public class ClientProxy extends CommonProxy
{
	public void init()
	{
		System.out.println("init");
		RenderingRegistry.registerEntityRenderingHandler(EntityDrone.class, new RenderEntityDrone());
	}
}