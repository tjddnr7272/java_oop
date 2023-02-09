package oop;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student("김성욱", "부동산학과");
		System.out.println(student.getSsn());
		String name = student.getName();
		System.out.println(name);
		student.study();
		
		
		// 클래스변수는 클래스이름.변수명 
		System.out.println(Student.SCHOOL_NAME);
		Student student2 = new Student("홍길동", "컴퓨터공학과");
		System.out.println(student2.getSsn());
		System.out.println(Student.SCHOOL_NAME);
		
		//권장 (스타틱 메소드)
		Student.printSchoolName();
		//비권장(인스턴트 메소드 호출)
		student.printSchoolName();
		

	}

}
