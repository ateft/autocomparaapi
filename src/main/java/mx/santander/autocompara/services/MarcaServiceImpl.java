package mx.santander.autocompara.services;

import mx.santander.autocompara.commons.MarcasDummy;
import mx.santander.autocompara.models.Marca;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Atef on 04/05/2017.
 */
@Service
public class MarcaServiceImpl implements MarcasService {

    private static final Log LOGGER = LogFactory.getLog(MarcaServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public List<Marca> getMarcas() {
        LOGGER.info("Returning Dummy list of Marcas");
        restTemplate.getForObject("http://localhost:8081/cotizaciones", String.class);
        return MarcasDummy.getMarcasMock();
    }

    @Override
    public Marca getMarcaById(Long id) {
        return MarcasDummy.getMarcaMock();
    }
}
