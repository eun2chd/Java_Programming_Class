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

		setTitle("키 이벤트 연습");
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
					
					System.out.println("위쪽 방향키");
					area.append("위쪽방향키\n");
					
				}else if(e.getKeyCode() == KEY_DOWN) {
					System.out.println("아래쪽 방향키");
					area.append("아래쪽 방향키\n");
			
				}else if(e.getKeyCode() == KEY_LEFT) {
					System.out.println("왼쪽 방향키");
					area.append("왼쪽 방향키\n");
			
				}else if(e.getKeyCode() == KEY_RIGHT) {
					System.out.println("오른쪽 방향키");
					area.append("오른쪽 방향키\n");
				}

				
			
			}
			
		
		});

	}


	// 문자를 눌렀을때 호출, 문자키에만 반응 합니다.
	 
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("keyTyped : " + e.getID());
//
//		
//	}


	// 키보드를 눌렀을때 호출, 모든 키보드에 반응
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


//	// 키보드를 뗏을 때, 모든 키보드에 반응 합니다.
//	@Override
//	public void keyReleased(KeyEvent e) {
//		System.out.println("KeyEvent : " + e.getID());
//
//		// TODO Auto-generated method stub
//		
//	}

//
