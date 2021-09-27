package proyecto.auto;

public class Camioneta extends Auto{
	String peso;

	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Camioneta [pesoSoportado=" + peso + "]";
	}

}
