package ejercicio1;

public class Coche extends VehiculoPasajeros {

	public Coche(String matricula, int plaza) {
		super(matricula, plaza);
	}
	
	@Override
	public float getPrecioAlquiler(int dias) {
		return super.getPrecioAlquiler(dias)+(1.5f*plazas*dias);
	}

	@Override
	public String toString() {
		return "Coche [plazas=" + plazas + ", matricula=" + matricula + "]";
	}




}
