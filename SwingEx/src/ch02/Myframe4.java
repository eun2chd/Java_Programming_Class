package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe4 extends JFrame {
	
	JButton button;
	JButton button2;
	
	// �ڵ� ����
	// 1 button 2 ����
	// 2 add , 
	// �̺�Ʈ ������ ��� -- �͸� ���� ��ü�� ����ؼ� ó��
	
	public Myframe4() {
		initData();
		setInitLayout();
		addEventListner();
	}
	
	private void initData() {
		
		setTitle("�͸�����ü����غ���");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("�̺�Ʈ ��� �� ���");
		button2 = new JButton("��ư2");
		
		
	}
	private void setInitLayout() {
	
		setVisible(true);
		add(button,BorderLayout.NORTH);
		add(button2,BorderLayout.SOUTH);
		

	}
	
	private void addEventListner() {
		
	
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ư�� Ŭ���Ǿ����ϴ�.");
				System.out.println("���м�");
			}
		});
		
		
		
	}
	
	
	
//	private void addEventListner() {
//	
//		// �͸� ���� ��ü �ʹ����� implements �� ����Ͽ� ���� �ϸ� �ڵ尡 �ʹ� �����
//		// ��ȸ���� �������̽��� �͸� ���� ��ü�� ����� ����� �� �ִ�.
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("��ư�� Ŭ�� �Ǿ����ϴ�.");
//			}
//			
//		});
//		
//		
//		button2.addActionListener(new ActionListener() {
//			
//			
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("�ι�° ��ư�� Ŭ���Ǿ����ϴ�.");
//			
//			}
//			
//			
//		});
//		
//			
//		
		
		
//		button.addActionListener(new ActionListener() {
//			
//			// �߻�޼��带 �Ϲ� �޼���� ���� �ߴ�.
//			public void actionPerformed(ActionEvent e); {
//						
//			}
//			
//		});
//		
		
//	}
	
	
	public static void main(String[] args) {
		
		Myframe4 mf = new Myframe4();
		
//		new Myframe4();
		
		// �͸� Ŭ����(�ν��Ͻ� ������ ���� ������ ���������� �����ؼ� ����� ���� ����.
		
		mf.button.setText("�ȳ��ϼ���");
		
	}
}
