package findName;

public class search {
	
	public static int linearSTR(String[] array, String strToFind) {
		 int index = 0;

		 while ((array[index].equals(strToFind) == false) && (index < array.length - 1)) { 
		 }

		 if (array[index].equals(strToFind)) {
		 return(index);
		 }
		 else {
		 return(-1);
		 }
		
		 }
}
