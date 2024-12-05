/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora c = new Calculadora();
        
        System.out.println("--------- Calculadora ----------\n" +
                   "Operaciones disponibles:\n" +
                   "1. Suma\n" +
                   "2. Resta\n" +
                   "3. Multiplicación\n" +
                   "4. División\n" +
                    "Selecciona una opcion: ");

        int operación = scanner.nextInt();
        c.setOperacion(operación);
        
        System.out.println("Numero 1: ");
        int numero1 = scanner.nextInt();
        c.setNumero1(numero1);
        
        System.out.println("Numero 2: ");
        int numero2 = scanner.nextInt();
        c.setNumero2(numero2);
        
        c.calcular();
        
        
        
        
    }
    
}
