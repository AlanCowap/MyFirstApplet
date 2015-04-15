package com.alancowap.cag.applet;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TestPanel extends JPanel {

	JButton a = new JButton("A");

	/**
	 * Create the panel.
	 */
	public TestPanel() {
		//create a button
		add(a);
		setVisible(true);
	}

}
