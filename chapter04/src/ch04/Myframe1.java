package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Myframe1 extends JFrame {

	Mypanel mypanel;

	public Myframe1() {
		// TODO Auto-generated constructor stub
		initData();
		setInitLayout();

	}

	public void initData() {

		setTitle("java 2D Test");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(600, 600);
		mypanel = new Mypanel();

	}

	public void setInitLayout() {

		setVisible(true);
		add(mypanel);

	}

	// 내부 클래스

	// 내부 클래스 , static (정적 내부 클래스) (인스턴스, 내부 클래스)
	static class Mypanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);

//			g.drawLine(20,30,100,100); // 선을 긋다 x축 y축
//			g.drawRect(100,100,150,150);

//			g.drawString("myHouse", 150 , 90);
//			g.drawLine(100,100,180,50);
//			g.drawLine(250,100,180,50);
//			g.drawRect(100,100,150,150);
//			g.drawRect(180,170,50,80);

			g.drawLine(300, 100, 200, 200);
			g.drawRect(200, 200, 200, 200);
			g.drawLine(300, 100, 400, 200);

		}

	} // end of jpanel

	// 메인함수 작성
	public static void main(String[] args) {

		new Myframe1();

	} // end of main

} // end of jframe
