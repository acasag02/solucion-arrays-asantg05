package es.unileon.prg.tema7;
/**
 * Clase con los ejercicios correspondientes a arrays de tipos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	protected String obtenerPractica(){
		return "P-ARR";
	}

	protected String obtenerBloque() {
		return "Arrays de tipos basicos";
	}

	/**
	 * Arrays de tipos basicos - Ejercicio1.
	 *
	 * </br>
	 *
	 * Completar el metodo para crear y rellenar un vector de cien posiciones
	 * que contenga los primeros cien numeros pares. Una vez creada, se debera
	 * mostrar el contenido del vector por pantalla.
	 */
	public void ejercicio01() {
		cabecera("01", "Generar vector con los 100 primeros numeros pares");

		// Inicio modificacion
		int[] vector = new int[100];
		for(int i=0 ; i<100 ; i++) {
			vector[i] = i*2;
		}
		for(int i=0 ; i<100 ; i++) {
			System.out.println(vector[i]);
		}
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio2.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.TXT el porque de los resultados
	 * <li> Modificar el codigo a fin de evitar la excepcion producida
	 *      y mostrar todo el contenido del vector.
	 * </ul>
	 */
	public void ejercicio02() {
		cabecera("02","Mostrar vector por pantalla");

		// Inicio modificacion
		int[] arrayEnteros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print(" { ");
		for(int i=0 ; i < arrayEnteros.length ; i++) {
			System.out.print(" "+arrayEnteros[i]+",");
		}
		System.out.print(" } ");
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio3.
	 *
	 * </br>
	 *
	 * Completar el metodo para crear una matriz que contenga la tabla de
	 * multiplicar del numero 8. Una vez creada, se debera mostrar el
	 * contenido del vector por pantalla.
	 */
	public void ejercicio03() {
		cabecera("03", "Tabla de multiplicar del ocho");

		// Inicio modificacion
		int[][] matriz = new int[10][3];
		for(int i=0 ; i<10 ; i++) {
			matriz[i][0] = i+1;
			matriz[i][1] = 8;
			matriz[i][2] = matriz[i][0] * matriz[i][1];
		}
		for(int i=0 ; i<10 ; i++) {
			System.out.println(matriz[i][0] + "*" + matriz[i][1] + "=" + matriz[i][2]);
		}
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio4.
	 *
	 * </br>
	 *
	 * Se pide completar el metodo para mostrar por pantalla el tablero
	 * indicado en el enunciado de la practica.
	 */
	public void ejercicio04() {
		cabecera("04", "BonoLotoADA");

		// Inicio modificacion
		int[][] tablero = { {  0,  1,  2,  3,  4,  5,  6,  7,  8,  9 },
			                { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
			                { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 },
			                { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 },
			                { 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 } };

		System.out.println();
		System.out.println("Loterias y Apuestas del Estado - BonoLotoADA");
		System.out.println();

		for(int numApuesta=1 ; numApuesta <= 3 ; numApuesta++) {
			System.out.println("Apuesta: "+numApuesta);

			for(int i=0 ; i < tablero.length ; i++) {
				for(int j=0 ; j < tablero[i].length ; j++) {
					System.out.printf("[%2d]",tablero[i][j]);
				}
				System.out.println();
			}

			System.out.println();
		}
		// Fin modificacion

	}
}
