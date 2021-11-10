package ch04;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity2 extends JFrame{
	
	String name;
	JPanel panel;
	CallbackCheckPositon checkPositon;
	
	// �ݸ� : ȣ����
	public Activity2(String name) {
		
		this.name = name;
		// TODO Auto-generated constructor stub
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		
		setVisible(true);
		add(panel);
		panel.setBackground(Color.yellow);
		
		// ���콺 ������ ����
		this.addMouseListener(new MouseAdapter() {
		   
			@Override
			public void mouseClicked(MouseEvent e) {

				int x = e.getX();
				int y = e.getY();
				// ����� �ڵ� �ʿ���
				// todd
				if(checkPositon != null) {
					checkPositon.checkPosition(x, y);
				}
				
			}
		
		});
		
	}
	// �޼��带 ���ؼ� �����ϱ�

	public void setCallbackCheckPositon(CallbackCheckPositon callbackCheckPositon) {
		// ��� ������ �ּҰ��� �����ϴ� ��
		this.checkPositon = callbackCheckPositon;
	}
	
	
	
	
	
	
	
	
	
	
	

}
