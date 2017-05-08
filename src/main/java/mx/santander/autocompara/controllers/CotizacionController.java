package mx.santander.autocompara.controllers;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.santander.autocompara.models.Cotizacion;
import mx.santander.autocompara.models.CotizacionRequest;
import mx.santander.autocompara.services.CotizacionService;

@RestController
public class CotizacionController {
	
	@Autowired
	private CotizacionService cotizacionService;
	
	@RequestMapping(value="/cotizaciones", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON, produces=MediaType.APPLICATION_JSON)
	public List<Cotizacion> cotizar(@RequestBody(required=true) CotizacionRequest cotizacionRequest){
		return cotizacionService.getCotizaciones(cotizacionRequest);
	}
}
