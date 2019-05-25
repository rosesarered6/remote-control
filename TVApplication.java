package assignment01;

import java.util.Scanner;

public class TVApplication 
{
	// the single main method which calls the runTVApplication method
	public static void main(String[] args) 
	{
		runTVApplication();
	}
		// runTVApplication allows the user to select buttons including power, channels and volume
		public static void runTVApplication()
		{
			// instantiating the Television and RemoteControl classes
			Television tv = new Television();
			RemoteControl remotecontrol = new RemoteControl(tv);
			
			// importing the scanner to read user input 
			Scanner scanner = new Scanner(System.in);
			
			// the only instance variable set to a default value
			int buttonPressed = 0;
			
			// the buttonPressed variable is checked when the user presses a number
			// depending on this number a statement will be printed and the toString altered
			while(buttonPressed != 6)
			{
				System.out.println("\nPress a button on the Remote Control");
				System.out.println("\n1. Power 2. Volume Up by 50% 3. Volume Down by 50% 4. Channel Up 5. Channel Down 6. TV Off and Go Outside");
				buttonPressed = scanner.nextInt();
			
				String bp = "Button Pressed";
			
				if (buttonPressed == 1)
				{
					remotecontrol.powerButton(true);
					System.out.println("Power "+bp);
					System.out.println(tv.toString());
				}
				else if (buttonPressed == 2)
				{
					remotecontrol.volumeUpByHalf(tv.getVolume());
					System.out.println("Volume Up by 50% "+bp);
					System.out.println(tv.toString());
				}
				else if (buttonPressed == 3)
				{
					remotecontrol.volumeDownByHalf(tv.getVolume()); 
					System.out.println("Volume Down by 50% "+bp);
					System.out.println(tv.toString());
				}
				else if (buttonPressed == 4)
				{
					remotecontrol.channelUpButton(tv.getChannel());
					System.out.println("Channel Up "+bp);
					System.out.println(tv.toString());
				}
				else if (buttonPressed == 5)
				{
					remotecontrol.channelDownButton(tv.getChannel());
					System.out.println("Channel Down "+bp);
					System.out.println(tv.toString());
				}
			} 
				remotecontrol.powerButton(false);
				System.out.println("Stop watching TV and go outside.");
				System.out.println(tv.toString());
			}	
}
	
	
	
