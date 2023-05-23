package p810_grupo4;


public class Vehiculo implements Comparable<Vehiculo>{
    private String marca;
    private String modelo;
    private int año;
    private int precio;
    
    //Constructor

    public Vehiculo(String marca, String modelo, int año, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }
    
    //getters y setters

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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Vehiculo otroVehiculo) {
        return Double.compare(this.precio, otroVehiculo.getPrecio());
    }
    
}
