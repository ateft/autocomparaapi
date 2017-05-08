package mx.santander.autocompara.models;


import java.util.ArrayList;
import java.util.List;


public class Modelo {

    private Long id = null;
    private String nombre = null;
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();


    public Modelo(Long id, String nombre, List<Vehiculo> vehiculos) {
        this.id = id;
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }

    public Modelo() {
        super();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Modelo addVehiculosItem(Vehiculo vehiculosItem) {
        this.vehiculos.add(vehiculosItem);
        return this;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}

