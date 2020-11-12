package EX08;

public class Ex08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aa[] = {10,20,30,40,50};
		int count;
		int size;
		
		
		count = aa.length;
		size = count*Integer.BYTES;
		

		System.out.printf("배열 aa[]의 요소의 개수는 %d개 입니다.\n",count);
		System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트 입니다.\n",size);
		
		//8-3 직접 풀어보기
		//위를 수정하여 배열 aa에 들어있는 전체 값의 합의 계산하는 프로그램을 작성해보자
		//for(i=0;i<count;i++) 활용
		int result = 0;
		
		for(int i=0;i<count;i++) {
			result += aa[i];
		}
		System.out.println(result);
	}

}
