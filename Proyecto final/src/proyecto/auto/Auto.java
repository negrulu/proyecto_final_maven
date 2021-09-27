package proyecto.auto;
import java.time.LocalDate;

public class Auto {
	String placa;
	String modelo;
	String marca;
	String anioFabricacion;
	String paisFabricacion;
	String cilindraje;
	String avaluo;
	LocalDate fechaReserva;
	LocalDate fechaEntrega;
	Automovil automovil;
	Camioneta camioneta;
	String cedula;
	String estado;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getPaisFabricacion() {
		return paisFabricacion;
	}
	public void setPaisFabricacion(String paisFabricacion) {
		this.paisFabricacion = paisFabricacion;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getAvaluo() {
		return avaluo;
	}
	public void setAvaluo(String avaluo) {
		this.avaluo = avaluo;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Automovil getAutomovil() {
		return automovil;
	}
	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}
	public Camioneta getCamioneta() {
		return camioneta;
	}
	public void setCamioneta(Camioneta camioneta) {
		this.camioneta = camioneta;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Auto [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", anioFabricacion="
				+ anioFabricacion + ", paisFabricacion=" + paisFabricacion + ", cilindraje=" + cilindraje + ", avaluo="
				+ avaluo + ", fechaReserva=" + fechaReserva + ", fechaEntrega=" + fechaEntrega + ", automovil="
				+ automovil + ", camioneta=" + camioneta + ", cedula=" + cedula + ", estado=" + estado + "]";
	}
	

}
