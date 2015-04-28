package com.alancowap.cag.applet;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TestPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TestPanel(Graphics g) {
		//create a button
		JButton a = new JButton("A");
		add(a);
		a = new JButton("B");
		add(a);
		a = new JButton("C");
		add(a);
		setVisible(true);
	}

}
