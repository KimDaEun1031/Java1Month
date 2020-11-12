package Ex09_01.src;


public interface IStack <T> {
	void push(T item);
	T pop();
	int size();
	boolean compareSize(IStack<?> o);
}
