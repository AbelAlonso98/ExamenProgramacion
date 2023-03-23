package ejercicio1;

public abstract class Vehiculo implements Comparable<Vehiculo>{

	String matricula;
	float precio = 50;
	
	public Vehiculo(String matricula) {
		this.matricula = matricula;
	}
	
	public float getPrecioAlquiler(int dias) {
		return precio*dias;
	}
	
	public int compareTo(Vehiculo o) {
		return matricula.compareTo(o.matricula);
	}
	

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula +"]";
	}
}
