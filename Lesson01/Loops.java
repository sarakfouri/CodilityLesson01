public class Loop {
	
	public static void piramede(){
	for(int i = 0; i < 5; i++){
		System.out.println(" ");
		for (int j = 0; j < 5; j ++){
			
			for (int k =1; k < (i*2)+ 1; k++){
				System.out.print("*");
			}System.out.println("");
		}
	}
	}

	
	public static void numberLetters(){
		String[] letter = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
		String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};
		String[] asct = new String[]{"!", "@", "$", "%", "¨", "&", "*", "-"};
		for (int i = 0; i < letter.length; i++){
			System.out.print(letter[i]);
			for (int j = 0 ; j < numbers.length ;j++){
				System.out.print(numbers[j]);
				for (int k = 0; k < asct.length; k ++){
					System.out.print(asct[k]);
					
				}
			}
			System.out.println("");
		}
	}
	public static void number(){
		String[] letter = new String[]{"a", "b", "c"};
		
		String[] numbers = new String[]{"1", "2"};
		String[] asct = new String[]{"!", "@", "$", "%"};
		for (int i = 0; i < letter.length; i++){
			System.out.print(letter[i]);
			for (int j = 0 ; j < numbers.length ;j++){
				System.out.print(numbers[j]);
				for (int k = 0; k < asct.length; k ++){
					System.out.print(asct[k]);
					
				}
			}
			System.out.println("");
		}
	}
	public static void tentando(){
	for (int i = 6, k = 0; i > 0 && k < 6; i--, k++) {
	    for (int j = 0; j < i; j++) {
	        System.out.print(" ");
	    }
	    for (int j = 0; j < k; j++) {
	        System.out.print("*");
	    }
	    for (int j = 1; j < k; j++) {
	        System.out.print("*");
	    }
	    System.out.println();
	}
	}
	public static void printStar(int x) {
	    int i, j;
	    for (int y = 0; y < x; y++) { // number of row of '*'

	        for (i = y; i < x - 1; i++)
	            // number of space each row
	            System.out.print(' ');

	        for (j = 0; j < y * 2 + 1; j++)
	            // number of '*' each row
	            System.out.print('*');

	        System.out.println();
	    }
	}
	
public static void main(String[] args){
	piramede();
	numberLetters();
	number();
	tentando();
	printStar(10);
}
}
