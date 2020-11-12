package EX;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		//문제 1 조건문을 활용하여 입력한 수 만큼 값을 반복해서 출력할 것
		//문제 2 어떤 수를 3,4,5,8로 나누었을 때 나누어 떨어지는 수에 특정한 동물의 이름 부여
		//문제 3 동시에 나누어 떨어지는 숫자가 있다면 동물이름이 연속으로 나열되도록 할것
		//하단에 출력된 동물의 이름을 카운트해서 횟수를 나열하기
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 ==>");
		int sem = s.nextInt();
		int cCount = 0;//고양이 카운트
		int dCount = 0;//강아지 카운트
		int bCount = 0;//곰 카운트
		int tCount = 0;//호랑이 카운트
		
		for(int a = 1; a <= sem; a++) {//a를 sem만큼 반복하라
			System.out.print(a + ".");
			if(a%3==0) {//a를 3으로 나눈 나머지가 0이라면 
				System.out.print("cat ");
				cCount += 1; //1씩 더해가라
			}
			if(a%4==0) {
				System.out.print("dog ");
				dCount += 1;
			}
			if(a%5==0) {
				System.out.print("bear ");
				bCount += 1;
			}
			if(a%8==0) {
				System.out.print("tiger ");
				tCount += 1;
			}
			System.out.println();
		}
		
		System.out.printf("동물 숫자\n");
		System.out.printf("고양이의 숫자는 %d마리\n", cCount);
		System.out.printf("강아지의 숫자는 %d마리\n", dCount);
		System.out.printf("곰의 숫자는 %d마리\n", bCount);
		System.out.printf("호랑이의 숫자는 %d마리\n", tCount);

	}

}
