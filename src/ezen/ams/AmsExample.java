package ezen.ams;


public class AmsExample {

	public static void main(String[] args) {
		System.out.println("애플리케이션 시작됨");
		AccountRepository repository = new ArrayAccountRepository(1000); //다형성
//		AccountRepository repository = new FileAccountRepository();  //리모콘 바꾸기
		
        //신규계좌 등록
		Account account = new Account ("1111-2222-3333", "홍길동", 1234, 100000);
		repository.addAccount(account);
		System.out.println("신규계좌 등록 완료!");
        repository.addAccount(new Account("2222-3333-4444", "박지성", 1111, 1000));
        System.out.println("신규계좌 등록 완료!");
        repository.addAccount(new MinusAccount("3333-4444-5555", "김대출", 1111, 10000,10000000,"2023.2.9"));
		System.out.println("신규계좌 등록 완료!");
		
		// 전체계좌 조회
		Account[] list = repository.getAccounts();  //Account[]안에 마이너스도 포함
		for (int i = 0; i < repository.getCount(); i++) {
			Account acc = list[i];
//			System.out.println(acc()); 
			System.out.println(acc.toString()); 
	
		}
		
		// 계좌 이름으로 계좌 검색
		Account findAccount = repository.findByNumber("1111-2222-3333");
		if(findAccount != null) {
			
			try {
				findAccount.withdraw(100000000);
				findAccount.withdraw(-10000);
			} catch (NotSufficientBalanceException e) {
              // 사용자에게 요류메시지 출력
//				System.out.println(e.getMessage());// 오류메시지만 실행!
				System.out.println(e.toString());// 오류코드까지 실행! 
			}
			
			System.out.println(findAccount);
		}else {
			System.out.println("검색된 계좌가 존재하지 않습니다.");
		}

		System.out.println("애플리케이션 종료됨");
		
		

	}

}
