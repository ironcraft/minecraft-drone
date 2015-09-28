package fr.ironcraft.utils;

import net.minecraft.nbt.NBTTagCompound;

/**
 * Toute classe fille doit disposer d'un constructeur sans arguments !!
 */
public interface NBTSerializable
{
	/**
	 * Lit les informations depuis la sauvegarde.
	 */
	void readFromNBT(NBTTagCompound tag);

	/**
	 * Sauvegarde les informations.
	 */
	void writeToNBT(NBTTagCompound tag);
}
