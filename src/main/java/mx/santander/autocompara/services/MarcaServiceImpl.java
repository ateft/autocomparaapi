package mx.santander.autocompara.services;

import mx.santander.autocompara.commons.MarcasDummy;
import mx.santander.autocompara.models.Marca;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Atef on 04/05/2017.
 */
@Service
public class MarcaServiceImpl implements MarcasService {
    @Override
    public List<Marca> getMarcas() {
        return MarcasDummy.getMarcasMock();
    }

    @Override
    public Marca getMarcaById(Long id) {
        return MarcasDummy.getMarcaMock();
    }
}
