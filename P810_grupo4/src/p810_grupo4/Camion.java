package p810_grupo4;

public class Camion extends Vehiculo {
	private double capacidadCarga;

	public Camion(String marca, String modelo, int ano, double precio, double capacidadCarga) {
		super(marca, modelo, ano, precio);
		this.capacidadCarga = capacidadCarga;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
}
