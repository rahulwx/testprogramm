
public class Pair<T,V> {
	private T first;
	private V second;
	
	public Pair(T first,V second) {
		this.first=first;
		this.second=second;
	}
	public T getfirst() {
		return first;
	}
	public V getsecond() {
		return second;
	}
	public void setfirst(T first) {
		this.first=first;
	}
	public void setsecond(V second) {
		this.second=second;
	}
	
}


