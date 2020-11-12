import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicMonster bm = new BasicMonster();
		BasicStat bs = new BasicStat();
		
		Random mon = new Random();
		int monNumber = mon.nextInt(2) + 1;//랜덤으로 1~2까지 값 출력
		int map = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("*** Welcom! Poketmon!! ***");
		System.out.println("<1> 시작 <esc> 종료");
		int start = s.nextInt();
		
		if(start==1) {
			System.out.println("포켓몬을 실행합니다.(1)");					        	
					System.out.println("<1> 걷기 <2> 마을로 가기 <3> 정보창 실행 <4> 도움말 실행");
		        	int walk = s.nextInt();	
		        	for(;map<10;) {
		        		if(walk==1) {
		        			walk=0;
		        			System.out.println("<1> 걷기 <2> 마을로 가기 <3> 정보창 실행");
				        	walk = s.nextInt();		
		        			map += 1;
		        		}
		        		else if(walk==2) {
				        		System.out.println("마을로 돌아왔습니다. 종료합니다.");				        		
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
		        			System.out.printf("몬스터가 나타났습니다!");
		        			System.out.println("<1> 공격 <2> 도망가기");
		        			for(int i=0; i<bm.getHhp();) {
		        				map = 0;
		        				int attack = s.nextInt();
		        				if(attack==1) {
		        					bm.redHp(bs);
		        					bs.monHp(bm);
		        					i++;
		        				} 
		        				if(bm.getHp()==0) {
		        					System.out.println("몬스터가 죽었습니다. 얻은 경험치 +1");	
		        					bs.Exp(bm);
		        					bs.displayStat();	
		        					bs.Levelup();	        			
			        				} else {
			        					bs.Death();
			        				}
			        			if(attack==2) {
			        				System.out.println("몬스터에게서 도망쳤습니다.");
			        				break;
			        			}
			        		}
			        	} 
		        		if(monNumber==1) {
		        			walk = s.nextInt();	
		        			}
		        		
			        } else {
			        	System.out.print("종료합니다!");
			        }
				
		
		}

	}
}
