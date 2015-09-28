package fr.ironcraft.drone.planning;


import java.util.ArrayList;

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTTagCompound;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.ironcraft.drone.entity.EntityDrone;
import fr.ironcraft.utils.NBTSerializable;


/**
 * Liste ordonnée de tâches que le drone effectuera lors de l'execution de ce
 * plan de vol.
 */
public final class FlyPlanning implements NBTSerializable
{
	public static final Logger logger = LogManager.getLogger();
	
	/**
	 * Liste des tâches à effectuer, dans l'ordre croissant de leur index. La
	 * tâche à l'index 0 est la tâche courante.
	 */
	private ArrayList<FlyTask> tasksQueue = new ArrayList<FlyTask>();

	/**
	 * Nombre de ticks depuis le lancement de la tâche actuelle.
	 */
	private transient long currentTaskTickCounter;
	
	/**
	 * Nombre de ticks depuis le lancement du plan de vol.
	 */
	private transient long totalTime;

	/**
	 * Tâche actuellement en cours.
	 */
	@Nullable
	private transient FlyTask currentTask;
	
	/**
	 * État du vol : pas commencé, en cours, terminé, erreur.
	 */
	private transient FlyState state;

	/**
	 * Le drone sur lequel on applique le plan de vol.
	 */
	private transient EntityDrone targetDrone;

	public FlyPlanning()
	{
		state = FlyState.NOT_STARTED;
	}
	
	public void tick()
	{
		if (state.equals(FlyState.FLYING))
		{
			totalTime++;
			
			if (currentTask != null)
			{
				currentTask.tick(targetDrone, currentTaskTickCounter);

				if (currentTaskTickCounter++ == currentTask.getDuration())
				{
					nextTask();
				}
			}
		}
		else
		{
			
		}
	}
	
	public void start(EntityDrone drone)
	{
		if (drone == null)
		{
			throw new IllegalArgumentException("Cannot apply fly planning on null drone!");
		}
		if (tasksQueue.isEmpty())
		{
			logger.warn("FlyPlanning is ran, but empty.");
		}
		
		targetDrone = drone;
		state = FlyState.FLYING;
		totalTime = 0;
		currentTaskTickCounter = 0;
	}

	private void nextTask()
	{
		if (!tasksQueue.remove(0).equals(currentTask))
		{
			throw new IllegalStateException("Current task is not the first in queue!");
		}
		else
		{
			if (tasksQueue.size() > 0)
			{
				currentTask = tasksQueue.get(0);
			}
			else
			{
				currentTask = null;
				state = FlyState.TERMINATED;
			}
		}
	}
	
	public FlyState getState()
	{
		return state;
	}
	
	public void setState(FlyState state)
	{
		this.state = state;
	}
	
	public long getTotalTime()
	{
		return totalTime;
	}

	@Override
	public void readFromNBT(NBTTagCompound tag)
	{
		// TODO : trouver un moyen de sérialiser la liste des tâches.
	}

	@Override
	public void writeToNBT(NBTTagCompound tag)
	{
	}
}
