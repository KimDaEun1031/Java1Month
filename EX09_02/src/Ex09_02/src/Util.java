package Ex09_02.src;


public class Util {
	static <T extends Comparable<T>> T min(T x, T y) {//T�κ��� Point�� �ٲٸ� ���� �κ� �� �Ʒ��� ��
		if(x.compareTo(y) < 0)
			return x;
		return y;
	}
}
