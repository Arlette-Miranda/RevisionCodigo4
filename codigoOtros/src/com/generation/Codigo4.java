/*
 * Este codigo simula el juego de piedra, papel o tijeras.
 * Esto lo realiza mediante la clase scanner que recibe una entrada del usuario a traves de la consola
 * Al recibir la información del jugar 1 y jugador 2, estos datos son comparados
 * a través de If y switch para los distintos casos que se pueden presentar.
 * Comenzando con el empate, en caso de que mabos jugadores den la misma respuesta
 * y siguiendo con las posibles jugadas.
 * Sino se da una entrada correcta se muestra un mensaje de entrada invalida
 * De caso contrario, se meuestra quien es el ganador.*/

package com.generation;

import java.util.Scanner; // Se importa la clase Scanner

public class Codigo4 {

	public static void main(String[] args) { // Se crea método main para iniciar programa
		Scanner s = new Scanner(System.in); // Se agrega System.in, para recibir lo de la consola
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    // Se cambia a jugador 2
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    // Scanner s2 = new Scanner(); //se comenta línea ya que no es necesario declarar un nuevo scanner
	    String j2 = s.nextLine();
	    
	    // // Se cambia == por  .equals() para comparar cadenas de texto
	    if (j1.equals(j2)) { // Se elimina parentesis extra
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	        	
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	          break; // Se agrega break por uso de switch
	          
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1; 
	          } // Se agrega { para cierre de if
	          
	          break; // Se agrega break por uso de switch
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	          
	        default:
	        	// Se agrega mensaje de entra invalida
                System.out.println("Entrada inválida");
                return;
	      }
	      System.out.println("Gana el jugador " + g);
	    }

	}

}
