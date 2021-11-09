package ex1;

public class Wizard {
	
	// 꾸며서 상태창을 볼수있는 정보를 만들어 주세요
	// getter 과 setter 을 사용해주세요	
	// get , set
	
	private int WizLevel; // 마법사 레벨
	private int WizSkilPower;  // 마법사 공격력
	private int WizHp;   // 체력 -
	private int WizMp;  // 마나
	private String WizName; // 닉네임
	private String WizSkilname;  // 스킬이름
	private int WizTmpHp;  // 원래 체력값을 저장
	
	
	
	
  
	// hp 볼수있는 get 
	public int getWizHp() {
			
		return this.WizHp;
		
} // end of gettHp
	
	
	//hp 를 변경하는 set
	public void setWizHp(int HP) {
	
		if(HP < 0) {
			
			System.out.println("0 보다 큰 숫자를 입력하세요");
			
		}else {	
		
			this.WizHp = HP;
			this.WizTmpHp = this.WizHp;  // wizhp 가 데미지를 받기전 체력값 저장
		
		}
	} // end of sethp
	
	// Mp 볼수있는 get
	public int getWizMp() {
		
		return this.WizMp;
		
} // end of gettMP
	
	
	//Mp 를 변경하는 set	
	public void setWizMp(int Mp) {
	
		if(Mp < 0) {
			
			System.out.println("0 보다 큰 숫자를 입력하세요");
			
		}else {	
		
			this.WizMp = Mp;
		
		}
	}// end of settMP
	
//	Level 볼수있는 get
	public int getWizLevle() {
		
		return this.WizLevel;
		
} // end of gettMP
	
	
	//Level 를 변경하는 set	
	public void setWizLevel(int Level) {
	
		if(Level < 10) {
			
			System.out.println("처음설정 레벨은 10이상입니다.");
			
		}else {	
		
			this.WizLevel = Level;
		
		}
	}// end of setLevel
	
	
	//SkilPower 를 볼수있는 set	
	public int getWizSkilPower() {
		
		return this.WizSkilPower;
		
} // end of gettMP
	
	
	//SkilPower 를 변경하는 set	
	public void setWizSkilPower(int SkilPower) {
	
		if(SkilPower < 100) {
			
			System.out.println("스킬공격력은 100 이상 입력해주세요.");
			
		}else {	
		
			this.WizSkilPower = SkilPower;
		
		}
	}// end of SkilPower
	
	
	
	//SkilName 를 볼수있는 set	
	public String getWizSkilName() {
		
		return this.WizSkilname;
		
} // end of SkilName
	
	
	//SkilName 을 변경하는 set	
	public void setSkilName(String SkilName) {
	
		if(SkilName.length() < 2) {
			
			System.out.println("스킬이름은 두글자 이상입니다.");
			
		}else {	
		
			this.WizSkilname  = SkilName;
		
		}
	}// end of SkilNam
	
	
	
	//wizName 를 볼수있는 set	
	public String getWizName() {
		
		return this.WizName;
		
} // end of gettMP
	
	
	//WizName 을 변경하는 set	
	public void setWizName(String WizName) {
	
		if(WizName.length() < 2) {
			
			System.out.println("닉네임은 두글자 이상입니다.");
			
		}else {	
		
			this.WizName  = WizName;
		
		}
	}// end of WizName
	


	
	// 전투 정보 출력
	
	public void WizFightInfo(Wrrior war) {
		
	
		System.out.println("---마법사 전투 정보---");
		System.out.println(war.getWarName() + "님에게 스킬공격 " + war.getWarSkilName() + "를 맞았습니다.");
		System.out.println(war.getWarName()+"님의 데미지 " + war.getWarSkilPower());
		System.out.println(WizName+ "원래 체력 : " + WizTmpHp);
		System.out.println(WizName+ "님 남은 체력 : "  + WizHp);
	
		System.out.println("---------------");
		System.out.println();
		
	}
	
	
	
	// 전사한테맞았을때를 구현 set으로 시도  
	public  void setWizHit(int WizHitDamage) {
		
		this.WizHp  -= WizHitDamage;
		
		if(this.WizHp < 0) // hp가 0보다 작아지면 -값으로 떨어지는거 방지 0으로 초기화
		{
			this.WizHp = 0;
		}	
		
	
		
	}
	

} // end of class
