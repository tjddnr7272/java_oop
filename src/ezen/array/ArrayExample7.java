package ezen.array;

import java.util.Scanner;

import oop.Account;

/**
 * @author 김성욱
 * 배열을 이용한 은행 계좌 목록 관리
 */
public class ArrayExample7 {
         public static void main(String[] args) {

             Account[] accounts = new Account[10]; //Account 를 담는 계란판 생성.. Account가 oop폴더에 있어서 임포트 생성해야됨! > 컨+시+엠
             int index = 0;  //0으로 초기화
             
             // 계좌 개설
            Account account1 = new Account("1111-2222", "김성욱" ,1111, 100000);  //아직 account1이 accounts에 안담김
            System.out.println(account1.toString());       //제공하는 기능 사용
            // 배열에 계좌 등록
         //   accounts[0] = account1;    // 10개중 한개 담김!
            
         //   accounts[index] = account1;
         //   index++;
         //   accounts[index] = new Account("1111-3333", "홍길동" , 1111 , 10000);
         //   index++;
         //   accounts[index] = new Account("1111-4444", "김철수" , 1111 , 10000);
         //   index++;
           
         //   더 보기쉽게 아래로 축약!
            accounts[index++] = account1;
            accounts[index++] = new Account("1111-3333", "홍길동" , 1111 , 10000);  
            accounts[index++] = new Account("1111-4444", "김철수" , 1111 , 10000);
            
            //등록된 모든 계좌정보 출력 
            for (int i = 0; i < index; i++) {
                 Account acc = accounts[i];   //accounts라는 배열의 i번째 
                 System.out.println(acc.toString());
               
            
            }
            
            
            System.out.println("----- 계좌 검색 테스트 -----");
            
            // 계좌번호로 계좌를 검색하는 기능
         //   String searchNum = "1111-2222";
            String searchNum = null;
            
            
            System.out.print("검색하고자 하는 계좌번호 : ");
            Scanner scanner = new Scanner(System.in);
            searchNum = scanner.nextLine();
            
            
            
            for (int i = 0; i < index ; i++) {
            String number = accounts[i].getAccountNumber(); 
         //   if(serchNum == number)   요게 아니라 equals로!!
            if(searchNum.equals(number)) {
               System.out.println(accounts[i].toString());
            
              }
            
            }
            
            
            
            
            
            

         //   public int sum(int x, int y) {           캡슐화 시킬때 아~무 상관없는 요런내용 넣지말기
//               return x + y;
         //   }
            
            
            
            String name1 = new String("김성욱");
            String name2 = new String("김성욱");
             System.out.println(name1 == name2); //주소값 비교   
            System.out.println(name1.equals(name2)); //객체의 문자열값 비교
            
            
            
            }

         }
