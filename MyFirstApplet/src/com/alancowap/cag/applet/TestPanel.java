package com.alancowap.cag.applet;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TestPanel extends JPanel {

		/**
	 * Create the panel.
	 */
	public TestPanel() {
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
