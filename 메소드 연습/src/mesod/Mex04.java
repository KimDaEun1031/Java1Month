package mesod;

public class Mex04 {

	public static void main(String[] args) {
		//split() �޼ҵ�� ���ڿ� �и��ϱ�
		
		String scores = "100, 11, 35, 41";
		String[] arscores = scores.split(", ");
		
		int total = 0;
		double avg = 0.0;
		
		for(int i=0;i<arscores.length;i++) {
			total += Integer.parseInt(arscores[i]);
		}
		
		avg = total / arscores.length;
		
		System.out.println("����:" +total+ "��");
		System.out.printf("���:%.1f��", avg);
	}

}
