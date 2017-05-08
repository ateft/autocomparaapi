package mx.santander.autocompara.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import mx.santander.autocompara.models.Marca;
import mx.santander.autocompara.services.MarcasService;

/**
 * Created by Atef on 04/05/2017.
 */

@RestController
@Api(value = "marcasService", description = "Marcas services")

public class MarcasController {

    @Autowired
    private MarcasService marcasService;

    @RequestMapping(value = "/marcas", method = RequestMethod.GET)
    public List<Marca> getMarcas(){
        return marcasService.getMarcas();
    }

    @RequestMapping(value = "/marcas/{id}" , method = RequestMethod.GET)
    public Marca getMarcaById(@PathVariable Long id){
        return marcasService.getMarcaById(id);
    }

}
