package ex1;

import java.util.Random;

public class gameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Wizard wiz = new Wizard();
		Wrrior war = new Wrrior();
		
		
		wiz.setWizHp(2000);
		wiz.setWizMp(600);
		wiz.setWizName("���ڸ�");
		wiz.setSkilName("���׿�");
		wiz.setWizLevel(20);
		wiz.setWizSkilPower(800);
		
		war.setWarHp(2000);
		war.setWarMp(600);
		war.setWarName("����11");
		war.setSkilName("������");
		war.setWarLevel(40);
		war.setWarSkilPower(1000);
		
		
		
		int WizHP = wiz.getWizHp();
		int WizMP = wiz.getWizMp();
		int WizSkPower = wiz.getWizSkilPower();
		int WizLevel = wiz.getWizLevle();
		String WizName = wiz.getWizName();
		String WizSkilName = wiz.getWizSkilName();
		
		
		
		
		
		System.out.println("---������ ����---");
		System.out.println("�г��� : " + WizName);
		System.out.println("���� : " + WizLevel);
		System.out.println("���ݷ� : " + WizSkPower);
		System.out.println("HP : " + WizHP);
		System.out.println("MP : "+  WizMP);
		System.err.println("��ų�̸� : " + WizSkilName);
		System.out.println("---------------");
		System.out.println();
		
		
		int WarHP = war.getWarHp();
		int WarMP = war.getWarMp();
		int WarSkPower = war.getWarSkilPower();
		int WarLevel = war.getWarLevle();
		String WarName = war.getWarName();
		String WarSkilName = war.getWarSkilName();
		
		
		System.out.println("---���� ����---");
		System.out.println("�г��� : " + WarName);
		System.out.println("���� : " + WarLevel);
		System.out.println("���ݷ� : " + WarSkPower);
		System.out.println("HP : " + WarHP);
		System.out.println("MP : "+  WarMP);
		System.err.println("��ų�̸� : " + WarSkilName);
		System.out.println("---------------");
		System.out.println();
		
		
		wiz.setWizHit(WarSkPower);
		wiz.WizFightInfo(war);
		
		war.setWarHit(WizSkPower);
		war.WarFightInfo(wiz);
		

	
	} // end of main

	private static Random nextInt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

} // end of class
