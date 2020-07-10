package Sistema_Clinico;

import java.util.ArrayList;

public class AreaMedica {
	protected String especialidad;
	protected float costo;
	//Variable de asociacion (Area Medica tiene varios doctores) 
	protected ArrayList<Doctor> doctor;
	
	AreaMedica(String especialidad,float costo){
		this.especialidad = especialidad;
		this.costo = costo;
	
	}
}
