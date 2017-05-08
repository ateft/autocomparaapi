package mx.santander.autocompara.commons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Atef on 04/05/2017.
 */
@Component
public class PropertiesAutocompara {

    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }
}
