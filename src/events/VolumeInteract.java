package events;

public class VolumeInteract
{
	public static void changeVolume()
	{
		public static void volumeInteractEvent(int slider[sliderID], int volUpDown)
		{
			
			int newVolume = SoundManagerGUI.slider[sliderID].getValue() + volUpDown;
			if (newVolume >= 0 && newVolume <= 101)
			{
				if(newVolume >= 100)
				{
					SoundManagerGUI.slider[sliderID].setValue(100);
				}
				else
				{
					SoundManagerGUI.slider[sliderID].setValue(newVolume);
				}
			}
		}
	}
	public static void getNewVolume() //This method will be used to update the GUI
	{
		
	}
}
