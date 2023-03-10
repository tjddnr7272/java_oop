package ezen.ams;


/**
 * 은행 계좌 관리(등록,수정,삭제,검색)를 위한 명세(규약)
 * @author 김성욱
 * @Date   2023. 1. 9.
 */
public interface AccountRepository {
	
	/** 전체 계좌 개수 반환*/
	public int getCount();
	
	/**  계좌 등록*/
	public void addAccount(Account account);
	
	/**  전체 계좌 조회*/
	public Account[] getAccounts();
	
	/**  계좌번호로 계좌 검색*/
	public Account findByNumber(String number);

	/**  계좌번호로 계좌 삭제*/
	public boolean removeAccount(String number);
 
	
}
