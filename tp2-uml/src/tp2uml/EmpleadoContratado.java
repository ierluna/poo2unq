package tp2uml;

public class EmpleadoContratado extends Empleado {
	private int numeroContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, int edad, int numeroContrato, String medioPago) {
		super(nombre,edad);
		
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