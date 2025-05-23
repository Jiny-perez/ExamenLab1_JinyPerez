/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perez_jiny_exam1;

import java.util.Scanner;

public class Perez_Jiny_Exam1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        int opcionMenu = 0;

        System.out.println("--------------------------------------------");
        System.out.println("                    MENU                    ");
        System.out.println("--------------------------------------------");
        System.out.println("[1] Piramide");
        System.out.println("[2] Clave");
        System.out.println("[3] Piedra, papel o tijera");
        System.out.println("[4] Adivinar");
        System.out.println("[3] Salir del Sistema");
        System.out.println("--------------------------------------------\n");
        System.out.print("Ingrese una opcion:");
        opcionMenu = lea.nextInt();

        switch (opcionMenu) {
            case 1:

                int numeroImpar = 1, sumNum = 0, fila = 0;;

                System.out.print("Ingrese la cantidad de fila de la piramide de numeros impares:");
                fila = lea.nextInt();

                for (int i = 1; i <= fila; i++) {

                    for (int k = 1; k <= i; k++) {
                        System.out.print(numeroImpar + " ");
                        sumNum += numeroImpar;
                        numeroImpar += 2;
                    }
                    System.out.println(" = "+sumNum);
                    sumNum=0;
                }
            case 2:
                
                String texto="";
                        
                System.out.print("Ingrese un texto: ");
                texto = lea.next();
                
                for (int i=0; i<texto.length(); i++){
                    char posicionLetra = texto.charAt(i);
                }

        }

    }
}
