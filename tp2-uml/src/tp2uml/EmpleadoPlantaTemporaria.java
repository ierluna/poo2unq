package tp2uml;

import java.util.Date;

public class EmpleadoPlantaTemporaria extends Empleado {
	private Date fechaFinDesignacion;
	private int cantidadHorasExtras;
	
	public EmpleadoPlantaTemporaria(String nombre2, int edad) {
		super(nombre2, edad);
	}

	
    @Override
    public float calcularSueldoBruto() {
        throw new UnsupportedOperationException("Aun no implementado");
    }

    @Override
    public float calcularSueldoNeto() {
        throw new UnsupportedOperationException("Aun no implementado");
    }

    @Override
    public float calcularRetenciones() {
        throw new UnsupportedOperationException("Aun no implementado");
    }
}
