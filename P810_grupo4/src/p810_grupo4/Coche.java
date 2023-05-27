package p810_grupo4;

public class Coche extends Vehiculo {
	private String tipoCarroceria;
	private int capacidadPasajeros;

	public Coche(String marca, String modelo, int ano, double precio, String tipoCarroceria, int capacidadPasajeros) {
		super(marca, modelo, ano, precio);
		this.tipoCarroceria = tipoCarroceria;
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
}
