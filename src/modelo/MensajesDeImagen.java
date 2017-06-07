/* MensajesDeImagen.java
 * Creado el 7 jun. 2017
 */

package modelo;

/**
 * Add one sentence class summary here.
 * Add class description here.
 *
 * @author Fernando J. Spitz
 * @version 1.0, 7 jun. 2017
 */
public class MensajesDeImagen extends Mensaje {

	public MensajesDeImagen(String texto) {
		super(texto);
	}

	@Override
	protected String getContent() {
		return "{" + super.getContent() + "}";
	}
}
