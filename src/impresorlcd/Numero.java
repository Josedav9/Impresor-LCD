package impresorlcd;


/**
 * 
 * @author Jose Alvarez
 *
 */
public class Numero {
	
	//Se usan para determinar el tamño de los numeros
	private int numeroFilas;
	private int numeroCol;
	//Simbolos para imprimir
	static final String CARACTER_VER = "|";
	static final String CARACTER_HOR = "-";

	
	/**
	 *
	 * Metodo encargado de crear el numero 1 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */
	public String numeroUno(int posicionX, int posicionY, int puntoInicial){
		String numero = "";
		if(posicionX == numeroCol-1+puntoInicial){
			numero = CARACTER_VER;
		}
		else{
			numero = " ";
		}
		return numero;
	}
	
	/**
	 *
	 * Metodo encargado de crear el numero 2 dentro de la matriz
	 * sando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */

	public String numeroDos(int posicionX, int posicionY, int puntoInicial){
		String numero = "";

		if( posicionX > puntoInicial && posicionX<numeroCol-1+puntoInicial && 
				(posicionY == 0 || posicionY == numeroFilas/2 || posicionY == numeroFilas-1)){
			numero = CARACTER_HOR;
		}
		else if (posicionX == numeroCol+puntoInicial-1 && 
				(posicionY>0 && posicionY<numeroFilas/2)){
			numero = CARACTER_VER;
		}
		else if(posicionX == puntoInicial && 
				(posicionY >numeroFilas/2 && posicionY< numeroFilas-1)){
			numero = CARACTER_VER;
		}
		else{
			numero =" ";
		}
		return numero;
	}
	
	/**
	 *
	 * Metodo encargado de crear el numero 3 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */

	public String numeroTres(int posicionX, int posicionY, int puntoInicial){
		String numero ="";

		if( posicionX >puntoInicial && posicionX<numeroCol+puntoInicial-1 && 
				(posicionY == 0 || posicionY == numeroFilas/2 || posicionY == numeroFilas-1)){
			numero = CARACTER_HOR;
		}
		else if (posicionX == numeroCol+puntoInicial-1 && 
				((posicionY>0 && posicionY<numeroFilas/2)||
						(posicionY>numeroFilas/2 && posicionY < numeroFilas -1))){
			numero = CARACTER_VER;
		}
		else {
			numero = " ";
		}

		return numero;
	}
	
	/**
	 *
	 * Metodo encargado de crear el numero 4 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */
	
	public String numeroCuatro(int posicionX, int posicionY, int puntoInicial){
		String numero ="";

		if((posicionX == puntoInicial || posicionX == puntoInicial+numeroCol-1) 
				&& posicionY < numeroFilas/2){
			numero = CARACTER_VER;
		}
		else if((posicionX > puntoInicial && posicionX < numeroCol+puntoInicial-1) 
				&& posicionY == numeroFilas/2 ){
			numero = CARACTER_HOR;
		}
		else if (posicionY > numeroFilas/2 && posicionX == numeroCol+puntoInicial-1){
			numero = CARACTER_VER;
		}
		else {
			numero = " ";
		}

		return numero;
	}

	/**
	 *
	 * Metodo encargado de crear el numero 5 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */
	
	public String numeroCinco(int posicionX, int posicionY, int puntoInicial){
		String numero ="";

		if( posicionX > puntoInicial && posicionX<numeroCol+puntoInicial-1 && 
				(posicionY == 0 || posicionY == numeroFilas/2 || posicionY == numeroFilas-1)){
			numero = CARACTER_HOR;
		}
		else if(posicionX == puntoInicial && 
				(posicionY>0 && posicionY<numeroFilas/2)){
			numero = CARACTER_VER;
		}
		else if (posicionX == numeroCol+puntoInicial-1 && 
				(posicionY > numeroFilas/2 && posicionY< numeroFilas-1)){
			numero = CARACTER_VER;
		}

		else {
			numero = " ";
		}

		return numero;
	}


	/**
	 *
	 * Metodo encargado de crear el numero 6 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */
	
