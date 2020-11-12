package test;

public class 반복문1 {
	public static void main(String[] args) {
		
		int sum = 0; //변수 sum을 0으로 가정
		
		for(int i = 1; i <= 10; i++) { 
			//변수 i는 1이고 i는 10보다 크거나 같아야한다. 그리고 증감
			sum += i;
            //+= 대입 연산자 -=,*=,/=,%= 가 있고 
			//만약 반대인 =+ 이런 거는 오른쪽 값을 생각하면 됨 =+ 10 은 10 =-은 -10
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	
	}

}
