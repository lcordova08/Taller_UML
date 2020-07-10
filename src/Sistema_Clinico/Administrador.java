package Sistema_Clinico;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends Persona {
	//Variable de Asociacion  (Administrador puede registrar a varias personas)
	protected ArrayList<Persona> registrarPersona;
	
	Administrador(String usuario,String clave,String nombre,String apellido,String cedula,String direccion,Date fechaNac){
		super( usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
	}
	public void registrarUsuario() {
		
	}
	public void asignarRol(Persona p) {
		
	}

}
