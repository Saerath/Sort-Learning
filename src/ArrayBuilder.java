import java.util.ArrayList;
import java.util.Random;


public class ArrayBuilder {
	
	public ArrayList<Integer> newArray(int arrLength, int maxNumber) {
		// TODO Auto-generated constructor stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for (int i = 0; i < arrLength; i++){
			Integer a = new Integer(rnd.nextInt(maxNumber));
			list.add(a);
		}
		return list;
	}
	
}
