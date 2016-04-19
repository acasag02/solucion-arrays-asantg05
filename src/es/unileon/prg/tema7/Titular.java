package es.unileon.prg.tema7;
/**
 * Clase que representa un titular de una cuenta bancaria
 *
 * @author PRG
 * @version 3.0
 */
public class Titular{
    /**
     * Nif del titular
     */
    private String _nif;
    /**
     * Nombre del titular
     */
    private String _nombre;
    /**
     * Edad del titular
     */
    private int _edad;
    /**
     * Cantidad que le permite el banco tener al descubierto
     */
    private int _credito;

    /**
     * Constructor que recibe todos los datos necesarios de una persona
     * @param nif Nif del titular
     * @param nombre Nombre del titular
     * @param edad Edad del titular
     * @param direccion Domicilio del titular
     * @param credito Cantidad que le permite el banco tener al descubierto
     */
    public Titular (String nif,
	     String nombre,
	     int edad,
	     int credito){
			 _nif = new String(nif);
			 _nombre = new String(nombre);
			 _edad = edad;
			 _credito = credito;
    }

    /**
     * Devuelve el nif del titular
     *
     * @return el nif del titular
     */
    public String obtenerNif (){
        return _nif;
    }

    /**
     * Devuelve el nombre del titular
     *
     * @return el nombre del titular
     */
    public String obtenerNombre (){
        return _nombre;
    }

    /**
     * Devuelve la edad del titular
     *
     * @return la edad del titular
     */
    public int obtenerEdad (){
        return _edad;
    }

    /**
     * Devuelve la credito del titular
     *
     * @return la credito del titular
     */
    public int obtenerCredito (){
        return _credito;
    }

    /**
     * Comprueba si el titular es mayor de edad
     * @return verdadero si el titular es mayor de edad y falso en
     * caso contrario
     */
    public boolean esMayorEdad(){
	if (_edad < 18)
	    return false;
	else
	    return true;
    }

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
    public String toString(){
		StringBuffer salida = new StringBuffer();

		salida.append("\n");
		salida.append("NIF      : " + _nif + "\n");
		salida.append("Nombre   : " + _nombre + "\n");
		salida.append("Edad     : " + _edad + "\n");
		salida.append("Credito  : " + _credito + "\n");

		return salida.toString();
    }
}
