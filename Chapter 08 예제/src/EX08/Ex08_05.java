package EX08;

public class Ex08_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] aa = new int [100];
		int bb [] = new int [100];
		int i;
		for(i=0;i<aa.length;i++) {
			aa[i] = i *2; 
			}
		for(i=0;i<bb.length;i++) {
			bb[i] = aa[99-i] ; 
			}
		
		System.out.printf("bb[0] = %d이고 역순으로 bb[99] = %d이다.",bb[0],bb[99]);

	}

}
