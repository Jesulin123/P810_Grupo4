package p810_grupo4;

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
    }
    
}