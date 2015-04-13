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

	private StringBuffer buffer;
	/**
	 * @throws HeadlessException
	 */
	public MyFirstApplet() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	/*
	 The init method is useful for one-time initialization that doesn't take very long.
	 The init method typically contains the code that you would normally put into a constructor.
	 The reason applets don't usually have constructors is that they aren't guaranteed to
	 have a full environment until their init method is called. Keep the init method short
	 so that your applet can load quickly.
	 */
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
        buffer = new StringBuffer();
        addItem("initializing... ");
    }
    

    /*
		Every applet that performs tasks after initialization (except in direct response
		to user actions) must override the start method. The start method starts the
		execution of the applet. It is good practice to return quickly from the start
		method. If you need to perform computationally intensive operations it might be
		better to start a new thread for this purpose.     
     */
    @Override
    public void start() {    	
    	super.start();
    	addItem("starting... ");
    }

    /*
		Most applets that override the start should also override the stop method.
		The stop method should suspend the applet's execution, so that it doesn't take
		up system resources when the user isn't viewing the applet's page. For example,
		an applet that displays an animation should stop trying to draw the animation
		when the user isn't viewing it.
     */
    @Override
    public void stop() {
    	super.stop();
    	addItem("stopping... ");
    }
    
    
    /*
		Many applets don't need to override the destroy method because their stop method
		(which is called before destroy) will perform all tasks necessary to shut down
		the applet's execution. However, the destroy method is available for applets
		that need to release additional resources.
     */
    @Override
    public void destroy() {
    	super.destroy();
    	addItem("destroying... ");
    }
    
    private void addItem(String newWord) {
        System.out.println(newWord);
        buffer.append(newWord);
        repaint();
    }

    public void paint(Graphics g) {
    	//Draw a Rectangle around the applet's display area.
            g.drawRect(0, 0, 
    		   getWidth() - 1,
    		   getHeight() - 1);

    	//Draw the current string inside the rectangle.
            g.drawString(buffer.toString(), 5, 15);
        }
}
