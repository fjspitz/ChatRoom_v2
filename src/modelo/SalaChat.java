/* SalaChat.java
 * Creado el 6 jun. 2017
 */

package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Add one sentence class summary here.
 * Add class description here.
 *
 * @author Fernando J. Spitz
 * @version 1.0, 6 jun. 2017
 */
public class SalaChat extends Observable {
	private String nombre;
	private int cantidadUsuarios;
	private List<Usuario> usuarios;
	
	public SalaChat(String nombre) {
		this.nombre = nombre;
		usuarios = new ArrayList<Usuario>();
	}
	
	public void agregar(Usuario usuario) {
		usuarios.add(usuario);
		addObserver(usuario);		// Agregamos al observador
	}
	
	public void agregarMensaje(Mensaje mensaje) {
		setChanged();
		notifyObservers(mensaje);
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidadUsuarios() {
		return cantidadUsuarios;
	}

	public void setCantidadUsuarios(int cantidadUsuarios) {
		this.cantidadUsuarios = cantidadUsuarios;
	}

	@Override
	public String toString() {
		return "SalaChat: " + nombre;
	}
}
