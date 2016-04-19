package es.unileon.prg.tema7;
/**
 * Clase que representa un banco
 *
 * @author PRG
 * @version 3.0
 */
public class Banco{

	/**
	 * Numero maximo de titulares de la cuenta
	 */
	private static int NUM_MAX_CUENTAS = 50;

    /**
     * Nombre del banco
     */
    private String nombre;
    /**
     * Cuentas bancaria del banco
     */
    private CuentaBancaria[] cuentas;

    /**
     * Constructor que recibe por parametro el nombre del banco
     *
     * @param nombre Nomre del banco
     */
    public Banco(String nombre){
		this.nombre = nombre;
		this.cuentas = new CuentaBancaria[NUM_MAX_CUENTAS];
    }

    /**
     * Se aniade una cuenta al banco
     *
     * @return <code> true </code> Proceso correcto <code> false </code> En caso contrario
     */
    public boolean anyadir(CuentaBancaria cuenta) {
		boolean correcto;

		int contador = 0;
		correcto = false;
		while ((contador < cuentas.length) && (cuentas[contador] != null)) {
			contador++;
		}

		if(contador != NUM_MAX_CUENTAS) {
			cuentas[contador] = cuenta;
			correcto = true;
		}

		return correcto;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
    public String toString(){
		StringBuffer salida = new StringBuffer();

		salida.append("Banco  : " + nombre + "\n");
		int contador = 0;
		while ((contador < cuentas.length) && (cuentas[contador] != null)) {
			salida.append("\n");
			salida.append("Cuenta " + (contador+1) + " ");
			salida.append(cuentas[contador]);
			contador++;
		}

		return salida.toString();
    }
}
