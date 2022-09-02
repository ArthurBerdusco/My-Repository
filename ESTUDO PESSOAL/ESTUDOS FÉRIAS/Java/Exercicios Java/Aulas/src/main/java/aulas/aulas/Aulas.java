/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aulas.aulas;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author arthur.sbsouza
 */
public class Aulas {
    //Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja maior
    //que 20, este deverá ser apresentado somando-se a ele mais 8; caso o valor somado seja menor ou igual a
    //20, este deverá ser apresentado subtraindo-se 5.
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        int num1, num2, soma;
        
        System.out.println("Insira o número 1: ");
        num1 = input.nextInt();
        System.out.println("Insira o número 2: ");
        num2 = input.nextInt();
        
        soma = num1 + num2;
        
        if(soma > 20){
            soma = soma + 8;
            System.out.println(soma);      
        }else{
            soma = soma - 8;
            System.out.println(soma);   
        }
        
        HashMap<Integer, String> StudentInfo = new HashMap();
        

        
        StudentInfo.put(1, "Arthur");
        StudentInfo.put(2, "Silva");
        
        System.out.println(StudentInfo.containsValue("Arthur"));
        
    }
}
