/* Mensaje.java
 * Creado el 6 jun. 2017
 */

package modelo;

/**
 * Add one sentence class summary here.
 * Add class description here.
 *
 * @author Fernando J. Spitz
 * @version 1.0, 6 jun. 2017
 */
public abstract class Mensaje {
	private String texto;
	
	protected Mensaje(String texto) {
		this.texto = texto;
	}
	
	protected String getContent() {
		return this.texto;
	}
}
