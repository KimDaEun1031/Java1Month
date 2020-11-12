import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList라는 것도 있음
		//동적인 배열

		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		for(int i = 0; i < 10; ++i)
			list.add("List"+i);
//		
//		list.remove(1); //리스트의 배열의 첫번째 공간을 지운다. 위는 Two
//		list.remove("Three"); //Three가 입력된 리스트를 지운다
		for(String s : list)
			System.out.println(s); //= 여기서 리스트 출력
//		
		int size = list.size();
		System.out.println("Size : " + size); //위의 list배열의 사이즈를 출력 위에 3개와 포문 10개를 합쳐서 13개
//		
		String [] arrs = new String[list.size()]; //arrs의 길이는 list사이즈이다.
		arrs = list.toArray(arrs);//list배열을 일반 배열로 바꾼것이다.
		for(String s : arrs)
			System.out.println(s);
//		
		Iterator<String> iter = list.iterator(); //
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
//		
		
	}

}
