import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicMonster bm = new BasicMonster();
		BasicStat bs = new BasicStat();
		
		Random mon = new Random();
		int monNumber = mon.nextInt(2) + 1;//�������� 1~2���� �� ���
		int map = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("*** Welcom! Poketmon!! ***");
		System.out.println("<1> ���� <esc> ����");
		int start = s.nextInt();
		
		if(start==1) {
			System.out.println("���ϸ��� �����մϴ�.(1)");					        	
					System.out.println("<1> �ȱ� <2> ������ ���� <3> ����â ���� <4> ���� ����");
		        	int walk = s.nextInt();	
		        	for(;map<10;) {
		        		if(walk==1) {
		        			walk=0;
		        			System.out.println("<1> �ȱ� <2> ������ ���� <3> ����â ����");
				        	walk = s.nextInt();		
		        			map += 1;
		        		}
		        		else if(walk==2) {
				        		System.out.println("������ ���ƿԽ��ϴ�. �����մϴ�.");				        		
				        }
		        		else if(walk==3) {
				        	bs.displayStat();	
				        	walk=0;
				        	}
		        		else if(walk==4) {
		        			bs.displayhint();
		        		}
		        		
		        	
		        	}
		        	if(map==10) {
		        		if(monNumber==1) {
		        			System.out.printf("���Ͱ� ��Ÿ�����ϴ�!");
		        			System.out.println("<1> ���� <2> ��������");
		        			for(int i=0; i<bm.getHhp();) {
		        				map = 0;
		        				int attack = s.nextInt();
		        				if(attack==1) {
		        					bm.redHp(bs);
		        					bs.monHp(bm);
		        					i++;
		        				} 
		        				if(bm.getHp()==0) {
		        					System.out.println("���Ͱ� �׾����ϴ�. ���� ����ġ +1");	
		        					bs.Exp(bm);
		        					bs.displayStat();	
		        					bs.Levelup();	        			
			        				} else {
			        					bs.Death();
			        				}
			        			if(attack==2) {
			        				System.out.println("���Ϳ��Լ� �����ƽ��ϴ�.");
			        				break;
			        			}
			        		}
			        	} 
		        		if(monNumber==1) {
		        			walk = s.nextInt();	
		        			}
		        		
			        } else {
			        	System.out.print("�����մϴ�!");
			        }
				
		
		}

	}
}
