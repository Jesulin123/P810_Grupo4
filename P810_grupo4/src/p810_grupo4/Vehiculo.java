package p810_grupo4;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	private String marca;
	private String modelo;
	private int ano;
	private double precio;

	public Vehiculo(String marca, String modelo, int ano, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Vehiculo otro) {
		return Double.compare(this.precio, otro.precio);
	}
}
