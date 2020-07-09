package Sistema_Clinico;

import java.util.ArrayList;
import java.util.Date;

public class Secretaria extends Persona{
	
	//Variable de Asociacion (Una secretaria maneja varias citas)
	 protected ArrayList<Cita> citas;
	//Variabel de Agregacion (La secretaria solo puede tener 1 doctor)
	protected Doctor  doSec;
	
	Secretaria(Doctor doSec, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		
	}
	public void verificarCita() {
		
	}
	public void agendarCita() {
		
	}
}
