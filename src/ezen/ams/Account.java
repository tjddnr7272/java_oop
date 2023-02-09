package ezen.ams;
/**
 * @author 김성욱
 * 현실세계의 객체를 프로그램으로 표현하기
 * 은행계좌 추상화
 * 객체 추상화
 * *객체지향 프로그래밍의 4대 특징
 * 1.추상화, 2.캡슐화, 3.상속,4다향성
 */

public class Account {
   //은행이름 (상수)
   public final static String BANK_NAME = "EZEN_BANK";
   
   //객체의 속성(정보)들을 저장하기 위한 변수 선언 = 필드

   //인스턴스 변수들

   //필드에 선언할 수 있는 접근제한자: private,생략(default),protected,public

   //캡슐화(은닉화)

   private String accountNumber;

   private String accountOwner;

   private int password;

   private long restMoney;

   //해당클래스에서만 보여질 수 있게 함




   //매개변수가 없는 default 생성자

   //생성자 오버로딩(overloading): 중복정의


   public Account() {

//   this.accountNumber = null;

//   this.accountOwner = null;

//   this.password = 0;

//   this.restMoney = 0L;
      
   this(null, null);

   }


   public Account(String accountNumber, String accountOwner){

//   this.accountNumber = accountNumber;

//   this.accountOwner = accountOwner;
      
//   this.password = 0;

//   this.restMoney = 0L;

   this(accountNumber,accountOwner, 0,0L );
   }




   //매개변수

   public Account(String accountNumber, String accountOwner, int passwd, long money) {

   this.accountNumber = accountNumber;

   //인스턴스변수

   this.accountOwner = accountOwner;

   this.password = passwd;

   this.restMoney = money;

   }




   //완벽한 캡슐화를 위해 setter/getter 메소드 정의


   //카멜기법을 활용해줘서 A를 대문자로 바꿔줘야함



   public long deposit(long money) {

   restMoney += money;

   return restMoney;

   }


   public String getAccountNumber() {

   return accountNumber;

   }

   public void setAccountNumber(String accountNumber) {

   this.accountNumber = accountNumber;

   }

   public String getAccountOwner() {

   return accountOwner;

   }

   public void setAccountOwner(String accountOwner) {

   this.accountOwner = accountOwner;

   }

   public int getPassword() {

   return password;

   }

   public void setPassword(int password) {

   this.password = password;

   }

   public  long getRestMoney() {

   return restMoney;

   }

   public void setRestMoney(long restMoney) {

   this.restMoney = restMoney;

   }







   //객체의 행위(동작)을 정의하기 위한 인스턴스 메소드들

   //입금가능

   //출금기능

   public long withdraw(long money) throws NotSufficientBalanceException{
	   if(money <= 0) {
		 throw new NotSufficientBalanceException("출금금액은 음수일수 없습니다..",100);   
	   }
	   
	   
	   
	   
	   
	   if(money > restMoney) {
	      //예외를 개발자가 발생시킴..
		  throw new NotSufficientBalanceException("잔액이 부족합니다..",100);
	   }
	   

   restMoney -= money;

   return restMoney;

   }



   //잔액조회기능

   //public long getRestMoney(){

   //return restMoney;

   //}



   //비밀번호 확인 기능

   public boolean checkPassword(int passwd) {

   return password == passwd;

   }
   
   //모든 정보 출력기능
    public String toString() {
   return accountNumber +"\t" +accountOwner + "\t" + "****" + "\t"+restMoney;   
    }
    
    @Override
    	public boolean equals(Object obj) {
    	if(! (obj instanceof Account)) {
    		return false;
    	}
   Account account = (Account)obj;
    	if(account.toString().equals(toString())) {
    		return true;
    	}
    	return false;
    }


	public Object getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

    	
//    	String accNumber = account.getAccountNumber();
//    	if(accountNumber.equals(accNumber)){
//    		String accOwner = account.getAccountOwner();
//    		if(accOwner.equals(accountOwner)) {
//    			int passwd = account.getPassword();   //기본타입은 비교할떄 ==로 비교함
//    			if(passwd == password) {
//    				long money = account.getRestMoney();
//    				if(money == restMoney) {
//    					return true;
//    				}
//    				
//    			}
//    			
//    		}
//    	}
//    	
//    	
//    	
//    	
    	
    
    
    
    
    

}