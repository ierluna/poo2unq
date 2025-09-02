package tp2uml;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private int cuit;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String nombreEmpresa, int cuitEmpresa) {
		nombre= nombreEmpresa;
		cuit= cuitEmpresa;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getCuit() {
		return cuit;
	}
	
	public void calcularMontoTotalSueldosNetos(ArrayList<Empleado> empleados) {
        throw new UnsupportedOperationException("Aun no implementado");
	}
	
	public void calcularMontoTotalSueldosBrutos(ArrayList<Empleado> empleados) {
        throw new UnsupportedOperationException("Aun no implementado");
	}
	
	public void calcularMontoTotalRetenciones(ArrayList<Empleado> empleados) {
        throw new UnsupportedOperationException("Aun no implementado");
	}
	
	public void liquidarSueldos(ArrayList<Empleado> empleados) {
        throw new UnsupportedOperationException("Aun no implementado");
	}
	
}