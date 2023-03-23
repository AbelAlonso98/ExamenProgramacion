package ejercicio1;

public class Furgoneta extends VehiculoMercancias {

	public Furgoneta(String matricula, int PMA) {
		super(matricula, PMA);
	}

	@Override
	public String toString() {
		return "Furgoneta [PMA=" + PMA + ", matricula=" + matricula + "]";
	}


}
