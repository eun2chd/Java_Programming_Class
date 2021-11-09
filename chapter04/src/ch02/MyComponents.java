package ch02;

import java.awt.*;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame{
	
	private JPanel panel;
	private JButton button;
	private JLabel lable;
//	private JTextField textField;
	JTextField textField;
	private JPasswordField passwordField;
	private JCheckBox checkBox;
	
	public MyComponents() {

		initData();
		setInitLayout();
	
	}
	
	private void initData() {
		
		setTitle("ÄÄÆ÷³ÍÆ® ¿¬½À");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		
		panel = new JPanel();
		button = new JButton("button");
		textField = new JTextField("ÈùÆ®",20);
		passwordField = new JPasswordField(20);
		checkBox = new JCheckBox("checkBox", true);
		lable = new JLabel("label");
		
		
	}
	
	private void setInitLayout() {
		
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(panel);		
	
		
		panel.add(button);
		panel.add(lable);
		panel.add(textField);
		panel.add(passwordField);
		panel.add(checkBox);
		
		
	}
	
	
	
	
	

} // end of my jframe
