package EX;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//각각 변수에 대입하여 출력하시오
		// DATA는 이효리, 개발부, 대리, 1500000로 대입
		//출력은 이효리는 println, 개발부는 printf,
		//대리는 print 1번만 써서 직위 급여 출력
		
		String name = "이효리";
		String department = "개발부";
		String position = "대리";
		int sal = 1500000;
		
		System.out.println("이름 : "+ name);
		System.out.printf("부서 : %s", department);
		System.out.print("\n직위 : "+ position + "\n급여 : " + sal + "원");
		
		
		
		

	}

}
