package mx.santander.autocompara.commons;

import mx.santander.autocompara.models.Marca;
import mx.santander.autocompara.models.Modelo;
import mx.santander.autocompara.models.TipoEnum;
import mx.santander.autocompara.models.Vehiculo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Atef on 04/05/2017.
 */
public class MarcasDummy {

    public static List<Marca> getMarcasMock(){
        Vehiculo veh1 = new Vehiculo(1234556L, "FORD Fiesta", TipoEnum.AUTO, "AIRE");
        Vehiculo veh2 = new Vehiculo(1234557L, "FORD Escort", TipoEnum.AUTO, "CON AIRE 4 PUERTAS");
        Vehiculo veh3 = new Vehiculo(1234558L, "FORD Fusion", TipoEnum.AUTO, "AIRBAG");
        Vehiculo veh4 = new Vehiculo(1234558L, "FORD Fusion", TipoEnum.AUTO, "AIRBAG");
        Vehiculo veh5 = new Vehiculo(1234558L, "FORD Fusion", TipoEnum.AUTO, "AIRBAG");


        Modelo modelo1 = new Modelo(54321L, "2006", Arrays.asList(veh1, veh2, veh3));
        Modelo modelo2 = new Modelo(54321L, "2007", Arrays.asList(veh4, veh5));

        Marca marca = new Marca(571810L, "FORD", Arrays.asList(modelo1, modelo2));
        Marca marca2 = new Marca(571810L, "FORD USA", Arrays.asList(modelo1, modelo2));

        return Arrays.asList(marca, marca2);
    }

    public static Marca getMarcaMock(){
        Vehiculo veh1 = new Vehiculo(1234556L, "FORD Fiesta", TipoEnum.AUTO, "AIRE");
        Vehiculo veh2 = new Vehiculo(1234557L, "FORD Escort", TipoEnum.AUTO, "CON AIRE 4 PUERTAS");
        Vehiculo veh3 = new Vehiculo(1234558L, "FORD Fusion", TipoEnum.AUTO, "AIRBAG");
        Vehiculo veh4 = new Vehiculo(1234558L, "FORD Fusion", TipoEnum.AUTO, "AIRBAG");
        Vehiculo veh5 = new Vehiculo(1234558L, "FORD Fusion", TipoEnum.AUTO, "AIRBAG");


        Modelo modelo1 = new Modelo(54321L, "2006", Arrays.asList(veh1, veh2, veh3));
        Modelo modelo2 = new Modelo(54321L, "2007", Arrays.asList(veh4, veh5));

        Marca marca = new Marca(571810L, "FORD", Arrays.asList(modelo1, modelo2));

        return marca;
    }

}
