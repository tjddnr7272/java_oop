package oop;

/**
 * Account 클래스를 상속받는 마이너스 계좌  
 * @author 김성욱
 * @Date   2023. 1. 4.
 */
public class MinusAccount extends Account {
	// 새롭게 추가된 속성
	private long borrowMoney;
	private String borrowDate;
	
	
	public MinusAccount() {
		super();            //super 안만들어 놓아도 됨
	}


	public MinusAccount(String accountNumber, String accountOwner, int passwd, long money, long borrowMoney,
			String borrowDate) {
		super(accountNumber, accountOwner, passwd, money);
		this.borrowMoney = borrowMoney;
		this.borrowDate = borrowDate;
	}


	public long getBorrowMoney() {
		return borrowMoney;
	}


	public void setBorrowMoney(long borrowMoney) {
		this.borrowMoney = borrowMoney;
	}


	public String getBorrowDate() {
		return borrowDate;
	}


	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	} 
 
	
	// 잔액(restMoney - borrowMoney) 재정의(Overriding)
	
	public long getRestMoney() {                       //부모Account 에서 복붙 후 수정,private 이기 때문에 게터세터로 받아와야함
         return super.getRestMoney() - borrowMoney; 
		 
		   }
	
	
           //@Override
        public String toString() {
        	return super.toString() + "\t" + borrowMoney + "\t" + borrowDate;
        }	
	
	
	
	

}
