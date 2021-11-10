package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 콜리 (호출자)
public class SubActivityEx1 extends JFrame implements ActionListener{
	
	JButton btnadd;
	JButton btnminus;
	JButton btnmultiply;
	
	CallbackBtn2 callbackBtn2;

	public SubActivityEx1(CallbackBtn2 callbackbtn) {
		this.callbackBtn2 = callbackbtn;
		// TODO Auto-generated constructor stub
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		btnadd = new JButton("더하기");
		btnmultiply = new JButton("곱하기");
		btnminus = new JButton("빼기");
		
		
		
	}
	private void setInitLayout() {
		
		setVisible(true);
		setLayout(new FlowLayout());
		setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
		add(btnadd);
		add(btnmultiply);
		add(btnminus);
		
		
	}
	

	
	
	private void addEventListener(){
		
		btnadd.addActionListener(this);
		btnmultiply.addActionListener(this);
		btnminus.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == btnadd) {
			System.out.println("더하기 버튼 클릭");
		}else if(targetBtn == btnmultiply) {
			System.out.println("곱하기 버튼 클릭");
		}else if(targetBtn == btnminus) {
			System.out.println("마이너스 버튼 클릭");
		}
		
		
	}
	

}
