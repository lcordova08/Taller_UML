package Sistema_Clinico;

import java.util.Date;

public class Paciente extends Persona {
	protected String email;

	Paciente(String email, String usuario,String clave,String nombre,String apellido,String cedula,String direccion,Date fechaNac){
	super( usuario, clave, nombre,apellido, cedula, direccion,fechaNac);	
	
	}
	
	public boolean solicitarCita() {
		return true;
	}
}
