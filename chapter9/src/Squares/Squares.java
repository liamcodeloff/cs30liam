package Squares;

public class Squares {

	public static void main(String[] args) {
		int[] arrNew = new int[5];
		
		for (int i = 0; i < arrNew.length; i++)
		{
			int p = i * i;
			arrNew[i] = p;
			System.out.println(arrNew[i]);
		}
		

	}

}
