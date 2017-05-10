package mx.santander.autocompara.controllers;

import io.swagger.annotations.Api;
import mx.santander.autocompara.commons.MarcasDummy;
import mx.santander.autocompara.commons.PropertiesAutocompara;
import mx.santander.autocompara.models.Marca;
import mx.santander.autocompara.services.MarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Atef on 04/05/2017.
 */

@RestController
@Api(value = "marcasService", description = "Marcas services")
public class MarcasController {

    @Autowired
    private MarcasService marcasService;

    @Autowired
    private PropertiesAutocompara propertiesAutocompara;

    @RequestMapping(value = "/marcas", method = RequestMethod.GET)
    public List<Marca> getMarcas(){
        return marcasService.getMarcas();
    }

    @RequestMapping(value = "/marcas/{id}" , method = RequestMethod.GET)
    public Marca getMarcaById(@PathVariable Long id){
        return marcasService.getMarcaById(id);
    }

}
