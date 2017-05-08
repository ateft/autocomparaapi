package mx.santander.autocompara.models;


public class Vehiculo {

    private Long id = null;
    private String nombre = null;

    public Vehiculo() {
        super();
    }

    public Vehiculo(Long id, String nombre, TipoEnum tipo, String version) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.version = version;
    }

    private TipoEnum tipo = null;

    private String version = null;

    public Vehiculo id(Long id) {
        this.id = id;
        return this;
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

    public TipoEnum getTipo() {
        return tipo;
    }
    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }


}

