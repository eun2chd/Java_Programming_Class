package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Myframe7 extends JFrame{
	
	final int KEY_UP = 38;
	final int KEY_DOWN = 40;
	final int KEY_LEFT = 37;
	final int KEY_RIGHT = 39;
	
	
	
	JTextArea area;
	
	public Myframe7() {

		initData();
		setInitLayout();
		addEventListener();
		
	}
	
	

	private void initData() {

		setTitle("Ű �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		area = new JTextArea();
		

	}

	private void setInitLayout() {

		setVisible(true);
		this.add(area);
		
	}

	private void addEventListener() {

//		area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
		
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KEY_UP) {
					
					System.out.println("���� ����Ű");
					area.append("���ʹ���Ű\n");
					
				}else if(e.getKeyCode() == KEY_DOWN) {
					System.out.println("�Ʒ��� ����Ű");
					area.append("�Ʒ��� ����Ű\n");
			
				}else if(e.getKeyCode() == KEY_LEFT) {
					System.out.println("���� ����Ű");
					area.append("���� ����Ű\n");
			
				}else if(e.getKeyCode() == KEY_RIGHT) {
					System.out.println("������ ����Ű");
					area.append("������ ����Ű\n");
				}

				
			
			}
			
		
		});

	}


	// ���ڸ� �������� ȣ��, ����Ű���� ���� �մϴ�.
	 
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("keyTyped : " + e.getID());
//
//		
//	}


	// Ű���带 �������� ȣ��, ��� Ű���忡 ����
//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("KeyEvent : " + e.getID());
//		e.getKeyCode();
//		
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");
//		area.append(e.getKeyCode() + "\n");
	
		
		
	}



//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}


//	// Ű���带 ���� ��, ��� Ű���忡 ���� �մϴ�.
//	@Override
//	public void keyReleased(KeyEvent e) {
//		System.out.println("KeyEvent : " + e.getID());
//
//		// TODO Auto-generated method stub
//		
//	}

//
