/**
 * 
 */
package com.alancowap.cag.applet;

import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * @author Alan Cowap
 * and using code from docs.oracle.com/javase/tutorial/deployment/applet
 */
public class MyFirstApplet extends JApplet {

	/**
	 * @throws HeadlessException
	 */
	public MyFirstApplet() throws HeadlessException {
		// TODO Auto-generated constructor stub 
	}

    //Called when this applet is loaded into the browser.
    public void init() {
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    JLabel lbl = new JLabel("Hello World");
                    add(lbl);
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
    
}
