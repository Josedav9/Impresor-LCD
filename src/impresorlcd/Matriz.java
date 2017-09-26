package impresorlcd;
/**
 * 
 * @author Jose Alvarez
 *
 */
public class Matriz {

	/**
	 * Metodo que se encarga de crear la matriz para su posterior impresion
	 * hace llamado a los metodos de clase numero para llenar la matriz
	 * 
	 * @param size Tamaño de los numeros a imprimir
	 * @param numeros Cadena de numeros a imprimir
	 * @return Matriz con cada uno de los numeros en su tamaño
	 * 
	 */
	public String [][] crearMatriz(int size, String numeros){

		//Instancia de la clase Numero 
		Numero numero;
		int numeroFilas = 2*size+3;
		int numeroColumnas = 2+size;
		int totalColumnas = numeroColumnas*numeros.length();
		int puntoInicio = 0;
		int siguienteNumero = 0;
		char numeroNuevo = 0;
		numero = new Numero();		
		numero.setNumeroCol(numeroColumnas);
		numero.setNumeroFilas(numeroFilas);
		String [][] matriz;
		matriz = new String [numeroFilas][totalColumnas];


		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				//Determina en que momento cambia de numero
				//Y por cual numero cambia
				if((j)%(2+size) == 0){
					puntoInicio = j;
					siguienteNumero = puntoInicio/numeroColumnas;
					numeroNuevo = cambiarNumero(siguienteNumero, numeros);
				}
				//Usa el nuevo numero para ir creandolo sobre la matriz
				switch (numeroNuevo) {
				case '1':
					matriz[i][j] = numero.numeroUno(j, i, puntoInicio);
					break;
				case '2':
					matriz[i][j] = numero.numeroDos(j, i, puntoInicio);
					break;
				case '3':
					matriz[i][j] = numero.numeroTres(j, i, puntoInicio);
					break;
				case '4':
					matriz[i][j] = numero.numeroCuatro(j, i, puntoInicio);
					break;
				case '5':
					matriz[i][j] = numero.numeroCinco(j, i, puntoInicio);
					break;
				case '6':
					matriz[i][j] = numero.numeroSeis(j, i, puntoInicio);
					break;
				case '7':
					matriz[i][j] = numero.numeroSiete(j, i, puntoInicio);
					break;
				case '8':
					matriz[i][j] = numero.numeroOcho(j, i, puntoInicio);
					break;
				case '9':
					matriz[i][j] = numero.numeroNueve(j, i, puntoInicio);
					break;
				case '0':
					matriz[i][j] = numero.numeroCero(j, i, puntoInicio);
					break;

				default:
					break;
				}


			}
		}

		return matriz;
	}

	/**
	 * 
	 * @param SiguienteNumero Siguiente numero dentro de la cadena
	 * @param numeros Cadena de numeros a imprimir
	 * @return Nuevo numero ha agregar en la matriz
	 */
	public char cambiarNumero(int siguienteNumero, String numeros){

		char nuevoNumero = numeros.charAt(siguienteNumero);

		return nuevoNumero;

	}
	
	/**
	 * Metodo encargado de imprimir la matriz de numeros
	 *  
	 * @param size Tamaño de impresion de los numeros
	 * @param cadena Cadena de numeros a imprimir
	 * 
	 */
	public void imprimirMatriz(String[][] matriz){
		
		System.out.println("");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
	}


}
