package p810_grupo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Concesionario {
	private List<Vehiculo> inventario;
    
	public Concesionario() {
        inventario = new ArrayList<>();
    }

	 public void agregarVehiculo(Vehiculo vehiculo) {
	        inventario.add(vehiculo);
	    }
	  public void mostrarVehiculosDisponibles() {
	        List<Vehiculo> vehiculosDisponibles = new ArrayList<>(inventario);
	        Collections.sort(vehiculosDisponibles, Comparator.comparingDouble(Vehiculo::getPrecio));
	        for (Vehiculo vehiculo : vehiculosDisponibles) {
	            System.out.println(vehiculo.toString());
	        }
	        
	    }
}
