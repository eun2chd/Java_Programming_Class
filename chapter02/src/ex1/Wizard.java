package ex1;

public class Wizard {
	
	// �ٸ缭 ����â�� �����ִ� ������ ����� �ּ���
	// getter �� setter �� ������ּ���	
	// get , set
	
	private int WizLevel; // ������ ����
	private int WizSkilPower;  // ������ ���ݷ�
	private int WizHp;   // ü�� -
	private int WizMp;  // ����
	private String WizName; // �г���
	private String WizSkilname;  // ��ų�̸�
	private int WizTmpHp;  // ���� ü�°��� ����
	
	
	
	
  
	// hp �����ִ� get 
	public int getWizHp() {
			
		return this.WizHp;
		
} // end of gettHp
	
	
	//hp �� �����ϴ� set
	public void setWizHp(int HP) {
	
		if(HP < 0) {
			
			System.out.println("0 ���� ū ���ڸ� �Է��ϼ���");
			
		}else {	
		
			this.WizHp = HP;
			this.WizTmpHp = this.WizHp;  // wizhp �� �������� �ޱ��� ü�°� ����
		
		}
	} // end of sethp
	
	// Mp �����ִ� get
	public int getWizMp() {
		
		return this.WizMp;
		
} // end of gettMP
	
	
	//Mp �� �����ϴ� set	
	public void setWizMp(int Mp) {
	
		if(Mp < 0) {
			
			System.out.println("0 ���� ū ���ڸ� �Է��ϼ���");
			
		}else {	
		
			this.WizMp = Mp;
		
		}
	}// end of settMP
	
//	Level �����ִ� get
	public int getWizLevle() {
		
		return this.WizLevel;
		
} // end of gettMP
	
	
	//Level �� �����ϴ� set	
	public void setWizLevel(int Level) {
	
		if(Level < 10) {
			
			System.out.println("ó������ ������ 10�̻��Դϴ�.");
			
		}else {	
		
			this.WizLevel = Level;
		
		}
	}// end of setLevel
	
	
	//SkilPower �� �����ִ� set	
	public int getWizSkilPower() {
		
		return this.WizSkilPower;
		
} // end of gettMP
	
	
	//SkilPower �� �����ϴ� set	
	public void setWizSkilPower(int SkilPower) {
	
		if(SkilPower < 100) {
			
			System.out.println("��ų���ݷ��� 100 �̻� �Է����ּ���.");
			
		}else {	
		
			this.WizSkilPower = SkilPower;
		
		}
	}// end of SkilPower
	
	
	
	//SkilName �� �����ִ� set	
	public String getWizSkilName() {
		
		return this.WizSkilname;
		
} // end of SkilName
	
	
	//SkilName �� �����ϴ� set	
	public void setSkilName(String SkilName) {
	
		if(SkilName.length() < 2) {
			
			System.out.println("��ų�̸��� �α��� �̻��Դϴ�.");
			
		}else {	
		
			this.WizSkilname  = SkilName;
		
		}
	}// end of SkilNam
	
	
	
	//wizName �� �����ִ� set	
	public String getWizName() {
		
		return this.WizName;
		
} // end of gettMP
	
	
	//WizName �� �����ϴ� set	
	public void setWizName(String WizName) {
	
		if(WizName.length() < 2) {
			
			System.out.println("�г����� �α��� �̻��Դϴ�.");
			
		}else {	
		
			this.WizName  = WizName;
		
		}
	}// end of WizName
	


	
	// ���� ���� ���
	
	public void WizFightInfo(Wrrior war) {
		
	
		System.out.println("---������ ���� ����---");
		System.out.println(war.getWarName() + "�Կ��� ��ų���� " + war.getWarSkilName() + "�� �¾ҽ��ϴ�.");
		System.out.println(war.getWarName()+"���� ������ " + war.getWarSkilPower());
		System.out.println(WizName+ "���� ü�� : " + WizTmpHp);
		System.out.println(WizName+ "�� ���� ü�� : "  + WizHp);
	
		System.out.println("---------------");
		System.out.println();
		
	}
	
	
	
	// �������׸¾������� ���� set���� �õ�  
	public  void setWizHit(int WizHitDamage) {
		
		this.WizHp  -= WizHitDamage;
		
		if(this.WizHp < 0) // hp�� 0���� �۾����� -������ �������°� ���� 0���� �ʱ�ȭ
		{
			this.WizHp = 0;
		}	
		
	
		
	}
	

} // end of class
