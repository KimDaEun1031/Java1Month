package EX03;


public class Ex03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {8,16,32,64,32,64,16};
		
		System.out.printf("byte 형의 크기\t\t  ===> %d\n" ,data[0]);
		System.out.printf("short 형의 크기\t\t  ===> %d\n" ,data[1]);
		System.out.printf("int 형의 크기\t\t  ===> %d\n" ,data[2]); // 제일 중요하다 크기를 아는 것이
		System.out.printf("long 형의 크기\t\t  ===> %d\n" ,data[3]);
		System.out.printf("float 형의 크기\t\t  ===> %d\n" ,data[4]);
		System.out.printf("double 형의 크기\t\t  ===> %d\n" ,data[5]); //여기도 중요
		System.out.printf("char 형의 크기\t\t  ===> %d\n" ,data[6]);
		//,data[6]); 이거 대신에 답지는 size 필드라는 것을 썼는데 아직 안 배워서 모르겠음
		//byte.size를 적으면 값을 지정한 것이기에 따로 지정하지 않아도 바로 나온다.
		//size는 상수이다.
		//int의 경우에는 integer.size라고 친다.
		//char의 경우에는 character라고 친다.
		
	}

}
