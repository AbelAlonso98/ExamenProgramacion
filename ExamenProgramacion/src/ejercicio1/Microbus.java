package ejercicio1;

public class Microbus extends VehiculoPasajeros {

	public Microbus(String matricula, int plaza) {
		super(matricula, plaza);
	}
	
	@Override
	public float getPrecioAlquiler(int dias) {
		return super.getPrecioAlquiler(dias)+2f*plazas*dias;
	}

	@Override
	public String toString() {
		return "Microbus [plazas=" + plazas + ", matricula=" + matricula + "]";
	}




}
