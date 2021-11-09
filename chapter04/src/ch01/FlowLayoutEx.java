package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.ArrayList;

class MyFrame2 extends JFrame {
	
// 	private JButton[] buttons = new JButton[6];
	ArrayList<JButton> buttons = new ArrayList<JButton>();

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
	
	final int JBUTTONS_SIZE = 20;
	
	
	public MyFrame2() {
		
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		
		setTitle("Flow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT,1,10));
		
		// ArrayList �� ��� �ϴ� ���
		// ArrayList ó�� ������� 0

		for(int i =0; i < JBUTTONS_SIZE; i++) {
		
			buttons.add(new JButton((i+1) + "��° ��ư"));
			
		}
		
		
		
//		for(int i = 0; i<buttons.length;i++) {
//			buttons[i] = new JButton((i+1) + "��° ��ư");
			
//		}
//		button1 = new JButton("1��° ��ư");
//		button2 = new JButton("2��° ��ư");
//		button3 = new JButton("3��° ��ư");
//		button4 = new JButton("4��° ��ư");
//		button5 = new JButton("5��° ��ư");
//		button6 = new JButton("6��° ��ư");
		
//		buttons[0] = new JButton("1��° ��ư");
//		buttons[1]= new JButton("2��° ��ư");
//		buttons[2]= new JButton("3��° ��ư");
//		buttons[3]= new JButton("4��° ��ư");
//		buttons[4]= new JButton("5��° ��ư");
//		buttons[5] = new JButton("6��° ��ư");
//		
		
	} // end of init data()
	
	private void setInitLayout() {
		
		setVisible(true);
		
		for(int i =0; i < JBUTTONS_SIZE;i++) {
			add(buttons.get(i));
		}
		
		
//		for(int i =0; i<buttons.length; i++) {
//			
//			add(buttons[i]);
//			
//		}
	
		
	} // setinitlayout
	
	
	
} // end of my jframe



public class FlowLayoutEx {
  
	public static void main(String[] args) {
		
		new MyFrame2();
		
		
		
		
		
		// TODO Auto-generated method stub

	} // end of main

} // end of class