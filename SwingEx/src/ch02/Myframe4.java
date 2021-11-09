package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe4 extends JFrame {
	
	JButton button;
	JButton button2;
	
	// 코드 수정
	// 1 button 2 생성
	// 2 add , 
	// 이벤트 리스너 드록 -- 익명 구현 객체를 사용해서 처리
	
	public Myframe4() {
		initData();
		setInitLayout();
		addEventListner();
	}
	
	private void initData() {
		
		setTitle("익명구현객체사용해보기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("이벤트 등록 후 대기");
		button2 = new JButton("버튼2");
		
		
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
				System.out.println("버튼이 클릭되었습니다.");
				System.out.println("구분석");
			}
		});
		
		
		
	}
	
	
	
//	private void addEventListner() {
//	
//		// 익명 구현 객체 너무많은 implements 를 사용하여 구현 하면 코드가 너무 길어짐
//		// 일회성의 인터페이스를 익명 구현 객체로 만들어 사용할 수 있다.
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("버튼이 클릭 되었습니다.");
//			}
//			
//		});
//		
//		
//		button2.addActionListener(new ActionListener() {
//			
//			
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("두번째 버튼이 클릭되었습니다.");
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
//			// 추상메서드를 일반 메서드로 구현 했다.
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
		
		// 익명 클래스(인스턴스 변수가 없기 때문에 지속적으로 접근해서 사용할 수가 없다.
		
		mf.button.setText("안녕하세요");
		
	}
}
