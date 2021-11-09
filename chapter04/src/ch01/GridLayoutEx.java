package ch01;

import java.awt.*;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	private ArrayList<JButton> buttons = new ArrayList<>();
	private final int MAX_COUNT = 6;
	
	
	public GridLayoutEx() {

		initData();
		setInitLayout();

	}

	private void initData() {
		
		setTitle("GridLayout ¿¬½À");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
			
		for (int i = 0; i < MAX_COUNT; i++) {
			
			buttons.add(new JButton( (i+1) + "¹ø"));
			
		}
		
	}

	private void setInitLayout() {

		setVisible(true);
		setLayout(new GridLayout(4,2));
			
	
		for (int i = 0; i < MAX_COUNT; i++) {
			
			
			add(buttons.get(i));
			
		}
		
//		
//		add(buttons.get(0));
//		add(buttons.get(1));
//		add(buttons.get(2));
//		add(buttons.get(3));
//		add(buttons.get(4));
//		
		
		
		
	}
	

	public static void main(String[] args) {

		new GridLayoutEx();

	} // end of main

} // end of jframe
