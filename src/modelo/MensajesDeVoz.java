/* MensajesDeVoz.java
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
public class MensajesDeVoz extends Mensaje {
	
	public MensajesDeVoz(String texto) {
		super(texto);
	}

	@Override
	protected String getContent() {
		return "[---" + super.getContent() + "---]";
	}
}
