package cl.apiandroid.ucentral.bo;

import cl.apiandroid.ucentral.dto.Persona;

import java.util.List;

/**
 * Created by xfce on 29-04-14.
 */
public interface IPersonaBO {
    Persona personaId(Persona persona);
    List<Persona> selectAll();
    void save(Persona persona);
    void delete(Persona persona);
}
