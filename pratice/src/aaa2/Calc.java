package aaa2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calc extends JFrame{
	
	BorderLayout borderLayout;
	
	final int MAX_NUMBER = 10;
	ArrayList<JButton> buttons = new ArrayList<>();
	
	JPanel jPanel1;
	JPanel jPanel2;
	
	
	
	public Calc() {
		
		initData();
		setInitLyaout();
	
	}
	private void initData() {
		
		setTitle("Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		
		
		
		for (int i = 0; i < MAX_NUMBER; i++ ) {
			
			buttons.add(new JButton((i)+""));
			
		}
		
	}
	
	private void setInitLyaout() {
		
		setVisible(true);
		this.setResizable(false);
		
		setLayout(borderLayout);
		
		add(jPanel1);
		add(jPanel2);
		
		jPanel1.setBackground(Color.red);
		jPanel1.setPreferredSize(new Dimension(100,80));
		add(jPanel1,borderLayout.NORTH);
		jPanel2.setBackground(Color.blue);
		
		jPanel2.setLayout(new FlowLayout());
		jPanel2.setPreferredSize(new Dimension(200,50));
		jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(jPanel2);
		
	
		
		for (int i = 0; i < MAX_NUMBER; i++) {
		
			add(buttons.get(i));
		}
		
		for (int i = 0; i < MAX_NUMBER; i++) {
			
			jPanel2.add(buttons.get(i));
			
		}
		
		
	}
	
	private void addEventListener() {
		
		
		
	}
	
	
	
		public static void main(String[] args) {
			
			new Calc();
			
		}

}
