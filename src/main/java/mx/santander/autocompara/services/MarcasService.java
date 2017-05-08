package mx.santander.autocompara.services;

import mx.santander.autocompara.models.Marca;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Atef on 04/05/2017.
 */
public interface MarcasService {

    public List<Marca> getMarcas();

    public Marca getMarcaById(Long id);
}
