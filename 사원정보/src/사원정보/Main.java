package �������;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import �������.info.Employee;
import �������.info.Value;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	
		
		System.out.print("����� ��� ���� �����ּ��� : ");
		int register = Integer.parseInt(s.nextLine());
		int number [] = new int[register];
		Employee emp [] = new Employee[register];	
		List list = new ArrayList();
		list.add(s);
		s = (Scanner) list.get(0);
		list.add(emp);
	
		//s.nextLine();
		
		System.out.println("&&&*** �������� �����մϴ� ***&&&");
		
		for(int i=0;i<emp.length;i++) {
			emp[i]=new Employee();
			
			System.out.printf("�̸��� �Է��Ͻÿ� : ");		
			String name = s.nextLine();
			emp[i].setName(name);
		
			System.out.printf("\n�����ȣ�� �Է��Ͻÿ� : ");		
			String emNumber = s.nextLine();
			emp[i].setEmNumber(emNumber);
		
			System.out.printf("\n������ �Է��Ͻÿ�(��/��) : ");		
			String gender = s.nextLine();
			emp[i].setGender(gender);
		
			System.out.printf("\n�Ҽ����� �Է��Ͻÿ�.(����) : ");
			String team = s.nextLine();
			emp[i].setTeam(team);
		
			System.out.printf("\n������ �Է��Ͻÿ�. : ");
			String position = s.nextLine();
			emp[i].setPosition(position);
		
			System.out.printf("\n�̸����� �Է��Ͻÿ�. : ");
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
