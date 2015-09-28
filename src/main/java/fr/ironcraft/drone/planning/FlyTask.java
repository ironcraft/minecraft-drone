package fr.ironcraft.drone.planning;

import fr.ironcraft.drone.entity.EntityDrone;

public abstract class FlyTask
{
	/**
	 * Durée de la tâche en ticks.
	 */
	private int duration = 0;
	
	public FlyTask(int duration)
	{
		this.duration = duration;
	}
	
	public abstract void tick(EntityDrone targetDrone, long ticksElapsed);
	
	public int getDuration()
	{
		return duration;
	}
}
