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



public class Ex3 {
//    A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. 
//    O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//    Fazer um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.
    
    public void validarEmprestimo(float salario, float valorDivida){
        float porcentagem = (valorDivida * 100 / salario);
        System.out.println(porcentagem);
        
        if(porcentagem <= 30){
            System.out.println("Emprestimo pode ser concedido!");
        }else{
            System.out.println("Emprestimo não pode ser concedido!");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario, divida;
        
        
        System.out.println("Insira o valor do salario: ");
        salario = input.nextFloat();
        System.out.println("Insira o valor da divida: ");
        divida = input.nextFloat();
        
        Ex3 arthur = new Ex3();
        arthur.validarEmprestimo(salario, divida);
        
    }
    
}
