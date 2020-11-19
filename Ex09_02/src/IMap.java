
public interface IMap <T extends Number, V> {
	void push(T k, V v);
	V get(T k);
	int size();
}
