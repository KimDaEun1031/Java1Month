
public class Ex10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] aa = new int [3];
		try {
			aa [3] = 100;
		} catch (Exception e) {
			System.out.println("저장 공간이 없습니다.");
			
		}
	}

}
