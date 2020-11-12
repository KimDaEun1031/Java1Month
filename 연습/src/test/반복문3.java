package test;

public class 반복문3 {

	public static void main(String[] args) {
		//10부터 0까지의 합을 구하라
		
		int i = 10 , sum = 0;
		while( i >= 0 ){ 
			System.out.printf(i==0?"%d":"%d+",i); //,i는 함께 출력된다는 뜻
			// ? : 는 삼항연산자로 조건문이라 생각하면 편함
			// i==0? 은 i가 0이냐 아니냐를 묻고 있는 거임 그리고 0이면 true
			// "" : "" 는 true라면 왼쪽을 프린트하고 false라면 오른쪽을 프린트하라는 뜻
			sum += i; // sum + i
			i--; } // i를 1씩 줄이라는 뜻
		System.out.println("="+sum);

		
		// 답이 10+9+...0= 55로 나오는데 삼항 연산자로 보면 1까지는 false로 대답하니 숫자+가 나오는 거고
		// 0은 true니까 숫자만 나오는 거
	
		}
  

	}


