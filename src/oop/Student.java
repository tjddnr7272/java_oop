package oop;

public class Student {
	// 필드 (인스턴스변수, 클래스변수, 상수)
	// 상수 (관례상 ALL 대문자)
	public static final String SCHOOL_NAME = "EZEN UNIVERCITY";           //선언과 동시 초기화, 자동초기화도 됨(null)
	// 클래스(static) 변수 : 모든 인스턴스들이 공유하는 데이터 
	public static int sequence = 1;
	
	//인스턴스 변수
	private int ssn;
	private String name;
	private String subject;
	
	//초기화 블록
	{
		System.out.println("학생 인스턴스가 생성되었습니다..");   //생성자 보다 먼저 실행됨. 특정 초기화 작업할때 많이 쓰임
	    System.out.println("**********************************");
	}
	
	// static 초기화 블럭 (한번 실행됨)
	static {
		System.out.println("프로그램 로딩중.....");
	}
	
	
	public Student() {
		this( null, null);
	
	}

	public Student(String name, String subject) {
	
		this.ssn = sequence++;
		this.name = name;
		this.subject = subject;
		System.out.println("생성자 실행됨...");
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// 공부하기
	public void study( ) {
		System.out.println("열나 공부합시다..");
	}
	
	// 학교이름을 출력하는 공통 기능 (클래스(static)메소드)
	public static void printSchoolName() {
		System.out.println(SCHOOL_NAME);
//		System.out.println(name); 인스턴트 변수는 호출X
		
	}
	
	
	
	
	
	
	
}
