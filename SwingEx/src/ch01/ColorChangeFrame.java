package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyframe implements ActionListener {

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;

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

		button1 = new JButton("빨간색");
		button2 = new JButton("노란색");
		button3 = new JButton("파란색");
		button4 = new JButton("초록색");
		button5 = new JButton("주황색");

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

		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

	}

	@Override
	protected void addEventListener() {
		// TODO Auto-generated method stub
		super.addEventListener();

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		if (clickedButton.getText().equals(button1.getText())) {
			System.out.println("빨간색으로 변경");
			panel1.setBackground(Color.red);

		} else if (clickedButton.getText().equals(button2.getText())) {

			System.out.println("노란색으로 변경");
			panel1.setBackground(Color.yellow);
		} else if (clickedButton.getText().equals(button3.getText())) {
			System.out.println("파란색으로 변경");
			panel1.setBackground(Color.blue);

		} else if (clickedButton.getText().equals(button4.getText())) {
			System.out.println("초록색으로 변경");
			panel1.setBackground(Color.green);
		} else {
			System.out.println("주황색으로 변경");
			panel1.setBackground(Color.orange);
		}
		
	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}

}
