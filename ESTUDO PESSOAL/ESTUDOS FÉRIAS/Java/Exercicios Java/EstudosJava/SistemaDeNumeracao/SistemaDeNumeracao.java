import java.util.Scanner;


public class SistemaDeNumeracao {
	
	
	public static void decToBinary(int decimal) {
		
	     int binary[] = new int[40];    
	     int index = 0;    
	     
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	     System.out.println();//new line  
	}   
	
	
	public static int binaryToDec(int binary) {
		int decimal = 0;
		int exp = 0;
		while(true) {
			if(binary == 0) {
				break;
			}else {
				int temp = binary % 10;
				decimal += temp*Math.pow(2, exp);
				binary = binary/10;
				exp++;
			}
		}return decimal;
	}
	
	
	public static int octalToDec(int octal) {
		int decimal = 0;
		int exp = 0;
		while(true) {
			
			if(octal == 0) {
				break;
			}else {
				
				int temp = octal % 10;
				decimal += temp*Math.pow(8, exp);
				octal = octal/10;
				exp++;
			} 
		} return decimal;
	}
	
	
	public static void decToOctal(int decimal) {
		
		int octal[] = new int [40];
		int index = 0;
		
		while(decimal > 0) {
			octal[index++] = decimal % 8;
			decimal = decimal/8;
		}
		
		for(int i = index -1; i >= 0; i--) {
			System.out.print(octal[i]);
		}
	}
	
	public static void main(String[] args) {

		//Conversão Decimal para Binário:
		
		System.out.print("O número decimal 16 convertido para binário é: ");
		decToBinary(16);
		
		System.out.println("O número binario 10110 convertido para decimal é: " + binaryToDec(10110));
		
		System.out.println("O número octal 777 convertido para decimal é: " + octalToDec(777));
		
		System.out.print("O número decimal 540 convertido para octal é: ");
		decToOctal(540);
		
	}

}
