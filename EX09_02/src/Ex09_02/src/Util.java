package Ex09_02.src;


public class Util {
	static <T extends Comparable<T>> T min(T x, T y) {//T부분을 Point로 바꾸면 메인 부분 맨 아래가 됨
		if(x.compareTo(y) < 0)
			return x;
		return y;
	}
}
