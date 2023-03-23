package ejercicio1;

public abstract class VehiculoMercancias extends Vehiculo {

	
	int PMA;

	public VehiculoMercancias(String matricula) {
		super(matricula);
	}
	
	public VehiculoMercancias(String matricula, int PMA) {
		super(matricula);
		this.PMA = PMA;
	}
	public float getPrecioAlquiler(int dias) {
		return super.getPrecioAlquiler(dias)+PMA*20*dias;
	}
	@Override
	public String toString() {
		return "VehiculoMercancias [PMA=" + PMA + ", matricula=" + matricula + "]";
	}
}
