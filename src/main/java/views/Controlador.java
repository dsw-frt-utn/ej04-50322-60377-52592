package views;

import data.Persistencia;
import domain.Marca;
import domain.Sucursal;
import domain.Vehiculo;
import domain.VehiculoCombustible;
import domain.VehiculoTipo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class Controlador {
    
     public void iniciar() {
        new MenuView(this).setVisible(true);
    }

    public void mostrarLista() {
        new ListarVehiculosView().setVisible(true);
    }

   public void mostrarAltaVehiculoView() {
    new AltaVehiculo().setVisible(true);
}
    
    public static ArrayList<VehiculoViewModel> getVehiculos(){
        ArrayList<VehiculoViewModel> vehiculos = new ArrayList<>();
        for(Vehiculo vehiculo : Persistencia.getVehiculos()) {
            vehiculos.add(new VehiculoViewModel(vehiculo));
        }
        return vehiculos;
    }
    
    public static Boolean altaVehiculo(String nombre, String pais, String patente, String modelo, int anio, double capacidad, double kmLitro, double litrosExtra){
        Marca marca = new Marca(nombre, pais);
        Sucursal sucursal = new Sucursal("SUC01", "Av. Belgrano 1200", "Tucumán", null);
        
        if(nombre == null){
            return false;
        }
        if(pais == null){
            return false;
        }
        if(patente == null){
            return false;
        }
        if(modelo == null){
            return false;
        }
        if(anio == 0){
            return false;
        }
        if(capacidad == 0){
            return false;
        }
        if(kmLitro == 0){
            return false;
        }
        if(litrosExtra == 0){
            return false;
        }
        
        
        Persistencia.setVehiculo(new VehiculoCombustible(
                patente,
                marca.getNombre(),
                modelo,
                anio,
                capacidad,
                sucursal,
                kmLitro,
                litrosExtra));
        return true;
    }
    
    public static double[] calcularConsumos(Map<String, Double> vehiculos){
        double consumoElectricos = 0;
        double consumoCombustible= 0;
        for(Map.Entry<String, Double> entry : vehiculos.entrySet()){
           double consumo = 0;
           Optional<Vehiculo> vehiculo = Persistencia.getVehiculo(entry.getKey());
           if(vehiculo.isPresent()){
               consumo = vehiculo.get().calcularConsumo(entry.getValue());
               consumoElectricos += vehiculo.get().esDe(VehiculoTipo.ELECTRICO) ? consumo : 0;
               consumoCombustible += vehiculo.get().esDe(VehiculoTipo.COMBUSTIBLE) ? consumo : 0;
           }
        }
        return new double[] {consumoElectricos, consumoCombustible};
    }
}