	public String numeroSeis(int posicionX, int posicionY, int puntoInicial){
		String numero ="";

		if( posicionX > puntoInicial && posicionX<numeroCol+puntoInicial-1 && 
				(posicionY == 0 || posicionY == numeroFilas/2 || posicionY == numeroFilas-1)){
			numero = CARACTER_HOR;
		}
		else if(posicionX == puntoInicial && 
				(posicionY>0 && posicionY!=numeroFilas/2 && posicionY<numeroFilas-1)){
			numero = CARACTER_VER;
		}
		else if (posicionX == numeroCol+puntoInicial-1 && 
				(posicionY > numeroFilas/2 && posicionY< numeroFilas-1)){
			numero = CARACTER_VER;
		}

		else {
			numero = " ";
		}


		return numero;
	}

	/**
	 *
	 * Metodo encargado de crear el numero 7 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */

	public String numeroSiete(int posicionX, int posicionY, int puntoInicial){
		String numero ="";

		if( (posicionX > puntoInicial && posicionX<numeroCol+puntoInicial-1) 
				&& posicionY == 0){
			
			numero = CARACTER_HOR;
		}
		else if (posicionX == numeroCol+puntoInicial-1 && posicionY>0){
			numero = CARACTER_VER;
		}
		else {
			numero = " ";
		}

		return numero;
	}
	
	/**
	 *
	 * Metodo encargado de crear el numero 8 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */

	public String numeroOcho(int posicionX, int posicionY, int puntoInicial){
		String numero ="";

		if( posicionX >puntoInicial && posicionX<numeroCol+puntoInicial-1 && 
				(posicionY == 0 || posicionY == numeroFilas/2 || posicionY == numeroFilas-1)){
			numero = CARACTER_HOR;
		}
		else if((posicionX == puntoInicial || posicionX==numeroCol+puntoInicial-1) && 
				(posicionY>0 && posicionY!=numeroFilas/2 && posicionY<numeroFilas-1)){
			numero = CARACTER_VER;
		}

		else {
			numero = " ";
		}

		return numero;
	}
	
	/**
	 *
	 * Metodo encargado de crear el numero 9 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */

	public String numeroNueve(int posicionX, int posicionY, int puntoInicial){
		String numero ="";

		if( (posicionX > puntoInicial && posicionX<numeroCol+puntoInicial-1) && 
				(posicionY == 0 || posicionY == numeroFilas/2)){
			numero = CARACTER_HOR;
		}
		else if ((posicionX == numeroCol+puntoInicial-1 && posicionY>0) || 
				(posicionX == puntoInicial && (posicionY>0 && posicionY< numeroFilas/2))){
			numero = CARACTER_VER;
		}
		else {
			numero = " ";
		}

		return numero;
	}
	
	/**
	 *
	 * Metodo encargado de crear el numero 0 dentro de la matriz
	 * usando lo puntos fijos
	 * 
	 * 
	 * @param posicionX Columna a imprimir
	 * @param posicionY Fila a imprimir
	 * @param puntoInicial Punto desde el cual empieza el numero dentro de la matriz
	 * @return Caracter a a posicionar en [i][j]  
	 */
	public String numeroCero(int posicionX, int posicionY, int puntoInicial){
		String numero ="";

		if( posicionX >puntoInicial && posicionX<numeroCol+puntoInicial-1 && 
				(posicionY == 0 || posicionY == numeroFilas-1)){
			numero = CARACTER_HOR;
		}
		else if((posicionX == puntoInicial || posicionX==numeroCol+puntoInicial-1) && 
				(posicionY>0 && posicionY<numeroFilas-1)){
			numero = CARACTER_VER;
		}

		else {
			numero = " ";
		}

		return numero;
	}
	

	//Set NumeroCol
	public void setNumeroCol(int numeroCol) {
		this.numeroCol = numeroCol;
	}
	//Set NumeroFilas
	public void setNumeroFilas(int numeroFilas) {
		this.numeroFilas = numeroFilas;
	}
	//GET numero columnas
	public int getNumeroCol() {
		return numeroCol;
	}
	//GET numero Filas
	public int getNumeroFilas() {
		return numeroFilas;
	}

}


