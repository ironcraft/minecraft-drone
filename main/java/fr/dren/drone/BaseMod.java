package fr.dren.drone;

import fr.dren.drone.proxy.CommonProxy;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry.EntityRegistration;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

@Mod(modid = BaseMod.MODID, version = BaseMod.VERSION)
public class BaseMod
{
	@Instance(BaseMod.MODID)
	public static BaseMod		instance;

	public static final String	MODID	= "drone";
	public static final String	VERSION	= "1.0";
	public static final String	PATH	= "fr.dren." + MODID;

	@SidedProxy(clientSide = PATH + ".proxy.ClientProxy", serverSide = PATH + ".proxy.CommonProxy")
	public static CommonProxy	proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		EntityRegistry.registerGlobalEntityID(EntityDrone.class, "Drone", EntityRegistry.findGlobalUniqueEntityId(), 0, 100);
//		EntityRegistry.registerModEntity(EntityDrone.class, "Drone", EntityRegistry.findGlobalUniqueEntityId(), BaseMod.instance, 80, 3, true);
//		LanguageRegistry.instance().addStringLocalization("entity.Drone.name", "en_US", "Drone");
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}