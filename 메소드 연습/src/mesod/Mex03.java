package mesod;

public class Mex03 {

	public static void main(String[] args) {
		//Hello.java 문자열에서 파일명 Hello와 확장자 Java를 분리시켜보자.
		String Fullname = "Hello.Java";
		
		int idx = Fullname.indexOf(".");
		
		String fileName = Fullname.substring(0,idx);
		String extName = Fullname.substring(idx+1);
		
		System.out.println("파일명:" + fileName);
		System.out.println("확장명:" + extName);

	}

}
