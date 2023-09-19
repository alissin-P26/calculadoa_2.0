/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_orientada_a_objeto;

import java.util.Scanner;

/**
 *
 * @author jose.5989
 */
public class programaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora_Cientifica cc = new Calculadora_Cientifica();
        
        Scanner entrada = new Scanner (System.in);
        
        int opcao; 
        
        float num1 = 0, num2 = 0, resultado = 0;
        
        double num5, num6;
        
        Boolean continuar = true;
        
        String opcaoEscolha;
        
        while(continuar){
            System.out.println("------------------------------------------");
            System.out.println("=======Calculadora=======");
            System.out.println("------------------------------------------");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Raiz Quadrada");
            System.out.println("6 - Potencia");
            System.out.println("------------------------------------------");
            
            opcao = entrada.nextInt();
            
            if(opcao == 1){
                System.out.println("Informe o primeiro número: ");
                num1 = entrada.nextFloat();                
                System.out.println("Informe o segundo número: ");
                num2 = entrada.nextFloat();
                System.out.println("Resultado da soma: " + calculadora.somar(num1, num2));
                System.out.println("------------------------------------------");
            }else if (opcao == 2){
                System.out.println("Informe o primeiro número: ");
                num1 = entrada.nextFloat();                
                System.out.println("Informe o segundo número: ");
                num2 = entrada.nextFloat();
                System.out.println("Resultado da soma: " + calculadora.subtrair(num1, num2));
                System.out.println("------------------------------------------");  
            }else if (opcao == 3) {
                System.out.println("Informe o primeiro número: ");
                num1 = entrada.nextFloat();                
                System.out.println("Informe o segundo número: ");
                num2 = entrada.nextFloat();
                System.out.println("Resultado da soma: " + calculadora.multiplicar(num1, num2));
                System.out.println("------------------------------------------");  
            }else if (opcao == 4) {
                System.out.println("Informe o primeiro número: ");
                num1 = entrada.nextFloat();                
                System.out.println("Informe o segundo número: ");
                num2 = entrada.nextFloat();
                System.out.println("Resultado da soma: " + calculadora.dividir(num1, num2));
                System.out.println("------------------------------------------");  
            }else if (opcao == 5) {
                System.out.println("Informe o número: ");                
                num5 = entrada.nextDouble();
                System.out.println("Resultado: " + cc.raizQuadrada(num5));
                System.out.println("------------------------------------------");  
            }else if (opcao == 6) {
                System.out.println("Informe o primeiro número: ");
                num5 = entrada.nextDouble();                
                System.out.println("Informe o segundo número: ");
                num6 = entrada.nextDouble();
                System.out.println("Resultado: " + cc.potencia(num5, num6));
                System.out.println("------------------------------------------");
            }else{
                System.err.println("OPÇÃO INEXISTENTE !!");
            }
            System.out.println("-----------------------------------------------");
            System.out.println("Deseja realizar mais alguma operação? (S/N)");
            opcaoEscolha = entrada.next();
            System.out.println("------------------------------------------------");
            if(opcaoEscolha.equals("S")|| opcaoEscolha.equals("s")) {
                continuar = true;
            }else{
                continuar = false;
            }

        }
    }
}
                
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Informe o primeiro valor: ");
//        float num1 = scanner.nextFloat();
//        
//        System.out.println("Informe o segundo valor: ");
//        float num2 = scanner.nextFloat();
//        System.out.println("=====================RESULTADOS=========================");
//        System.out.println("Resultado da soma: " + calculadora.somar(num1, num2));
//        System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
//        System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(num1, num2));
//        System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));
//        System.out.println("Resultado: " + cc.potencia(0, 0));
//        System.out.println("Resultado: " + cc.raizQuadrada(0));           