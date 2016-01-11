package com.datashow.ui;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.log4j.Logger;

public class AppStarter {
	
	private static final Logger logger = Logger.getLogger(AppStarter.class);
	
	JFrame mainFrame = new JFrame("Shows and Anime");
	
	public void showGui()
	{
		//TODO use list instead menu
		JPanel panel = new JPanel();
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Select");
		menu.add("Anime");
		menu.add("Show");
		menu.addChangeListener(new ChangeListener(){

			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				
			}});
		menu.addItemListener(new ItemListener(){

			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}});
		menubar.add(menu);
		JLabel labelExample = new JLabel("Label");
		labelExample.setSize(20, 10);
		
		panel.add(labelExample);
		panel.add(menubar);
		mainFrame.add(panel);
		mainFrame.setVisible(true);
		mainFrame.setLocation(40, 40);
		Dimension dimension = new Dimension(1000, 700);
		mainFrame.setSize(dimension);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		//System.out.println(getLocalCurrentDate());
		AppStarter start = new AppStarter();
		start.showGui();
	}

	private static String getLocalCurrentDate() {

		if (logger.isDebugEnabled()) {
			logger.debug("getLocalCurrentDate() is executed!");
		}

		return "today's date";

	}

}