package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayoutEx extends JFrame{
	
	BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = {"북","센터","남","동","서"};
	String[] directions = {borderLayout.NORTH,borderLayout.CENTER,borderLayout.SOUTH,borderLayout.EAST,borderLayout.WEST};
	
	public BorderLayoutEx() {
		
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		
//		setTitle("BorderLayout 연습");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(400,400);
//		
//		이렇게도 사용가능
		super.setTitle("BorderLayout 연습");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400,400);
		
		borderLayout = new BorderLayout();
		
		for (int i = 0; i < buttons.length; i++) {
			
			buttons[i] = new JButton(titles[i]);
			
		}
		
		
		
	}
	
	private void setInitLayout() {
		
		setVisible(true);
		
		for (int i = 0; i < buttons.length; i++) {
			
			// add JFrame
			super.add(buttons[i],directions[i]);
		}
		
		
//		super.add(buttons[0], BorderLayout.NORTH);
//		super.add(buttons[1], BorderLayout.CENTER);
//		super.add(buttons[2], BorderLayout.SOUTH);
//		super.add(buttons[3], BorderLayout.EAST);
//		super.add(buttons[4], BorderLayout.WEST);
//		
		
	}
	
	
	public static void main(String[] args) {
		
		new BorderLayoutEx();
		
	} // end of main
	

} // end of jframe
