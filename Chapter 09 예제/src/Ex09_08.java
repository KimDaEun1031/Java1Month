import java.util.Scanner;

public class Ex09_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String str;
		String str2;
		Scanner s = new Scanner(System.in);

		str = "Java Hello";		
		str2 = "Java Hello";
		String str3 = new String("Java Hello");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("1���ڿ�==2���ڿ� : " + (str==str2));
		System.out.println("1���ڿ�.equals(2���ڿ�) : "+(str.equals(str2)));
		System.out.println("1���ڿ�==3���ڿ� : "+(str==str3));
		System.out.println("1���ڿ�.equals(3���ڿ�) : "+(str.equals(str3)));
		
		
		
		
	}

}
