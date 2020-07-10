package Sistema_Clinico;

import java.util.Date;


public class Cita {
	protected Date fecha;
	protected boolean pagada;
	protected String registradoPor;
	
	//Variable de Asociacion (Una cita tiene una secretaria)
	protected Secretaria secretaria;
	//Variable de Asociacion (Una cita tiene un doctor)
	protected Doctor doctor;
	
	public Cita(Date fecha, boolean pagada, String registradoPor, Secretaria secretaria, Doctor doctor) {
		super();
		this.fecha = fecha;
		this.pagada = pagada;
		this.registradoPor = registradoPor;
		this.secretaria = secretaria;
		this.doctor = doctor;
		
	}

	public void realizarPago(Pago p) {
		
	}

	
}
