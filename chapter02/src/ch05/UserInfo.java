package ch05;

public class UserInfo {
	
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String userNumber;
	
	
	
	
	
	
	
	public UserInfo(String userId, String userPassWord) {
		super();
		this.userId = userId;
		this.userPassWord = userPassWord;
	}



	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String userNumber) {
		super();
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userNumber = userNumber;
	}





	
	
	// 생성자 오버로딩
	// 중요! 생성자는 객체가 생성될때 처음 실행되는 코드
	
	
	
	
	
//	public UserInfo() { // 기본
//		
//		
//	}
//	
//	public UserInfo(String userId) {
//		
//		this.userId = userId;
//		
//		
//	}
//
//	
//	public UserInfo(String userId,String userPassWord) { // id pw
//		
//		this.userId = userId;
//		this.userPassWord = userPassWord;
//		System.out.println("ID : " + userId + "\nPW : " + userPassWord);
//		
//	}
//	
//	public UserInfo(String userId, String userPassWord, String userName) {   // id pw name
//		
//		this.userId = userId;
//		this.userPassWord = userPassWord;
//		this.userName = userName;
//		
//		
//	}
//    public UserInfo(String userId, String userPassWord, String userName,String userAddress) {   // id pw name useraddress
//		
//    	this.userId = userId;
//		this.userPassWord = userPassWord;
//		this.userName = userName;
//		this.userAddress = userAddress;
//		
//	}
//
//    public UserInfo(String userId, String userPassWord, String userName,String userAddress, String userNumbe) {   // id pw name useraddress
//    	
//    	this.userId = userId;
//		this.userPassWord = userPassWord;
//		this.userName = userName;
//		this.userAddress = userAddress;
//		this.userNumber = userNumbe;
//	
//}
//	
//	
//    
//    
	
}
