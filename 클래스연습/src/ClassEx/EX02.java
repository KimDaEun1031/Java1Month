package ClassEx;

class Name {
	String getName() { //메소드
		return "홍길동";
	}
}

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name myName = new Name(); //인스턴스 생성
		System.out.println(myName.getName());

	}

}
