package Sistema_Clinico;

import java.util.Date;

public class Secretaria extends Persona{
	Doctor  doSec;
	Secretaria(Doctor doSec, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		
	}
	public void verificarCita() {
		
	}
	public void agendarCita() {
		
	}
}
