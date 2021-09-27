package proyecto.auto;

public class Automovil extends Auto{
	String numeroPuertas;

	public String getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	@Override
	public String toString() {
		return "Automovil [numeroPuertas=" + numeroPuertas + "]";
	}

}
