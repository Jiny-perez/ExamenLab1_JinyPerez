/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perez_jiny_exam1;

import java.util.Scanner;
import java.util.Random;

public class Perez_Jiny_Exam1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random();

        int opcionMenu = 0;
        while (opcionMenu != 5){
        System.out.println("--------------------------------------------");
        System.out.println("                    MENU                    ");
        System.out.println("--------------------------------------------");
        System.out.println("[1] Piramide");
        System.out.println("[2] Clave");
        System.out.println("[3] Piedra, papel o tijera");
        System.out.println("[4] Adivinar");
        System.out.println("[5] Salir del Sistema");
        System.out.println("--------------------------------------------\n");
        System.out.print("Ingrese una opcion:");
        opcionMenu = lea.nextInt();

        switch (opcionMenu) {
            case 1:

                int numeroImpar = 1,
                 sumNum = 0,
                 fila = 0;
                ;

                System.out.print("Ingrese la cantidad de fila de la piramide de numeros impares:");
                fila = lea.nextInt();

                for (int i = 1; i <= fila; i++) {

                    for (int k = 1; k <= i; k++) {
                        System.out.print(numeroImpar + " ");
                        sumNum += numeroImpar;
                        numeroImpar += 2;
                    }
                    System.out.println(" = " + sumNum);
                    sumNum = 0;
                }
                break;

            case 2:

                String texto = "",
                 cifrado = "",
                 descifrado = "";

                System.out.print("Ingrese un mesaje: ");
                texto = lea.next();

                for (int i = 0; i < texto.length(); i++) {
                    char posicionLetra = texto.charAt(i);

                    if (Character.isLowerCase(posicionLetra)) {
                        char letraInvertida = (char) ('z' - (posicionLetra - 'a'));
                        cifrado += letraInvertida;
                    } else if (Character.isUpperCase(posicionLetra)) {
                        char letraInvertida = (char) ('z' - (posicionLetra - 'a'));
                        cifrado += letraInvertida;
                    } else {
                        cifrado += posicionLetra;
                    }
                }

                System.out.println("Mensaje cifrado:" + cifrado);

                for (int i = 0; i < cifrado.length(); i++) {
                    char posicionLetra = cifrado.charAt(i);

                    if (Character.isLowerCase(posicionLetra)) {
                        char letraInvertida = (char) ('z' - (posicionLetra - 'a'));
                        descifrado += letraInvertida;
                    } else if (Character.isUpperCase(posicionLetra)) {
                        char letraInvertida = (char) ('z' - (posicionLetra - 'a'));
                        descifrado += letraInvertida;
                    } else {
                        descifrado += posicionLetra;
                    }
                }

                System.out.println("Mensaje descifrado:" + descifrado);
                break;
            case 3:

                String jugarDeNuevo = "SI",
                 opcUsuario = "",
                 respuestaComputadora = "";

                System.out.println("Bienvenido al juego Papel, Piedra y Tijera.\n");

                while (jugarDeNuevo.equalsIgnoreCase("SI")) {
                    System.out.print("\nIngrese (PIEDRA, PAPEL O TIJERA): ");
                    opcUsuario = lea.next().toUpperCase();

                    while (true) {
                        if (opcUsuario.equals("PAPEL") || opcUsuario.equals("PIEDRA") || opcUsuario.equals("TIJERA")) {
                            int opcComputadora = random.nextInt(3);

                            if (opcComputadora == 0) {
                                respuestaComputadora = "PIEDRA";
                            } else if (opcComputadora == 1) {
                                respuestaComputadora = "PAPEL";
                            } else {
                                respuestaComputadora = "TIJERA";
                            }

                            System.out.println("Has elegido: " + opcUsuario);
                            System.out.println("He elegido: " + respuestaComputadora);

                            if (opcUsuario.equalsIgnoreCase(respuestaComputadora)) {
                                System.out.println("Empate");
                            } else if ((opcUsuario.equals("PIEDRA") && respuestaComputadora.equalsIgnoreCase("TIJERA"))
                                    || (opcUsuario.equals("PAPEL") && respuestaComputadora.equalsIgnoreCase("PIEDRA"))
                                    || (opcUsuario.equals("TIJERA") && respuestaComputadora.equalsIgnoreCase("PAPEL"))) {
                                System.out.println("Ganaste ");
                            } else {
                                System.out.println("Has perdido, he ganado yo.");
                            }
                            break;
                        } else {
                            System.out.print("Ingrese nuevamente (PIEDRA, PAPEL o TIJERA): ");
                            opcUsuario = lea.next().toUpperCase();
                        }
                    }

                    System.out.print("\nDesea jugar otra vez (SI/NO):");
                    jugarDeNuevo = lea.next().toUpperCase();
                }

                System.out.println("Gracias por jugar conmigo :)");
                break;
            case 4:
  
                int numAleatorio = aleatorio.nextInt(100) + 1;
                int numUsuario = 0,
                 intentos = 0;
                boolean acerto = false;


                while (intentos < 10 && !acerto) {
                    System.out.print("Introducir un numero:");
                    numUsuario = lea.nextInt();
                    intentos++;
                    
                if (numAleatorio == numUsuario) {
                    acerto = true;
                    System.out.println("Adivinaste el numero. Felicidades.");
                } else if (numAleatorio < numUsuario) {
                    System.out.println("El numero a adivinar es mayor");
                } else {
                    System.out.println("El numero a adivinar es menor");
                }

                if (acerto) {
                System.out.println("\nIntentos usados: " + intentos);
                    System.out.println("Ya no tienes intentos. El numero era: " + numAleatorio);
                }
        }
                break;
            case 5:
                System.out.println("Saliendo del sistema.");
                break;
        default:
            System.out.println("opcion no valida");
             }
    }
}
}

