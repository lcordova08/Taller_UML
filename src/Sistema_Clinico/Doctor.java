package Sistema_Clinico;

import java.util.Date;

public class Doctor extends Persona {
	protected int regDoctor;
	protected String especialidad;
	
AreaMedica especialidadDoctor;	//Doctor Pertenece a AreaMedica
Doctor(AreaMedica especialidadDoctor,int regDoctor,String especialidad,String usuario,String clave,String nombre,String apellido,String cedula,String direccion,Date fechaNac){
	super( usuario, clave, nombre,apellido,cedula, direccion, fechaNac);
	this.regDoctor = regDoctor;
	this.especialidad = especialidad;
	this.especialidadDoctor = especialidadDoctor;
	}

	
	public void recetar() {
		
	}
	public void agregarPlanNut() {
		
	}
	public void imprimirReceta() {
		
	}
	public void registrarSecretaria() {
		
	}

}

