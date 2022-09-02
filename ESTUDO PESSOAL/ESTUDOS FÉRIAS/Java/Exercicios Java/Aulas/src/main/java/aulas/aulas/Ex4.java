/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aulas;

import java.util.Scanner;



/**
 *
 * @author arthur.sbsouza
 */
public class Ex4 {
    //Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 20 ou menor do que 20.
    
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    
        int num1 = input.nextInt();

        if(num1 > 20){
            System.out.println("É maior do que 20.");
        }else if(num1 == 20){
            System.out.println("É igual a 20.");
        }else{
            System.out.println("É menor do que 20.");
        }
    }
    

}
