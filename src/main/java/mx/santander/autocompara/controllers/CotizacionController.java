package mx.santander.autocompara.controllers;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.santander.autocompara.models.Cotizacion;
import mx.santander.autocompara.models.CotizacionRequest;
import mx.santander.autocompara.services.CotizacionService;

@RestController
@CrossOrigin(maxAge = 3600)
public class CotizacionController {

	private static final Logger LOGGER = Logger.getLogger(CotizacionController.class.getName());


	@Autowired
	private CotizacionService cotizacionService;
	
	@RequestMapping(value="/cotizaciones", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public List<Cotizacion> cotizar(){
		LOGGER.info("Call /Cotizaciones service");
		return cotizacionService.getCotizaciones();
	}
}
