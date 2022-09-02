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
public class Ex2 {
    
    //Entrar com um número e informar se ele é divisível por 3 e por 7.
    
    
    public static void main(String[] args) {
        
        for(int i = 1; i < 200; i++){
            if((i % 3 == 0)&(i % 7 == 0)){
                System.out.println(i+" É divisivel");
            }
        }

    }

}
