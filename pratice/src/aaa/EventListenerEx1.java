package aaa;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class Myframe1 extends JFrame  implements ActionListener{
	
//	JButton[] buttons = new JButton[2];
	final int MAX_NUM = 2;
	ArrayList<JButton> buttons = new ArrayList<>();

	
//	JButton button;
//	JButton button2;
//	
	public Myframe1() {
		// TODO Auto-generated constructor stub
		
		initDate();
		setinitLayout();
		addEventListener();
	}
	
	private void initDate() {
		
		setTitle("�̺�Ʈ ������ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		for (int i = 0; i < MAX_NUM; i++) {
			
			buttons.add(new JButton((i+1) + "��° ��ư"));
			
		}
		
		
//		for (int i = 0; i < buttons.length; i++) {
//				buttons[i] = new JButton((i+1) + "��° ��ư");
//		}
//		
//		button = new JButton("button1");
//		button2 = new JButton("button2");
	}
	
	private void setinitLayout() {
		
		setVisible(true);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < MAX_NUM; i++) {
			
			add(buttons.get(i));
		}
		
//		for (int i = 0; i < buttons.length; i++) {
//			
//				add(buttons[i]);
//		}
		
//		add(button);
//		add(button2);
//		
		
		
	}
	private void addEventListener() {
		
		// ��ư�� �������� ��ϻ�Ȳ

		for (int i = 0; i < MAX_NUM; i++) {
			
		buttons.get(i).addActionListener(this);
		}
		
		
//		for (int i = 0; i < buttons.length; i++) {
//			buttons[i].addActionListener(this);
//		}
//		
//		button.addActionListener(this);
//		button2.addActionListener(this);
//		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�ý��� �ݹ� ����");
		System.out.println("��ư�� Ŭ�� �Ǿ����ϴ�.");

		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}


public class EventListenerEx1 {
	
	public static void main(String[] args) {
		
		new Myframe1();
		
			
	}

}
