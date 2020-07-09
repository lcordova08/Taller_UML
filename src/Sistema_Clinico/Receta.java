package Sistema_Clinico;

import java.util.ArrayList;
import java.util.Date;

public class Receta {
	protected Date fecha;
	
	//Variable de Asociacion (Una receta solo puede ser proporcionada por 1 doctor)
	protected Doctor doctor;
	//Variable de Composicion (Una receta tiene 1 o varios plan nutricional)
	protected ArrayList<PlanNutricional> planNutri;
	//Variable de composicion (Una receta tiene 1 o varios medicamentos)
	protected ArrayList<Medicamento> medicamentos;
	
	
	Receta(Date fecha){
		this.fecha = fecha;		
	}
}
