import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysJ {

	public void reverseWJava (){
		String[] array = new String[] {"Maria" , "Paula" , "Sara", "Joana"};
		List list = Arrays.asList(array);
		Collections.reverse(list);
		System.out.println(list);
	// or
		Collections.reverse(Arrays.asList(array));
		System.out.println(array[0]);
	}
	
	public void reverseWAAux (){
		String[] array = new String[] {"Maria" , "Paula" , "Sara", "Joana"};
		String[] aux = new String[array.length];
		for (int i = 0; i < array.length; i++){
			aux[i] = array[array.length -i -1];
		}
		System.out.println( aux[0] +" " +  aux[3]);
	}
	
	public void reverseSwap (){
		String[] array = new String[] {"Paul", "Sara", "Mariah", "Ciaran"};
		String temp = "";
		for(int i =0; i < array.length/2; i++){
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		System.out.println(array[0]+ " " + array[3]);
	}
	
	
	
	public static void main(String[] args){
		ArraysJ mm = new ArraysJ();
		mm.reverseWJava();
		mm.reverseSwap();
		mm.reverseWAAux();
	}
	
}
