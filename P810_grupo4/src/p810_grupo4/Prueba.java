package p810_grupo4;

import java.util.List;

public class Prueba {


    public static void main(String[] args) {

        Concesionario concesionario = new Concesionario();

        Vehiculo vehiculo1 = new Vehiculo("seat", "panda", 2003, 8000);
        Vehiculo vehiculo2 = new Vehiculo("mercedes", "c", 2016, 30000);
        Vehiculo vehiculo3 = new Vehiculo("kia", "niro", 2020, 23000);

        concesionario.agregarVehiculo(vehiculo1);
        concesionario.agregarVehiculo(vehiculo2);
        concesionario.agregarVehiculo(vehiculo3);


        System.out.println("Vehículos disponibles:");
        concesionario.mostrarVehiculosDisponibles();

        System.out.println("Búsqueda de vehículos:");
        String marcaBusqueda = "kia";
        String modeloBusqueda = null;
        int añoBusqueda = 2020;
        
        System.out.println("Resultados de la búsqueda:");
        List<Vehiculo> vehiculosEncontrados = concesionario.buscarVehiculos(marcaBusqueda, modeloBusqueda, añoBusqueda);
        for (Vehiculo vehiculo : vehiculosEncontrados) {
            System.out.println(vehiculo.toString());
        }
        
        Vehiculo vehiculoMasCaro = concesionario.obtenerVehiculoMasCaro();
        System.out.println("Vehículo más caro: " + vehiculoMasCaro.toString());

        Vehiculo vehiculoMasBarato = concesionario.obtenerVehiculoMasBarato();
        System.out.println("Vehículo más barato: " + vehiculoMasBarato.toString());


        Cliente cliente = new Cliente("Ruben");
        concesionario.venderVehiculo("seat", "Ruben");
    
    }
    
}