package ch04;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame{
	
	String name;
	JPanel panel;
	
	// 인터페이스를 --> 익명 구현 객체 문법으로 사용할 수 있다.
	
	CallbackCheckPositon callbackCheckPositon = new CallbackCheckPositon() {
		
		@Override
		public void checkPosition(int x, int y) {
			// TODO Auto-generated method stub
			System.out.println(name + "콜백 받은 값 x :" +  x);
			System.out.println(name + "콜백 받은 값 x :" +  y);
			
		}
	};

	public Activity1(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
		setTitle(name);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		setVisible(true);
		add(panel);
		panel.setBackground(Color.blue);
		
		
		
	}
	
	
	
}
