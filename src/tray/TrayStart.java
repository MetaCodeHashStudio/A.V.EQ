package tray;

import java.awt.*;
import java.awt.event.*;
import manager.ManagerC;

/**
 * @author Runnetty
 */

public class TrayStart {
    
    public static void T() throws AWTException {
      /*Check if System supports tray icons*/
     if (!SystemTray.isSupported())
     {
         
          System.out.println("SystemTray is not supported");
          return;
     }
     
     /*Adding Menu to tray*/
     PopupMenu popMenu= new PopupMenu();
     /*Items*/
     MenuItem item1 = new MenuItem("EQ-Control");
     MenuItem item2 = new MenuItem("Controls");
     MenuItem item3 = new MenuItem("Exit");
     /*Adding Items*/
     popMenu.add(item1);
     popMenu.add(item2);
     popMenu.add(item3);
    
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /*Open EQ Window*/
                ManagerC.EQOpen();
            }
        });
        
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /*Open Controls Window*/
                ManagerC.ControlsOpen();
            }
        });
        item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.out.println("Closing A.V.EQ");
               System.exit(0);
            }
        });
     /*Get Tray Icon*/
//     Image img = Toolkit.getDefaultToolkit().getImage("G:\\NITH\\Java\\My Apps\\Sound Manager\\src\\Ico\\Icon.gif");
       Image img = Toolkit.getDefaultToolkit().getImage("src\\ico\\Icon.gif");

     
     /*specify trayicon*/
     TrayIcon trayIcon = new TrayIcon(img, "A.V.EQ", popMenu);
     
     /*Put Trayicon in tray*/
     SystemTray.getSystemTray().add(trayIcon);
     System.out.println("- Tray: (Loaded)");
   
    }
    
}
