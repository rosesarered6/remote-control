package assignment01;

public class RemoteControl 
{
	// specifying the instance variables required for this class
	private Television tv; 
	private final boolean ON=true;
	private final boolean OFF=!ON;
	
	// constructor which takes as input a television object
	public RemoteControl(Television tv)
	{
		this.tv = tv; 
	}
	
	// powerButton method which switches the TV ON and OFF
	public void powerButton(boolean power)      
	{
		if(power == this.ON) 
		{
			tv.setPower(this.ON);
		}
		else 
		{
			tv.setPower(this.OFF);
		}
	}

	// channelDownButton method which decrements the channel
	// if channel is equal to 1, then channel is set to maxChannel (10)
	public void channelDownButton(int channelDown)
	{	
		tv.setChannel(--channelDown);
		
		if(tv.getChannel() == 1)
		{
			tv.setChannel(tv.getMaxChannel());
		}
	}
	
	// creating a channelUpButton method which increments the channel
	// if channel is equal to maxChannel (10), then the channel is set to 1
	public void channelUpButton(int channelUp)
	{
		tv.setChannel(++channelUp);
		
		if(tv.getChannel() == tv.getMaxChannel())
		{
			tv.setChannel(1);
		}
	}
	
	// volumeUpByHalf method which increases the volume by 50%
	public void volumeUpByHalf(int volumeUp)
	{
		tv.setVolume(volumeUp + 50);
	}
	
	// volumeDownByHalf method which decreases the volume by 50%
	public void volumeDownByHalf(int volumeDown)
	{
		tv.setVolume(volumeDown - 50);
	}
}