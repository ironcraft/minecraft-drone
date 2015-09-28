package fr.ironcraft.utils;


import java.lang.reflect.InvocationTargetException;

import net.minecraft.nbt.NBTTagCompound;


public class IOUtils
{
	public static void serialize(String key, NBTSerializable serializable, NBTTagCompound tag)
	{
		NBTTagCompound child = new NBTTagCompound();
		serializeToSingleTag(serializable, child);
		tag.setTag(key, child);
	}

	public static <T extends NBTSerializable> T unserialize(String key, NBTTagCompound tag, Class<? extends T> type)
	{
		return unserializeFromSingleTag(tag.getCompoundTag(key), type);
	}

	public static NBTTagCompound serializeToSingleTag(NBTSerializable serializable, NBTTagCompound tag)
	{
		serializable.writeToNBT(tag);
		return tag;
	}

	public static <T extends NBTSerializable> T unserializeFromSingleTag(NBTTagCompound tag, Class<? extends T> type)
	{
		try
		{
			T read = type.getConstructor(new Class<?>[] {}).newInstance();
			read.readFromNBT(tag);
			return read;
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}

		return null;
	}
}
