package mx.santander.autocompara.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import mx.santander.autocompara.models.Marca;
import mx.santander.autocompara.services.MarcasService;

/**
 * Created by Atef on 04/05/2017.
 */

@RestController
@CrossOrigin(maxAge = 3600)
@Api(value = "marcasService", description = "Marcas services")
public class MarcasController {

    private static final Logger LOGGER = Logger.getLogger(MarcasController.class.getName());

    @Autowired
    private MarcasService marcasService;

    @RequestMapping(value = "/marcas", method = RequestMethod.GET)
    public List<Marca> getMarcas(){
        LOGGER.log(Level.INFO, "Calling '/marcas' service");
        return marcasService.getMarcas();
    }

    @RequestMapping(value = "/marcas/{id}" , method = RequestMethod.GET)
    public Marca getMarcaById(@PathVariable Long id){
        return marcasService.getMarcaById(id);
    }



}
