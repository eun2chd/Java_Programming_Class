package ch04;

import  java.awt.Color;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;


public class MyFrame2 extends JFrame{
	
	JPanel jPanel1;
	JPanel jPanel2;
	
	JButton button1;
	JButton button2;
	
	public MyFrame2() {
		initDate();
		setInitLayout();
	}
	
	private void initDate() {
		
		setTitle("패널 연습");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		
		
		
	}
	
	private void setInitLayout() {
		
		setVisible(true);

		setLayout(new GridLayout(2,1));
		add(jPanel1);
		add(jPanel2);
		
		jPanel1.setBackground(Color.yellow);
		jPanel2.setBackground(Color.blue);
		
		jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jPanel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		jPanel1.add(button1);
		jPanel2.add(button2);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new MyFrame2();
		
	} // end of main
	
} // end of class
