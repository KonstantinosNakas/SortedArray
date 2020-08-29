
public class SortedArray {
	
	private int[] array;
	private int counter = 0;
	
	public SortedArray() {
		array = new int[100];
	}
	
	public SortedArray(int capacity) {
		array = new int[capacity];
	}
	
	public int find(int x) {
		for (int i=0; i<array.length; i++) {
			if (array[i] == x) {
				return i;
			}
			if (array[i] < x) {
				return i;
			}
		}
		return array.length;
	}
	
	public boolean containsElement(int x) {
		for (int i=0; i<array.length; i++) {
			if (array[i] == x) {
				return true;
			}
		}	
		return false;
	}
	
	public boolean insert(int x) {
		int index = find(x);
		if (index == counter) {
			array[index] = x;
			counter++;
			return true;
		}
		if (index < array.length) {
			for (int i=array.length-1; i>index; i--) {
				array[i] = array[i-1];
			}
			array[index] = x;
			counter++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean delete(int x) {
		if (containsElement(x)) {
			int index = find(x);
			if (index == counter) {
				array[index] = 0;
				counter--;
				return true;
			}else {
				for (int i=index; i<counter; i++) {
					array[i] = array[i+1];
				}
				array[counter] = 0;
				counter--;
				return true;
			}
		}else {
			return false;
		}
	}
	
	public int get(int i) {
		return array[i];
	}
	
	public int getSize() {
		return counter-1;
	}
	
	public int getCapacity() {
		return array.length;
	}
	
	public int min() {
		return array[counter-1];
	}
	
	public int max() {
		return array[0];
	}
	
	public String toString()
	{
		String s = "";
		for (int i=0; i<array.length; i++){
			s += array[i] + " ";
		}
		s += "\n";
		return s;
	}
	
	public boolean equals(SortedArray other)
	{
		int i = 0, j = 0;
		while (i<counter && j<other.counter) {
			if (array[i] != other.array[j]) {
				return false;
			}
			while (array[i] == array[i+1]) {
				i++;
			}
			while (other.array[j] == other.array[j+1]) {
				j++;
			}
			i++;
			j++;
		}
		return true;
	}
	
}
