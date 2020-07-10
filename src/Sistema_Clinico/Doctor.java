package Sistema_Clinico;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Persona {
	protected int regDoctor;
	protected String especialidad;
	
	//Variable de Asociacion (Un doctor atiende varias citas)
 	protected ArrayList<Cita> citas;
	//Variable de Asociacion (El doctor solo puede tener una secretaria)
	protected Secretaria secretaria;
	//Variable de Agregacion (El docotor puede tener muchas Areas Medicas)
	protected ArrayList<AreaMedica> areaMedica;	
	//Variable de Asociacion (Un doctor puede proporcionar varias recetas)
	protected ArrayList<Receta>recetas;
	
Doctor(AreaMedica especialidadDoctor,int regDoctor,String especialidad,String usuario,String clave,String nombre,String apellido,String cedula,String direccion,Date fechaNac){
	super( usuario, clave, nombre,apellido,cedula, direccion, fechaNac);
	this.regDoctor = regDoctor;
	this.especialidad = especialidad;
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

