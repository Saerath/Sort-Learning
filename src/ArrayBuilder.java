import java.util.ArrayList;
import java.util.Random;


public class ArrayBuilder {
	
	public ArrayList newArray(int arrLength, int maxNumber) {
		// TODO Auto-generated constructor stub
		ArrayList list = new ArrayList();
		Random rnd = new Random();
		
		for (int i = 1; i < arrLength; i++){
			Integer a = new Integer(rnd.nextInt(maxNumber));
			list.add(a);
		}
		return list;
	}
	
}
