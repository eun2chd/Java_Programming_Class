package ex1;

public class Wrrior {
	
	private int WarLevel; // ������ ����
	private int WarSkilPower;  // ������ ���ݷ�
	private int WarHp;   // ü�� -
	private int WarMp;  // ����
	private String WarName; // �г���
	private String WarSkilname;  // ��ų�̸�
	private int warTmpHp;
	
	
	
	
  
	// hp �����ִ� get 
	public int getWarHp() {
			
		return this.WarHp;
		
} // end of gettHp
	//hp �� �����ϴ� set
	public void setWarHp(int HP) {
	
		if(HP < 0) {
			
			System.out.println("0 ���� ū ���ڸ� �Է��ϼ���");
			
		}else {	
		
			this.WarHp = HP;
			this.warTmpHp = this.WarHp;

		}
	} // end of sethp
	
	// Mp �����ִ� get
	public int getWarMp() {
		
		return this.WarMp;
		
} // end of gettMP
	
	
	//Mp �� �����ϴ� set	
	public void setWarMp(int Mp) {
	
		if(Mp < 0) {
			
			System.out.println("0 ���� ū ���ڸ� �Է��ϼ���");
			
		}else {	
		
			this.WarMp = Mp;
		
		}
	}// end of settMP
	
//	Level �����ִ� get
	public int getWarLevle() {
		
		return this.WarLevel;
		
} // end of gettMP
	
	
	//Level �� �����ϴ� set	
	public void setWarLevel(int Level) {
	
		if(Level < 10) {
			
			System.out.println("ó������ ������ 10�̻��Դϴ�.");
			
		}else {	
		
			this.WarLevel = Level;
		
		}
	}// end of setLevel
	
	
	//SkilPower �� �����ִ� set	
	public int getWarSkilPower() {
		
		return this.WarSkilPower;
		
} // end of gettMP
	
	
	//SkilPower �� �����ϴ� set	
	public void setWarSkilPower(int SkilPower) {
	
		if(SkilPower < 100) {
			
			System.out.println("��ų���ݷ��� 100 �̻� �Է����ּ���.");
			
		}else {	
		
			this.WarSkilPower = SkilPower;
		
		}
	}// end of SkilPower
	
	
	
	//SkilName �� �����ִ� set	
	public String getWarSkilName() {
		
		return this.WarSkilname;
		
} // end of SkilNam
	
	
	//SkilName �� �����ϴ� set	
	public void setSkilName(String SkilName) {
	
		if(SkilName.length() < 2) {
			
			System.out.println("��ų�̸��� �α��� �̻��Դϴ�.");
			
		}else {	
		
			this.WarSkilname  = SkilName;
		
		}
	}// end of SkilNam
	
	
	
	//WarName �� �����ִ� set	
	public String getWarName() {
		
		return this.WarName;
		
} // end of gettMP
	
	
	//WarName �� �����ϴ� set	
	public void setWarName(String WarName) {
	
		if(WarName.length() < 2) {
			
			System.out.println("�г����� �α��� �̻��Դϴ�.");
			
		}else {	
		
			this.WarName  = WarName;
		
		}
	}// end of WarName
	
	
	// ���� ���� ���  
	public void WarFightInfo(Wizard wiz) {
		
		
		System.out.println("---���� ���� ����---");
		System.out.println(wiz.getWizName() + "�Կ��� ��ų���� " + wiz.getWizSkilName() + "�� �¾ҽ��ϴ�.");
		System.out.println(wiz.getWizName()+"���� ������" + wiz.getWizSkilPower());
		System.out.println(WarName+ "���� ü�� : " + warTmpHp);
		System.out.println(WarName+ "�� ���� ü�� : "  + this.WarHp);
		System.out.println("---------------");
		System.out.println();
		
	}
	
	
    // ������ ���� �¾�������
	public void setWarHit(int WarHitDamage) {
		
		this.WarHp -= WarHitDamage;
	
		if(WarHp< 0) // hp�� 0���� �۾����� -������ �������°� ���� 0���� �ʱ�ȭ
		{
			this.WarHp= 0;
		}
		
		

	
		
	}
	


	

	
	
}
