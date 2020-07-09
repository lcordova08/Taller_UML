package Sistema_Clinico;

import java.util.Date;

public class Paciente extends Persona {
	protected String email;
	
	//Variable de composicion 
	protected HistoriaClinica hisClinica;
	;

	Paciente( String email, String usuario,String clave,String nombre,String apellido,String cedula,String direccion,Date fechaNac){
	super( usuario, clave, nombre,apellido, cedula, direccion,fechaNac);
	//Aplicando la composicion
	hisClinica = new HistoriaClinica();
	
	}
	
	public boolean solicitarCita() {
		return true;
	}
}
