package mesod;

public class Mex07 {

	public static void main(String[] args) {
		// stringbuffer 클래스를 활용하여 문자열 처리하기
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb + ": " + sb.hashCode());
		
		sb.append(" is apple.");//비슷한 기능 concat
		System.out.println(sb + ": " + sb.hashCode());
		// + 연산자는 문자열을 stringbuilder로 변환 후 append로 문자열을 더하고 tostring함수로 변환
		//문자열을 여러개 더하면 append가 나음 문자열 2개를 합치면 concat이 좋다
		
		sb.insert(7," my");
		System.out.println(sb + ": " + sb.hashCode());
		
		sb.replace(8, 10," your");
		System.out.println(sb + ": " + sb.hashCode());
		
		sb.delete(8,13).insert(7," an");
		System.out.println(sb + ": " + sb.hashCode());		
	}

}
