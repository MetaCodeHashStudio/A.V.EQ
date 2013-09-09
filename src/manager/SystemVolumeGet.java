package manager;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Control;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Port;

      

       


/**
 * @author Runnetty
 */
public class SystemVolumeGet {
    private static boolean mixers;
    
    public static void MixerStart() throws LineUnavailableException{
    System.out.println("- Mixers (Loaded)");
    Mixers();
    }
    
    public static float value = 0.5f;
    public static void Mixers() throws LineUnavailableException{
                
                    
                    System.out.println("");
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
            System.out.println("There are " + mixers.length + " mixer info objects");
            
            for (Mixer.Info mixerInfo : mixers) {
               
                System.out.println("mixer name: " + mixerInfo.getName());
               // System.out.println(" - Windows: " + mixerInfo.getDescription());
                
                Mixer mixer = AudioSystem.getMixer(mixerInfo);
                //System.out.println("-" + mixer);
                Line.Info[] lineInfos = mixer.getSourceLineInfo();
                
                for (Line.Info lineInfo : lineInfos) {
                  System.out.println("  Line.Info: " + lineInfos);
                    Line line = mixer.getLine(lineInfo);
                    
                }
            }
            /*
                        Line line = AudioSystem.getLine(Port.Info.SPEAKER);                    
                        line.open();
                        FloatControl control =(FloatControl)line.getControl(FloatControl.Type.VOLUME);
                        control.setValue(value);
                        //line.close();
                        //System.out.println("Cur Vol: "value);
                        System.out.println("");
                        //System.out.println(mixers);
                        System.out.println(control);
             */           
                } 
    }
    




