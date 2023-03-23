package ejercicio1;

public class Camion extends VehiculoMercancias {

	public Camion(String matricula, int PMA) {
		super(matricula, PMA);
	}


	
	@Override
	public float getPrecioAlquiler(int dias) {
		return super.getPrecioAlquiler(dias)+40f*dias;
	}



	@Override
	public String toString() {
		return "Camion [PMA=" + PMA + ", matricula=" + matricula + "]";
	}
}
