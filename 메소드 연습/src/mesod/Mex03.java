package mesod;

public class Mex03 {

	public static void main(String[] args) {
		//Hello.java ���ڿ����� ���ϸ� Hello�� Ȯ���� Java�� �и����Ѻ���.
		String Fullname = "Hello.Java";
		
		int idx = Fullname.indexOf(".");
		
		String fileName = Fullname.substring(0,idx);
		String extName = Fullname.substring(idx+1);
		
		System.out.println("���ϸ�:" + fileName);
		System.out.println("Ȯ���:" + extName);

	}

}
