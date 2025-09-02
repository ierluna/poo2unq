package tp2uml;

public class EmpleadoPlantaPermanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	
	public EmpleadoPlantaPermanente(String nombre2, int edad) {
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