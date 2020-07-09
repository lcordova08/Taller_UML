package Sistema_Clinico;

import java.util.Date;

public class Cita  {
	protected Date fecha;
	protected boolean pagada;
	protected String registradoPor;
	
	//Variable de Asociacion (Una cita tiene una secretaria)
	protected Secretaria secretaria;
	//Variable de Asociacion (Una cita tiene un doctor)
	protected Doctor doctor;
	
	public void realizarPago(Pago p) { //Poner en el argumento Pago p
		
	}
}
