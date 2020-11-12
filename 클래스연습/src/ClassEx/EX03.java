package ClassEx;

class Print {
	void showInfo() { //메소드
		System.out.println("인스턴스 메서드입니다.");
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print myPrint = new Print();//클래스이름.변수 = new.변수이름()
		myPrint.showInfo();//변수.메소드()
		

	}

}
