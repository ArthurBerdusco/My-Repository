
public class AmpliarEstreitar {

	public static void main(String[] args) {
		
		//EXEMPLO AMPLIAR
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		
		//EXEMPLO ESTREITAR
		
		
		
		double myDouble2 = 9.0;
		int myInt2 = (int) myDouble;
		
		System.out.println(myDouble2);
		System.out.println(myInt2);
		
		int[][] myNumbers = {{1,2,3,4},{5,6,7,8}};
		
		for(int i = 0; i < myNumbers.length; i++) {
			for(int j = 0; j < myNumbers[i].length; j++) {
				System.out.println(myNumbers[0][j] + myNumbers[1][j]);
			}
		}
		

	}

}
