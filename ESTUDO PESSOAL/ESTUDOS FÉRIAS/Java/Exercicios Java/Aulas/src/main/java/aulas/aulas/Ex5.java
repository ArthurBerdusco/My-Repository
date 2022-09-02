/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aulas;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author arthur.sbsouza
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a sigla de um estado brasileiro: ");
        String sigla = input.nextLine();
        
        HashMap <String, String> siglaEstado = new HashMap();
        
        siglaEstado.put("AC", "Acre");
        siglaEstado.put("AL", "Alagoas");
        siglaEstado.put("SP", "São Paulo");
        siglaEstado.put("RJ", "Rio de Janeiro");
        
        System.out.println(siglaEstado.get(sigla));
        
        if(sigla.equals("MG")){
            System.out.println("Minas Gerais");
        }
    }
}
