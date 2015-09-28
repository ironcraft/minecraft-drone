package fr.ironcraft.drone.planning;

import fr.ironcraft.drone.entity.EntityDrone;

public class TaskSleep extends FlyTask
{
	public TaskSleep(int duration)
	{
		super(duration);
	}

	@Override
	public void tick(EntityDrone targetDrone, long ticksElapsed)
	{
		// Nothing.
	}
}
