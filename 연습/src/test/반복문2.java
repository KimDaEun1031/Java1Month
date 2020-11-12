package test;

public class 반복문2 {

	public static void main(String[] args) {
			 
		int [] kors = new int[5]; //배열
		//int [] 자료형 배열이라는 뜻 kors는 변수
		// new는 연산자 나중에 따로
		// int[5]는 자료형[크기]이다. 자바는 0부터 셈
		
		kors[0] = 100; //자료형 kors 0번은 100이라는 뜻?
		kors[1] = 90; 
		kors[2] = 77; 
		kors[3] = 23; 
		kors[4] = 88; 
		      // 자료형 : 배열
		for (int kor : kors) { 
			System.out.println(kor);      
		// + kor + 부분을 kors[0]으로 바꿔 쓰면 같은 게 5개 나옴 왜?
			//왜냐면 저장하는 크기가 5니까 5개의 공간이 있다는 거 그러니까 하나가 나오면 그거만 5개 만 나오는 거
		}

	}

}
