
public class Ex06_15_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int asuki;
		
			for(asuki=0;asuki<=127;asuki++) {
				if(asuki%16==0) {
					System.out.print("\t--------------------\n");
					System.out.printf("\t10����\t16����\t����\t\n");
					System.out.print("\t--------------------\n");
				}
				System.out.printf("\t %d\t %x\t %c\t\n",asuki,asuki,asuki);
			}
			System.out.println();

	}

}
