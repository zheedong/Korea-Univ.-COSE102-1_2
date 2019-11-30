package assignement_1127;

import java.util.HashMap;

public class Gen <K, V> {
	HashMap<K, V> data = new HashMap<K, V>();

	public Gen() {
		data.put(null, null);
	}
	
	public Gen(K name, V score) {
		this.setItem(name, score);
	}

	public void setItem(K name, V score) {
		data.put(name, score);
	}
	
	public V findItem(K name) {
		return data.get(name);
	}
}
