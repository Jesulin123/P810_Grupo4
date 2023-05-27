package p810_grupo4;

import java.util.*;

public class Concesionario {
	private List<Vehiculo> vehiculosDisponibles;

	public Concesionario() {
		this.vehiculosDisponibles = new ArrayList<>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.vehiculosDisponibles.add(vehiculo);
	}

	public void mostrarVehiculosOrdenados() {
		Collections.sort(this.vehiculosDisponibles);
		for (Vehiculo vehiculo : this.vehiculosDisponibles) {
			System.out.println(vehiculo);
		}
	}

	public Vehiculo buscarVehiculo(String marca, String modelo, int ano) {
		for (Vehiculo vehiculo : this.vehiculosDisponibles) {
			// Para que este código funcione, necesitarás implementar los métodos
			// getMarca(), getModelo() y getAno() en la clase Vehiculo.
			if (vehiculo.getMarca().equals(marca) && vehiculo.getModelo().equals(modelo) && vehiculo.getAno() == ano) {
				return vehiculo;
			}
		}
		return null;
	}

	public void mostrarVehiculoMasCaroYBarato() {
		if (this.vehiculosDisponibles.isEmpty()) {
			System.out.println("No hay vehículos disponibles.");
			return;
		}

		Collections.sort(this.vehiculosDisponibles);
		System.out.println("Vehículo más barato: " + this.vehiculosDisponibles.get(0));
		System.out.println("Vehículo más caro: " + this.vehiculosDisponibles.get(this.vehiculosDisponibles.size() - 1));
	}

	public void venderVehiculo(Vehiculo vehiculo, Cliente cliente) {
		if (this.vehiculosDisponibles.remove(vehiculo)) {
			cliente.comprarVehiculo(vehiculo);
		} else {
			System.out.println("Lo siento, el vehículo ya no está disponible.");
		}
	}
}
