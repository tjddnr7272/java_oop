package ezen.ams;

/**
 * AccountRepository 인터페이스를 구현 클래스
 * @author 김성욱
 * @Date   2023. 1. 9.
 */
public class ArrayAccountRepository implements AccountRepository {
	
	private Account[] accounts; 
	private int count;
	
	public ArrayAccountRepository() { //여러개를 저장할수 있는 저장소
		this (10000);  //밑에꺼 호출 계좌에 10개짜리를 저장하겠다!
		
	}

	public ArrayAccountRepository(int capacity) {
		this.accounts = new Account[capacity];
		
	}
	
	@Override
	public int getCount() {
		return count;
	}
	
	

	@Override
	public void addAccount(Account account) {
		accounts[count++] = account; 

	}

	@Override
	public Account[] getAccounts() {
		
		return accounts;
	}

	@Override
	public Account findByNumber(String number) {
		for (int i = 0; i < count; i++) {
    		String an = accounts[i].getAccountNumber();
			// 동일 계좌번호 여부 확인
    		if(an.equals(number)) {
				return accounts[i];
    		}
    		}
		return null;  
	}

	@Override
	public boolean removeAccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
			//동일 계좌번호 여부 확인
			if(an.equals(number)) {
				for (int j = i; j < count-1; j++) {
					accounts[j] = accounts[j+1];
				
					
				}
				count--;
				return true;
			}
		}
		
		return false;
	}

}
