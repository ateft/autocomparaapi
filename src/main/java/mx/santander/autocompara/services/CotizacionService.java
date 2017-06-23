package mx.santander.autocompara.services;

import java.util.List;

import mx.santander.autocompara.models.Cotizacion;
import mx.santander.autocompara.models.CotizacionRequest;

public interface CotizacionService {
	
	public List<Cotizacion> getCotizaciones();
}
