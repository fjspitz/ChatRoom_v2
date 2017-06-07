/* VistaChat.java
 * Creado el 6 jun. 2017
 */

package vista;

/**
 * Add one sentence class summary here.
 * Add class description here.
 *
 * @author Fernando J. Spitz
 * @version 1.0, 6 jun. 2017
 */
public class VistaChat implements IMostrador {

	@Override
	public void mostrar(String mensaje) {
		System.out.println(mensaje);
	}
}
