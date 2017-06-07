/* Mensajeria.java
 * Creado el 6 jun. 2017
 */

package vista;

import modelo.MensajesDeImagen;
import modelo.MensajesDeTexto;
import modelo.MensajesDeVoz;
import modelo.SalaChat;
import modelo.Usuario;

/**
 * Add one sentence class summary here.
 * Add class description here.
 *
 * @author Fernando J. Spitz
 * @version 1.0, 6 jun. 2017
 */
public class Mensajeria {
	public static void main(String[] args) {
		IMostrador vista = new VistaChat();
		
		Usuario pedro = new Usuario(vista, "Pedro");
		Usuario maria = new Usuario(vista, "Maria");
		Usuario fernando = new Usuario(vista, "Fernando");
		Usuario ezequiel = new Usuario(vista, "Ezequiel");
		
		SalaChat chat1 = new SalaChat("UADEProgra3");
		SalaChat chat2 = new SalaChat("UADEAIOO");
		
		// Ingresan usuarios a las salas de chat...
		
		chat1.agregar(pedro);
		chat1.agregar(maria);
		
		chat2.agregar(maria);
		chat2.agregar(fernando);
		
		// Pedro envia un mensaje de texto a la sala UADEProgra3
		pedro.enviarMensaje(chat1, new MensajesDeTexto("Hola a todos!"));
		
		// Fernando envia un mensaje de audio a la sala UADEIOO
		fernando.enviarMensaje(chat2, new MensajesDeVoz("Saludos grupooo"));
		
		// Maria envia un mensaje de imagen a la sala UADEProgra3
		maria.enviarMensaje(chat1, new MensajesDeImagen("IMAGEN"));
		
		chat2.agregar(ezequiel);
		fernando.enviarMensaje(chat2, new MensajesDeTexto("Hola ninjas!"));
		
		System.out.println("Existen " + Usuario.getCantidadUsuarios() + " usuarios en el sistema");
	}
}
