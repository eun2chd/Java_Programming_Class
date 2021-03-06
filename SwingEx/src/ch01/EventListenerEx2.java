package ch01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Myframe2 extends SuperMyframe implements ActionListener {

	final int MAX_COUNT = 5;

//	ArrayList<JButton> buttons = new ArrayList<>();

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	
	Color[] colors = new Color[5];

	public Myframe2() {
		// TODO Auto-generated constructor stub

		initData();
		setInitLayout();
		addEventListener();

	}

	@Override
	protected void initData() {
		// TODO Auto-generated method stub

		setTitle("이벤트 리스너 연습2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

//		for (int i = 0; i < MAX_COUNT; i++) {
//			buttons.add(new JButton("이벤트 버튼" + (i+1)));
//		}

		button1 = new JButton("이벤트 버튼1");
		button2 = new JButton("이벤트 버튼2");
		button3 = new JButton("이벤트 버튼3");
		button4 = new JButton("이벤트 버튼4");
		button5 = new JButton("이벤트 버튼5");
	}

	@Override
	protected void setInitLayout() {

		setVisible(true);
		setLayout(new FlowLayout());

//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);

		super.setInitLayout();
	}

	@Override
	protected void addEventListener() {

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("버튼이 눌러졌습니다.");
		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		if (clickedButton.getText().equals(button1.getText())) {
			System.out.println("1번 버튼이 클릭되었습니다.");

		} else if (clickedButton.getText().equals(button2.getText())) {

			System.out.println("2번 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button3.getText())) {

			System.out.println("3번 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button4.getText())) {

			System.out.println("4번 버튼이 클릭되었습니다.");
		} else {

			System.out.println("5번 버튼이 클릭되었습니다.");

		}

	}
}

public class EventListenerEx2 {
	public static void main(String[] args) {
		new Myframe2();

	}
}
