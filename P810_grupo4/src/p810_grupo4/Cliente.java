package p810_grupo4;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Comparable<Cliente> {
	private String nombre;
	private String direccion;
	private List<Vehiculo> vehiculosComprados;

	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.setDireccion(direccion);
		this.vehiculosComprados = new ArrayList<>();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int compareTo(Cliente otro) {
		return this.nombre.compareTo(otro.nombre);
	}

	public void comprarVehiculo(Vehiculo vehiculo) {
		this.vehiculosComprados.add(vehiculo);
	}

	public List<Vehiculo> getVehiculosComprados() {
		return this.vehiculosComprados;
	}

}
