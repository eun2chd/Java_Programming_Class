package ch04;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame{
	
	String name;
	JPanel panel;
	
	// �������̽��� --> �͸� ���� ��ü �������� ����� �� �ִ�.
	
	CallbackCheckPositon callbackCheckPositon = new CallbackCheckPositon() {
		
		@Override
		public void checkPosition(int x, int y) {
			// TODO Auto-generated method stub
			System.out.println(name + "�ݹ� ���� �� x :" +  x);
			System.out.println(name + "�ݹ� ���� �� x :" +  y);
			
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
