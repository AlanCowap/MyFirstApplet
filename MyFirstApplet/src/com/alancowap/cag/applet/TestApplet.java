package com.alancowap.cag.applet;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class TestApplet extends JApplet {
	private static final long serialVersionUID = 1L;
	/**
	 * Create the applet.
	 */
	public TestApplet() {
		setContentPane(new TestPanel(getGraphics()));
		
	}
	public void paint(Graphics g){

		//set color to red
		setForeground(Color.red);
		//draw filled oval
		g.fillOval(100,20,50,100);

		// Note that a circle is an oval where width = height
		// let's draw a blue circle
		g.setColor(Color.blue);
		g.drawOval(70, 100, 20, 20);
	}
}
