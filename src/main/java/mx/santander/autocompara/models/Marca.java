package mx.santander.autocompara.models;

import java.util.ArrayList;
import java.util.List;

public class Marca {

    private Long id = null;
    private String nombre = null;
    private List<Modelo> modelos = new ArrayList<Modelo>();


    public Marca(Long id, String nombre, List<Modelo> modelos) {
        this.id = id;
        this.nombre = nombre;
        this.modelos = modelos;
    }

    public Marca() {
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

    public Marca addModelosItem(Modelo modelosItem) {
        this.modelos.add(modelosItem);
        return this;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }
    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

}

