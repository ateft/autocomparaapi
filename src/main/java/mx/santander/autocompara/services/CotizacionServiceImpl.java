package mx.santander.autocompara.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.santander.autocompara.models.Cotizacion;
import mx.santander.autocompara.models.CotizacionRequest;

@Service
public class CotizacionServiceImpl implements CotizacionService {

	public List<Cotizacion> getCotizaciones() {
		return new ArrayList<>();
	}

}
