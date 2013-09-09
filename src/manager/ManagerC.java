
package manager;
/*
 * @author Runnetty
 * Runnetty's Audio & Voice Equilizer 
 */
import java.awt.AWTException;
import javax.sound.sampled.LineUnavailableException;
import tray.TrayStart;
import windows.SoundManagerGUI;

public class ManagerC
{
	public static int numApps = 9; // Used by SoundManagerGUI. Must be made variable.
	public static String[] appNames = new String[numApps]; // Variable sized array to create names for apps
	public static int[] channelNumbers = new int[numApps];
    private static float value = manager.SystemVolumeGet.value;
    public static void main(String[] args) throws AWTException, LineUnavailableException
    {
    	System.out.println("Starting A.V.EQ");
    	System.out.println("---Classes Loaded---");
    	/*Start tray*/
    	TrayStart.T();
//    	SoundManagerGUI.windowStart(); //GUI broken.
    	SystemVolumeGet.MixerStart();
        //boolean setVolume = SystemVolumeGet.Mixers(value);
        /*Check*/   
    }
    public static void EQOpen()
    {
    	System.out.println("Opening EQ Window");
    	SoundManagerGUI.windowStart();

    }
    public static void ControlsOpen()
    {
    	System.out.println("Opening Controls Window");
    }
}