package aaa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyframe implements ActionListener {
	
	

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;

	final int MAX_COUNT = 7;
	ArrayList<JButton> buttons = new ArrayList<>();
//	JButton[] buttons = new JButton[7];
	String[] ColorName = {"빨간색","주황색","노란색","초록색","파란색","마젠타","핑크색"};


	
//	JButton button1;
//	JButton button2;
//	JButton button3;
//	JButton button4;
//	JButton button5;
//	JButton button6;
//	JButton button7;

	public ColorChangeFrame() {

		initData();
		setInitLayout();
		addEventListener();

		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initData() {
		// TODO Auto-generated method stub
		super.initData();
		setTitle("이벤트 리스너 연습3");
		setSize(500, 500);
		borderLayout = new BorderLayout();
		panel1 = new JPanel();
		panel2 = new JPanel();

		for (int i = 0; i < MAX_COUNT; i++) {
			
			buttons.add(new JButton(ColorName[i]));
			
		}
		
//		for (int i = 0; i < buttons.length; i++) {
//			buttons[i] = new JButton(ColorName[i]);
//		}
//		

//		button1 = new JButton("빨간색");
//		button2 = new JButton("주황색");
//		button3 = new JButton("노란색");
//		button4 = new JButton("초록색");
//		button5 = new JButton("파란색");
//		button6 = new JButton("마젠타");
//		button7 = new JButton("핑크색");
		
	}

	@Override
	protected void setInitLayout() {
		// TODO Auto-generated method stub
		super.setInitLayout();
		setLayout(borderLayout);

		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));
		add(panel1, BorderLayout.NORTH);

		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2);
	
		for (int i = 0; i < MAX_COUNT; i++) {
				
			panel2.add(buttons.get(i));
		}
		
//		for (int i = 0; i < buttons.length; i++) {
//			
//			panel2.add(buttons[i]);
//			
//		}
	
//		panel2.add(button1);
//		panel2.add(button2);
//		panel2.add(button3);
//		panel2.add(button4);
//		panel2.add(button5);
//		panel2.add(button6);
//		panel2.add(button7);

	}

	@Override
	protected void addEventListener() {
		// TODO Auto-generated method stub
		super.addEventListener();
		

		for (int i = 0; i < MAX_COUNT; i++) {
			
			buttons.get(i).addActionListener(this);
		}
		
//		for (int i = 0; i < MAX_COUNT; i++) {
//			
//			buttons[i].addActionListener(this);
//			
//		}

//		button1.addActionListener(this);
//		button2.addActionListener(this);
//		button3.addActionListener(this);
//		button4.addActionListener(this);
//		button5.addActionListener(this);
//		button6.addActionListener(this);
//		button7.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		if (clickedButton.getText().equals(buttons.get(0).getText())) {
			System.out.println("빨간색으로 변경");
			panel1.setBackground(Color.red);

		} else if (clickedButton.getText().equals(buttons.get(1).getText())) {

			System.out.println("주확색으로 변경");
			panel1.setBackground(Color.orange);
		} else if (clickedButton.getText().equals(buttons.get(2).getText())) {
			System.out.println("노란색으로 변경");
			panel1.setBackground(Color.yellow);

		} else if (clickedButton.getText().equals(buttons.get(3).getText())) {
			System.out.println("초록색으로 변경");
			panel1.setBackground(Color.green);
		} else if (clickedButton.getText().equals(buttons.get(4).getText())) {
			System.out.println("파란색으로 변경");
			panel1.setBackground(Color.blue);
		} else if (clickedButton.getText().equals(buttons.get(5).getText())) {
			System.out.println("마젠타색으로 변경");
			panel1.setBackground(Color.magenta);
		}else {
			System.out.println("핑크색으로 변경");
			panel1.setBackground(Color.pink);
		}
		
	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}

}
