/**
 * 
 */
package impresorlcd;

import javax.swing.JOptionPane;

/**
 * @author Jose Alvarez
 *
 */
public class ImpresorApp {

	/**
	 * Metodo main pide la entrada del usuario
	 * y llama al metodo manejarExcepciones
	 * @param args
	 */
	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Ingrese el tamaño (1-10) de los numeros" +"\n"
				+ "Separados por ',' los numeros a imprimir");
		
		while(!(entrada.equalsIgnoreCase("0,0"))){
			
			ImpresorApp i = new ImpresorApp();
			i.manejarExcepciones(entrada);
			
			entrada = JOptionPane.showInputDialog("Ingrese el tamaño (1-10) de los numeros" +"\n"
					+ "Separados por ',' los numeros a imprimir"+ "\n"+ "0,0 para salir");

		}
	}

	/**
	 * Metodo para manejar excepciones en los datos ingresado por el usuario
	 * 
	 * @param entrada Valor ingresado por el usuario 
	 */
	
	public void manejarExcepciones(String entrada){
		
		//Valida que el formato cumpla con lo solicitado
		if(!entrada.contains(",")){
			throw new IllegalArgumentException("La cadena no contiene ','");
		}

		String[] entradas = entrada.split(",");
		
		//Valida si la cadena cumple con el tamaño solicitado
		if(!(entradas.length == 2)){
			throw new IllegalArgumentException("La cadena es demasiado corta o larga");
		}


			int size  = Integer.parseInt(entradas[0]);
		
		
		if(!(0<size || size>10)){
			throw new IllegalArgumentException("el tamaño debe estar entre [1 - 10]");

		
		}
		
		
		//Valida si el tamaño cumple con los rangos establecidos
		
		String cadena = entradas[1];

		//Valida que cada uno de los elemtos a imprimir sea un numero
		for (int i = 0; i < cadena.length(); i++) {
			if(!Character.isDigit(cadena.charAt(i))){
				throw new IllegalArgumentException("El digito "+ i +" No es un numero");
			}

		}
		
		ImprimirMatriz(size,cadena);
	

	}

	
	/**
	 * Metodo encargado de imprimir la matriz de numeros
	 *  
	 * @param size Tamaño de impresion de los numeros
	 * @param cadena Cadena de numeros a imprimir
	 * 
	 */
	public void ImprimirMatriz(int size, String cadena){
		Impresor matrizNumeros =  new Impresor();
		String[][] matriz = matrizNumeros.crearMatriz(size, cadena);
		
		System.out.println(" ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println(" ");
		}
		
	}

}
