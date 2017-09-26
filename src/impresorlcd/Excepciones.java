/**
 * 
 */
package impresorlcd;

/**
 * @author Jose Alvarez
 *
 */
public class Excepciones {

	/**
	 * Metodo para validar datos de entrada
	 * 
	 * @param entrada Valor ingresado por el usuario 
	 */

	public String[] validarEntrada(String entrada){

		//Valida que el formato cumpla con lo solicitado
		if(!entrada.contains(",")){
			throw new IllegalArgumentException("La cadena no contiene ','");
		}

		String[] entradas = entrada.split(",");

		//Valida si la cadena cumple con el tamaño solicitado
		if(entradas.length < 2){
			throw new IllegalArgumentException("La cadena es demasiado corta ");
		}
		else if(entradas.length > 2){
			throw new IllegalArgumentException("La cadena es demasiado larga ");
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
				throw new IllegalArgumentException("El caracter: "+ cadena.charAt(i) +" No es un numero");
			}

		}

		return entradas;
	}




}
