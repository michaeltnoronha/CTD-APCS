
public class Computer extends Player {
	private boolean changed;
	public Computer()
	{
		super();
		changed = false;
	}
	
	public boolean isChanged()
	{
		return changed;
	}
	
	public void setChanged(boolean newChanged)
	{
		changed = newChanged;
	}
	
	public void stand()
	{
		super.setDone(true);
	}

}
