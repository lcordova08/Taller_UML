package Sistema_Clinico;

import java.util.Date;

public class Doctor extends Persona {
	protected Boolean disponibilidad;	
	
Doctor(Boolean disponibilidad,String usuario,String clave,String nombre,String apellido,String cedula,String direccion,Date fechaNac){
	
	super( usuario, clave, nombre,apellido,cedula, direccion, fechaNac);
	this.disponibilidad = disponibilidad;
}

public void Recetar() {
	
}

public void Correo(usuario ) {
	
}
public void RegistraSecretaria(secretaria) {
	
}
public void EliminarSecretaria(secretaria) {
	
}
public void PlanNutricional(paciente) {

}

}

