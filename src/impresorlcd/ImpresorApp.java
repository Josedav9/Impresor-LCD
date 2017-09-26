/**
 * 
 */
package impresorlcd;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * @author Jose Alvarez
 *
 */
public class ImpresorApp {

	/**
	 * Metodo main pide la entrada del usuario
	 * y llama al metodo validar entrada
	 * @param args
	 */
	public static void main(String[] args) {

		Queue<String>cola = new LinkedList(); 
		Scanner leer = new Scanner(System.in);
		String entrada = "";
		while(!(entrada.equalsIgnoreCase("0,0"))){
			System.out.println("Entrada: ");
			entrada = leer.next();
			if(!(entrada.equalsIgnoreCase("0,0"))){
				cola.add(entrada);				
			}
		}

		Matriz matriz = new Matriz();
		Excepciones excepcion = new Excepciones();
		String[] entradas;
		String cadenaNumeros;
		int size;

		while(!(cola.isEmpty())){
			try {
				entradas = excepcion.validarEntrada(cola.poll());
				size =Integer.parseInt(entradas[0]);
				cadenaNumeros = entradas[1];
				matriz.imprimirMatriz(matriz.crearMatriz(size, cadenaNumeros));

			} catch (Exception e) {
				System.out.println("Ha ocurrido el error : "+ e);
			}
		}



	}



}
