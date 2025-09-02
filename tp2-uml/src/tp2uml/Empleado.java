package tp2uml;

import java.util.Date;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaDeNacimiento;
	private float sueldoBasico;
	
	public Empleado(String nombre2, int edad) {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	};
	public String getDireccion() {
		return direccion;
	};
	public float getSueldoBasico() {
		return sueldoBasico;
	};
	
    public abstract float calcularSueldoBruto();
    public abstract float calcularSueldoNeto();
    public abstract float calcularRetenciones();

	
}
