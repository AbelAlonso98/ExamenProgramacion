package ejercicio1;

public abstract class VehiculoPasajeros extends Vehiculo {




	int plazas;
	
	public VehiculoPasajeros(String matricula) {
		super(matricula);
	}
	
	public VehiculoPasajeros(String matricula, int plaza) {
		super(matricula);
		this.plazas=plaza;
	}
	

	@Override
	public String toString() {
		return "VehiculoPasajeros [plazas=" + plazas + ", matricula=" + matricula + "]";
	}
}
