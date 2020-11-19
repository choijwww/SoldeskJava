package Ex09_01.src;

public class Stack <T> implements IStack<T> {
	private T [] v;
	private int count;
	
	public Stack (int size) {
		v = (T[])new Object[size];
		count = 0;
	}
	
	public void push(T o) {
		if(count < v.length)
			v[count++] = o;
	}
	
	public T pop() {
		return v[--count];
	}
	
	public int size() {
		return count;
	}
}
