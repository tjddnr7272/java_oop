package ezen.ams;

public class NotSufficientBalanceException extends Exception{
	 // String message;
	private int errorCode;
	//Exception의 상속을 받기떄문에 ... message도 같이 받음
	
     public NotSufficientBalanceException() {
    	 this("얘기치 않은 예외가 발생하였습니다..",0);
     }

     public NotSufficientBalanceException(String message, int errorCode) {
    	 super(message);
    	 this.errorCode = errorCode;
     }

	public int getErrorCode() {
		return errorCode;
	}
	
	//문자열로 받기
	  @Override
	public String toString() {
		return  "오류코드 : "+errorCode+", 오류메시지 : " + getMessage();
	}    
     
     
	
}
