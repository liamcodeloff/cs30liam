package findName;

public class search {
	
	public static int linear(String[] array, String find) {
		int index = 0;
		
		while ((array[index] != find) &&
				(index < array.length - 1)) {
			index += 1;
		}
		if (array[index] == find) {
			return(index);
		}
		else {
			return(-1);
		}
	}
	
}
