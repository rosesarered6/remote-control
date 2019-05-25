package assignment01;

public class Television 
{
	// Specifying the instance variables required for this class
	private final int maxChannel;
	private boolean power;
	private int channel;
	private int volume;
		
	// Default constructor sets maxChannel to 10, volume to 0, and channel to 1
	public Television()
	{
		this.maxChannel = 10;
		this.volume = 0;
		this.channel = 1;
	}
		
	// Constructor setting maxChannel to 10 if new int max is less than 2
	public Television(int max) 
	{
		//this.maxChannel = max;
		
		if (max < 2) 
	    {
			this.maxChannel = 10; 
		}
		else
		{
			maxChannel = max;
		}
	}
	
    // getter and setter for power
	public boolean getPower() 
	{ 
		return power;
	}
	public void setPower(boolean power) 
	{
		this.power = power;
	}
	
	// getter and setter for channel 
	public int getChannel() 
	{ 
		return channel;
	}
	public void setChannel(int channel) 
	{
		if ((channel >= 1) && (channel <= maxChannel))
		{
			this.channel = channel;
		}
		else
		{
			this.channel = 0;
		}
	}
	
	// getter for volume
	public int getVolume() 
	{
		return volume;
	}
	
	// setter for volume, ensuring the volume stays between 0 and 100 at all times
	public void setVolume(int volume) 
	{
		if ((100 >= volume) && (0 <= volume)) 
		{
			this.volume = volume; 
		}
		else
		{
			this.volume = 0;
		}
	}
	
	// volumeDown method decrementing the volume percentage by one
	public void volumeDown(int volume) 
	{
		volume--;
	}
	
	// volumeUp method incrementing the volume percentage by one
	public void volumeUp(int volume) 
	{
		volume++;
	}
		
	// getter for maxChannel
	public int getMaxChannel() 
	{
		return maxChannel;
	}
	
	// toString method of the Television object
	public String toString() 
	{
		String output="";
		
		if (power==true) {
			output="Television is: on?"+" YES."+" CHANNEL: "+this.channel+"/10."+
					" VOLUME: "+this.volume+"%";
		}
		else 
		{
			output="Television is: on?"+" NO"+" CHANNEL: "+this.channel+"/10."+
					" VOLUME: "+this.volume+"%";
		}
		return output;
	}
}
	
	

