/* Usuario.java
 * Creado el 6 jun. 2017
 */

package modelo;

import java.util.Observable;
import java.util.Observer;

import vista.IMostrador;

/**
 * Add one sentence class summary here.
 * Add class description here.
 *
 * @author Fernando J. Spitz
 * @version 1.0, 6 jun. 2017
 */
public class Usuario implements Observer {
	private static int cantidadUsuarios;
	private String nombre;
	private IMostrador vista;
	
	public Usuario(IMostrador vista, String nombre) {
		this.vista = vista;
		this.nombre = nombre;
		cantidadUsuarios++;
	}

	public static int getCantidadUsuarios() {
		return cantidadUsuarios;
	}
	
	public void enviarMensaje(SalaChat chat, Mensaje mensaje) {
		chat.agregarMensaje(mensaje);
	}

	@Override
	public void update(Observable chat, Object mensaje) {
		StringBuilder textoAMostrar = new StringBuilder();
		
		textoAMostrar.append("[" + chat + "]\n");		// TODO: Esto agrega el chatroom al principio
		textoAMostrar.append(this.nombre + " RECIBIO MENSAJE\n");
		if (mensaje instanceof MensajesDeTexto) {
			textoAMostrar.append("MENSAJE DE TEXTO\n");
		} else if (mensaje instanceof MensajesDeVoz) {
			textoAMostrar.append("MENSAJE DE AUDIO\n");
		} else if (mensaje instanceof MensajesDeImagen) {
			textoAMostrar.append("MENSAJE DE IMAGEN\n");
		}
		textoAMostrar.append("CONTENIDO: " + ((Mensaje) mensaje).getContent() + "\n");
		vista.mostrar(textoAMostrar.toString());
	}
}
