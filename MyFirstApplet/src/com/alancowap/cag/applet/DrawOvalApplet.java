package com.alancowap.cag.applet;
// This class adapted from: http://www.java-examples.com/draw-oval-circle-applet-window-example
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class DrawOvalApplet extends JApplet {

	/**
	 * Create the applet.
	 */
	public DrawOvalApplet() {

	}
	public void paint(Graphics g){

		//set color to red
		setForeground(Color.red);

		/*
		 * to draw a oval in an applet window use,
		 * void drawOval(int x1,int y1, int width, int height)
		 * method.
		 *
		 * This method draws a oval of specified width and
		 * height at (x1,y1)
		 */

		//this will draw a oval of width 50 & height 100 at (10,10)
		g.drawOval(10,10,50,100);


		/*
		 * To draw a filled oval use
		 * fillOval(int x1,int y1, int width, int height)
		 * method of Graphics class.
		 */

		//draw filled oval
		g.fillOval(100,20,50,100);

		// Note that a circle is an oval where width = height
		// let's draw a blue circle
		g.setColor(Color.blue);
		g.drawOval(70, 100, 20, 20);
		
		// let's draw a green 3D Rectangle
		g.setColor(Color.green);
		g.draw3DRect(40, 150, 80, 40, false);

	}

}
