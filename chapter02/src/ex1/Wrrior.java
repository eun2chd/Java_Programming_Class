package ex1;

public class Wrrior {
	
	private int WarLevel; // 마법사 레벨
	private int WarSkilPower;  // 마법사 공격력
	private int WarHp;   // 체력 -
	private int WarMp;  // 마나
	private String WarName; // 닉네임
	private String WarSkilname;  // 스킬이름
	private int warTmpHp;
	
	
	
	
  
	// hp 볼수있는 get 
	public int getWarHp() {
			
		return this.WarHp;
		
} // end of gettHp
	//hp 를 변경하는 set
	public void setWarHp(int HP) {
	
		if(HP < 0) {
			
			System.out.println("0 보다 큰 숫자를 입력하세요");
			
		}else {	
		
			this.WarHp = HP;
			this.warTmpHp = this.WarHp;

		}
	} // end of sethp
	
	// Mp 볼수있는 get
	public int getWarMp() {
		
		return this.WarMp;
		
} // end of gettMP
	
	
	//Mp 를 변경하는 set	
	public void setWarMp(int Mp) {
	
		if(Mp < 0) {
			
			System.out.println("0 보다 큰 숫자를 입력하세요");
			
		}else {	
		
			this.WarMp = Mp;
		
		}
	}// end of settMP
	
//	Level 볼수있는 get
	public int getWarLevle() {
		
		return this.WarLevel;
		
} // end of gettMP
	
	
	//Level 를 변경하는 set	
	public void setWarLevel(int Level) {
	
		if(Level < 10) {
			
			System.out.println("처음설정 레벨은 10이상입니다.");
			
		}else {	
		
			this.WarLevel = Level;
		
		}
	}// end of setLevel
	
	
	//SkilPower 를 볼수있는 set	
	public int getWarSkilPower() {
		
		return this.WarSkilPower;
		
} // end of gettMP
	
	
	//SkilPower 를 변경하는 set	
	public void setWarSkilPower(int SkilPower) {
	
		if(SkilPower < 100) {
			
			System.out.println("스킬공격력은 100 이상 입력해주세요.");
			
		}else {	
		
			this.WarSkilPower = SkilPower;
		
		}
	}// end of SkilPower
	
	
	
	//SkilName 를 볼수있는 set	
	public String getWarSkilName() {
		
		return this.WarSkilname;
		
} // end of SkilNam
	
	
	//SkilName 을 변경하는 set	
	public void setSkilName(String SkilName) {
	
		if(SkilName.length() < 2) {
			
			System.out.println("스킬이름은 두글자 이상입니다.");
			
		}else {	
		
			this.WarSkilname  = SkilName;
		
		}
	}// end of SkilNam
	
	
	
	//WarName 를 볼수있는 set	
	public String getWarName() {
		
		return this.WarName;
		
} // end of gettMP
	
	
	//WarName 을 변경하는 set	
	public void setWarName(String WarName) {
	
		if(WarName.length() < 2) {
			
			System.out.println("닉네임은 두글자 이상입니다.");
			
		}else {	
		
			this.WarName  = WarName;
		
		}
	}// end of WarName
	
	
	// 전투 정보 출력  
	public void WarFightInfo(Wizard wiz) {
		
		
		System.out.println("---전사 전투 정보---");
		System.out.println(wiz.getWizName() + "님에게 스킬공격 " + wiz.getWizSkilName() + "를 맞았습니다.");
		System.out.println(wiz.getWizName()+"님의 데미지" + wiz.getWizSkilPower());
		System.out.println(WarName+ "원래 체력 : " + warTmpHp);
		System.out.println(WarName+ "님 남은 체력 : "  + this.WarHp);
		System.out.println("---------------");
		System.out.println();
		
	}
	
	
    // 마법사 한테 맞았응ㄹ때
	public void setWarHit(int WarHitDamage) {
		
		this.WarHp -= WarHitDamage;
	
		if(WarHp< 0) // hp가 0보다 작아지면 -값으로 떨어지는거 방지 0으로 초기화
		{
			this.WarHp= 0;
		}
		
		

	
		
	}
	


	

	
	
}
