package oop;




/**
 * call by Value vs Call by reference
 * @author 김성욱
 *
 */
public class CallMethodExample {
    
	   public static void doTask(int x) {
	      x += 10;
	      System.out.println(x);
	 }
	   public static void doTask2(Account account) {
	      account.deposit(10000);
	      System.out.println(account.getRestMoney());
	      
	   }
	   
	  
	   
	   public static void main(String[] args) {
	      int i = 100;
	      //Call by Value (doTask를 호출할때 i 에 든 100 값을 복사해서 전달한다)
	      doTask(i);
	      System.out.println(i);
	      
	      Account account = new Account("1111-2222","김성욱",1234,100000);
	      doTask2(account);
	         
	      System.out.println(account.getRestMoney());
	   }
	 
	   
	}