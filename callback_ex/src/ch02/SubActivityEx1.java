package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// �ݸ� (ȣ����)
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
	
		
		btnadd = new JButton("���ϱ�");
		btnmultiply = new JButton("���ϱ�");
		btnminus = new JButton("����");
		
		
		
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
			System.out.println("���ϱ� ��ư Ŭ��");
		}else if(targetBtn == btnmultiply) {
			System.out.println("���ϱ� ��ư Ŭ��");
		}else if(targetBtn == btnminus) {
			System.out.println("���̳ʽ� ��ư Ŭ��");
		}
		
		
	}
	

}
