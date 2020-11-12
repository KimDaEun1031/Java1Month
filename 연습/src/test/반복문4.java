package test;

public class 반복문4 {

	public static void main(String[] args) //throws java.lang.Exception 옆에 예외을 썼는데 왜?
	{                                    // 굳이 예외를 쓰지 않아도 잘 실행이 됨
		// 증가치에 따라 증가하는 항 값의 누적 합 예제
		int h = 1; 
		// n 항의 누적 합 
		int n = 1; 
		// 각 항: [1]+[2]+[4]+[7]+[11]+[16]+[22] 
		int k = 0; 
		// 증가치: 1 2 3 4 5 6 
		do{ k+=1; 
		    n += k; 
		if(n > 100) break; // n이 100이상이면 빠져나온다
		    h += n;
		// (누적) 
		System.out.printf("%d - %d - %d\n",n,k,h); 
		
		}while(true);//무한루프로 무조건 참인 반복문


	}

}
