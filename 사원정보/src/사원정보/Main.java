package 사원정보;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import 사원정보.info.Employee;
import 사원정보.info.Value;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	
		
		System.out.print("등록할 사원 수를 적어주세요 : ");
		int register = Integer.parseInt(s.nextLine());
		int number [] = new int[register];
		Employee emp [] = new Employee[register];	
		List list = new ArrayList();
		list.add(s);
		s = (Scanner) list.get(0);
		list.add(emp);
	
		//s.nextLine();
		
		System.out.println("&&&*** 사원등록을 시작합니다 ***&&&");
		
		for(int i=0;i<emp.length;i++) {
			emp[i]=new Employee();
			
			System.out.printf("이름을 입력하시오 : ");		
			String name = s.nextLine();
			emp[i].setName(name);
		
			System.out.printf("\n사원번호를 입력하시오 : ");		
			String emNumber = s.nextLine();
			emp[i].setEmNumber(emNumber);
		
			System.out.printf("\n성별을 입력하시오(남/여) : ");		
			String gender = s.nextLine();
			emp[i].setGender(gender);
		
			System.out.printf("\n소속팀을 입력하시오.(팀명만) : ");
			String team = s.nextLine();
			emp[i].setTeam(team);
		
			System.out.printf("\n직급을 입력하시오. : ");
			String position = s.nextLine();
			emp[i].setPosition(position);
		
			System.out.printf("\n이메일을 입력하시오. : ");
			String email = s.nextLine();
			emp[i].setEmail(email);;
			
			System.out.println("-------------------------------");
			
//			emp[i].displayEmpolyee();
		}	
		
		for(int i=0;i<emp.length;i++) {			
			emp[i].displayEmpolyee();
		}
		
	}
	
	public static void test() {
		

		
		{
			Value emp;
		}
	}

}
