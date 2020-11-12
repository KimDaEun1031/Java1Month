package mesod;

public class Mex04 {

	public static void main(String[] args) {
		//split() 메소드로 문자열 분리하기
		
		String scores = "100, 11, 35, 41";
		String[] arscores = scores.split(", ");
		
		int total = 0;
		double avg = 0.0;
		
		for(int i=0;i<arscores.length;i++) {
			total += Integer.parseInt(arscores[i]);
		}
		
		avg = total / arscores.length;
		
		System.out.println("총점:" +total+ "점");
		System.out.printf("평균:%.1f점", avg);
	}

}
